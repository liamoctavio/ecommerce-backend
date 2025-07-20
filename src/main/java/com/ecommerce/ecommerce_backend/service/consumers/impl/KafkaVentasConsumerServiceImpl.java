package com.ecommerce.ecommerce_backend.service.consumers.impl;

import com.ecommerce.ecommerce_backend.config.KafkaVentasConsumerConfig;
import com.ecommerce.ecommerce_backend.dto.VentaDTO;
import com.ecommerce.ecommerce_backend.service.consumers.KafkaVentasConsumerService;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class KafkaVentasConsumerServiceImpl implements KafkaVentasConsumerService {

    @Override
    @KafkaListener(
        topics = KafkaVentasConsumerConfig.TOPIC,
        groupId = KafkaVentasConsumerConfig.CONSUMER_GROUP_ID,
        containerFactory = "ventaKafkaListenerContainerFactory")
    public void procesarVenta(VentaDTO dto, Acknowledgment ack) {
        try {
            System.out.println("Kafka Venta recibida: " + dto);
            Thread.sleep(1000); // Simula procesamiento
            ack.acknowledge();
        } catch (Exception e) {
            System.err.println("Error procesando Venta");
            e.printStackTrace();
        }
    }
}
