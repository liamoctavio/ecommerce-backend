package com.ecommerce.ecommerce_backend.service.producers.impl;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce_backend.dto.VentaDTO;
import com.ecommerce.ecommerce_backend.service.producers.RabbitVentasProducerService;

@Service
public class RabbitVentasProducerServiceImpl implements RabbitVentasProducerService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviarVenta(VentaDTO venta) {
        rabbitTemplate.convertAndSend("ventasQueue", venta);
        System.out.println("Venta enviada a RabbitMQ: " + venta);
    }

}
