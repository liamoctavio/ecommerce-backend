package com.ecommerce.ecommerce_backend.service.producers;

import com.ecommerce.ecommerce_backend.dto.InventarioDTO;

public interface RabbitInventarioProducerService {
    void enviarInventario(InventarioDTO dto);
}
