package com.ecommerce.ecommerce_backend.service.impl;

import com.ecommerce.ecommerce_backend.dto.PromocionDTO;
import com.ecommerce.ecommerce_backend.service.KafkaPromocionProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaPromocionProducerServiceImpl implements KafkaPromocionProducerService {

    @Autowired
    private KafkaTemplate<String, PromocionDTO> kafkaTemplate;

    @Override
    public void enviarPromocion(PromocionDTO dto) {
        kafkaTemplate.send("promociones-topic", dto);
        System.out.println("Promoción enviada a Kafka: " + dto);
    }
}

