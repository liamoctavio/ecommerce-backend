package com.ecommerce.ecommerce_backend.service.impl;

import com.ecommerce.ecommerce_backend.config.KafkaInventarioConsumerConfig;
import com.ecommerce.ecommerce_backend.dto.InventarioDTO;
import com.ecommerce.ecommerce_backend.service.KafkaInventarioConsumerService;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.TopicPartition;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class KafkaInventarioConsumerServiceImpl implements KafkaInventarioConsumerService {

    @Override
    @KafkaListener(
        topics = KafkaInventarioConsumerConfig.TOPIC,
        groupId = KafkaInventarioConsumerConfig.CONSUMER_GROUP_ID,
        containerFactory = "inventarioKafkaListenerContainerFactory")
    public void procesarInventario(InventarioDTO dto, Acknowledgment ack) {
        try {
            System.out.println("Consumido desde Kafka: " + dto);
            // Simular procesamiento
            Thread.sleep(1000);
            ack.acknowledge();
        } catch (Exception e) {
            System.err.println("Error procesando InventarioDTO");
            e.printStackTrace();
        }
    }
}