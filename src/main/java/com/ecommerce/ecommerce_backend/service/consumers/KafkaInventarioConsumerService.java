package com.ecommerce.ecommerce_backend.service.consumers;

import org.springframework.kafka.support.Acknowledgment;

import com.ecommerce.ecommerce_backend.dto.InventarioDTO;

public interface KafkaInventarioConsumerService {
    void procesarInventario(InventarioDTO dto, Acknowledgment ack);
}
