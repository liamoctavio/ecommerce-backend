// package com.ecommerce.ecommerce_backend.service;

// import org.springframework.amqp.rabbit.core.RabbitTemplate;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.ecommerce.ecommerce_backend.dto.InventarioDTO;

// @Service
// public class InventarioProducer {

//     @Autowired
//     private RabbitTemplate rabbitTemplate;

//     public void enviarInventario(InventarioDTO dto) {
//         System.out.println(" Enviando inventario a RabbitMQ: " + dto);
//         rabbitTemplate.convertAndSend("inventarioQueue", dto);
//     }

// }
