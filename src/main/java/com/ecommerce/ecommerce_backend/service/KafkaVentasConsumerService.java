package com.ecommerce.ecommerce_backend.service;

import com.ecommerce.ecommerce_backend.dto.VentaDTO;
import org.springframework.kafka.support.Acknowledgment;

public interface KafkaVentasConsumerService {
    void procesarVenta(VentaDTO dto, Acknowledgment ack);
}

