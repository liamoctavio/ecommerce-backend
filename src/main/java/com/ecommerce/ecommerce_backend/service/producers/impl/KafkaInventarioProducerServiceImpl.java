package com.ecommerce.ecommerce_backend.service.producers.impl;

import com.ecommerce.ecommerce_backend.dto.InventarioDTO;
import com.ecommerce.ecommerce_backend.service.producers.KafkaInventarioProducerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaInventarioProducerServiceImpl implements KafkaInventarioProducerService {

    @Autowired
    private KafkaTemplate<String, InventarioDTO> kafkaTemplate;

    @Override
    public void enviarInventario(InventarioDTO dto) {
        System.out.println("Enviando inventario a Kafka: " + dto);
        kafkaTemplate.send("inventario-topic", 0, "", dto);
    }
}
