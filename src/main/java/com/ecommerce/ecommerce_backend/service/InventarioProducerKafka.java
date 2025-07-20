// package com.ecommerce.ecommerce_backend.service;

// import com.ecommerce.ecommerce_backend.dto.InventarioDTO;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.kafka.core.KafkaTemplate;
// import org.springframework.stereotype.Service;

// @Service
// public class InventarioProducerKafka {

//      private static final String TOPIC = "inventario-topic";

//     @Autowired
//     private KafkaTemplate<String, InventarioDTO> kafkaTemplate;

//     public void enviarInventario(InventarioDTO dto) {
//         System.out.println(" Enviando inventario a Kafka: " + dto);
//         kafkaTemplate.send(TOPIC, dto);
//     }

// }
