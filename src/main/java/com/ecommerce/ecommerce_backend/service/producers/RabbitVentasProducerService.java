package com.ecommerce.ecommerce_backend.service.producers;

import com.ecommerce.ecommerce_backend.dto.VentaDTO;

public interface RabbitVentasProducerService {
    void enviarVenta(VentaDTO dto);
}
