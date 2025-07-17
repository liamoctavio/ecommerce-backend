// package com.ecommerce.ecommerce_backend.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// import com.ecommerce.ecommerce_backend.dto.InventarioDTO;
// import com.ecommerce.ecommerce_backend.service.InventarioProducer;
// import com.ecommerce.ecommerce_backend.service.KafkaInventarioProducerService;



// @RestController
// @RequestMapping("/inventario")
// public class InventarioController {

//     @Autowired
//     private InventarioProducer inventarioProducer;

//     @Autowired
//     private KafkaInventarioProducerService kafkaInventarioProducerService;

//     @PostMapping("/actualizar")
//     public String actualizarInventario(@RequestParam String producto, @RequestParam int cantidad) {
//         InventarioDTO dto = new InventarioDTO(producto, cantidad);
//         inventarioProducer.enviarInventario(dto);
//         return "📦 Inventario enviado a RabbitMQ.";
//     }

//     @PostMapping("/enviar")
//     public String enviarInventario(@RequestBody InventarioDTO dto) {
//         kafkaInventarioProducerService.enviarInventario(dto);
//         return "Inventario enviado correctamente a Kafka";
//     }

    

// }
