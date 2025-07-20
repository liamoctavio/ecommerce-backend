package com.ecommerce.ecommerce_backend.service.consumers;

import com.ecommerce.ecommerce_backend.dto.PromocionDTO;

public interface KafkaPromocionConsumerService {
    void recibirVenta(PromocionDTO dto);
    void recibirStock(PromocionDTO dto);
}
