package com.ecommerce.ecommerce_backend.service;

import com.ecommerce.ecommerce_backend.dto.PromocionDTO;

public interface KafkaPromocionProducerService {
    void enviarPromocion(PromocionDTO dto);
}

