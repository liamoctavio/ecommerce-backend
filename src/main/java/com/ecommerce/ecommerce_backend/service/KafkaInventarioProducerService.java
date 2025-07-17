package com.ecommerce.ecommerce_backend.service;

import com.ecommerce.ecommerce_backend.dto.InventarioDTO;

public interface KafkaInventarioProducerService {
    void enviarInventario(InventarioDTO dto);
}