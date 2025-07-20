package com.ecommerce.ecommerce_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce_backend.dto.InventarioDTO;
import com.ecommerce.ecommerce_backend.service.producers.KafkaInventarioProducerService;


@RestController
@RequestMapping("/inventario")
public class InventarioControllerKafka {

    @Autowired
    private KafkaInventarioProducerService kafkaProducer;

    @PostMapping("/enviar")
    public String enviarInventario(@RequestBody InventarioDTO dto) {
        kafkaProducer.enviarInventario(dto);
        return "Inventario enviado correctamente a Kafka";
    }
}

