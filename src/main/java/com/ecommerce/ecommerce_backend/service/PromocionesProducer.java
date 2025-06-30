package com.ecommerce.ecommerce_backend.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.web.server.ServerSecurityMarker;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce_backend.dto.PromocionDTO;

@Service
public class PromocionesProducer {

    private static final String QUEUE_NAME = "promocionesQueue";

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviarPromocion(PromocionDTO promocion) {
        rabbitTemplate.convertAndSend(QUEUE_NAME, promocion);
        System.out.println("Promoción enviada a RabbitMQ: " + promocion);
    }

}
