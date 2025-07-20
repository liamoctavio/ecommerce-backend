package com.ecommerce.ecommerce_backend.service.producers.impl;

import com.ecommerce.ecommerce_backend.dto.VentaDTO;
import com.ecommerce.ecommerce_backend.service.producers.KafkaVentasProducerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaVentasProducerServiceImpl implements KafkaVentasProducerService {

    @Autowired
    private KafkaTemplate<String, VentaDTO> kafkaTemplate;

    @Override
    public void enviarVenta(VentaDTO venta) {
        kafkaTemplate.send("ventas-topic", venta);
        System.out.println("Venta enviada a Kafka: " + venta);
    }
}

