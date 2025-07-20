package com.ecommerce.ecommerce_backend.controller;

import com.ecommerce.ecommerce_backend.dto.InventarioDTO;
import com.ecommerce.ecommerce_backend.dto.VentaDTO;
import com.ecommerce.ecommerce_backend.dto.PromocionDTO;
import com.ecommerce.ecommerce_backend.service.producers.KafkaInventarioProducerService;
import com.ecommerce.ecommerce_backend.service.producers.KafkaPromocionProducerService;
import com.ecommerce.ecommerce_backend.service.producers.KafkaVentasProducerService;
import com.ecommerce.ecommerce_backend.service.producers.RabbitInventarioProducerService;
import com.ecommerce.ecommerce_backend.service.producers.RabbitVentasProducerService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BffController {

    private final KafkaInventarioProducerService inventarioProducer;
    private final KafkaVentasProducerService ventasProducer;
    private final KafkaPromocionProducerService promocionProducer;
    private final RabbitVentasProducerService rabbitVentasProducer;
    private final RabbitInventarioProducerService rabbitInventarioProducer;

    @PostMapping("/inventario/enviar")
    public ResponseEntity<String> enviarInventario(@RequestBody InventarioDTO dto) {
        rabbitInventarioProducer.enviarInventario(dto); //RabbitMQ
        inventarioProducer.enviarInventario(dto); //Kafka
        return ResponseEntity.ok("Inventario enviado a Kafka");
    }

    @PostMapping("/ventas/enviar")
    public ResponseEntity<String> enviarVenta(@RequestBody VentaDTO dto) {
        rabbitVentasProducer.enviarVenta(dto); //RabbitMQ
        ventasProducer.enviarVenta(dto); //Kafka
        return ResponseEntity.ok("Venta enviada a Kafka");
    }

    @PostMapping("/promociones/enviar")
    public ResponseEntity<String> enviarPromocion(@RequestBody PromocionDTO dto) {
        promocionProducer.enviarPromocion(dto);
        return ResponseEntity.ok("Promoción enviada a Kafka");
    }
}