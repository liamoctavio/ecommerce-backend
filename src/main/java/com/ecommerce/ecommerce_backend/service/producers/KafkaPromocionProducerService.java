package com.ecommerce.ecommerce_backend.service.producers;

import com.ecommerce.ecommerce_backend.dto.PromocionDTO;

public interface KafkaPromocionProducerService {
    void enviarPromocion(PromocionDTO dto);
}

