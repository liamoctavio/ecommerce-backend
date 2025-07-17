package com.ecommerce.ecommerce_backend.controller;

import com.ecommerce.ecommerce_backend.dto.VentaDTO;
import com.ecommerce.ecommerce_backend.service.KafkaVentasProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private KafkaVentasProducerService kafkaVentasProducerService;

    @PostMapping("/enviar")
    public String enviarVenta(@RequestBody VentaDTO ventaDTO) {
        kafkaVentasProducerService.enviarVenta(ventaDTO);
        return "Venta enviada a Kafka.";
    }
}
