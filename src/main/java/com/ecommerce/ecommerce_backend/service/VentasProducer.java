package com.ecommerce.ecommerce_backend.service;

import com.ecommerce.ecommerce_backend.dto.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VentasProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviarVenta(VentaDTO venta) {
        rabbitTemplate.convertAndSend("ventasQueue", venta);
        System.out.println("Venta enviada a RabbitMQ: " + venta);
    }

}
