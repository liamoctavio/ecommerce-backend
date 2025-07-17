package com.ecommerce.ecommerce_backend.service.impl;

import com.ecommerce.ecommerce_backend.dto.InventarioDTO;
import com.ecommerce.ecommerce_backend.dto.VentaDTO;
import com.ecommerce.ecommerce_backend.model.Promocion;
import com.ecommerce.ecommerce_backend.repository.PromocionRepository;
import com.ecommerce.ecommerce_backend.util.DatosAcumulados;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class KafkaPromocionConsumerServiceImpl {

    @Autowired
    private PromocionRepository promocionRepository;

    private ConcurrentHashMap<String, DatosAcumulados> buffer = new ConcurrentHashMap<>();

    @KafkaListener(topics = "inventario-topic", groupId = "ecommerce-group")
    public void escucharInventario(ConsumerRecord<String, InventarioDTO> record) {
        InventarioDTO inventario = record.value();
        if (inventario == null || inventario.getProducto() == null) return;

        String productoId = inventario.getProducto();
        buffer.putIfAbsent(productoId, new DatosAcumulados());
        DatosAcumulados datos = buffer.get(productoId);

        datos.setStock(inventario.getCantidad());

        procesarSiCompleto(productoId, datos);
    }

    @KafkaListener(topics = "ventas-topic", groupId = "ecommerce-group")
    public void escucharVentas(ConsumerRecord<String, VentaDTO> record) {
        VentaDTO venta = record.value();
        if (venta == null || venta.getProducto() == null) return;

        String productoId = venta.getProducto();
        buffer.putIfAbsent(productoId, new DatosAcumulados());
        DatosAcumulados datos = buffer.get(productoId);


        datos.setVentas(datos.getVentas() == null ? 1 : datos.getVentas() + 1);

        if (venta.getMonto() > 0 && datos.getNombreProducto() == null) {
            datos.setNombreProducto("Producto " + productoId);
        }

        procesarSiCompleto(productoId, datos);
    }

    private void procesarSiCompleto(String productoId, DatosAcumulados datos) {
        if (!datos.tieneAmbosDatos()) return;

        boolean activar = datos.getStock() >= 50 && datos.getVentas() >= 100;

        Promocion promocion = new Promocion();
        promocion.setProductoId(productoId);
        promocion.setNombreProducto(datos.getNombreProducto() != null ? datos.getNombreProducto() : productoId);
        promocion.setStock(datos.getStock());
        promocion.setVentas(datos.getVentas());
        promocion.setActiva(activar);
        promocion.setFechaCreacion(LocalDateTime.now());

        promocionRepository.save(promocion);

        System.out.println("Promoción creada para producto " + productoId + " | Activa: " + activar);

        buffer.remove(productoId);
    }
}
