// package com.ecommerce.ecommerce_backend.controller;

// import java.time.LocalDateTime;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// import com.ecommerce.ecommerce_backend.dto.PromocionDTO;
// import com.ecommerce.ecommerce_backend.service.PromocionesProducer;

// @RestController
// @RequestMapping("/promociones")
// public class PromocionesController {

//     @Autowired
//     private PromocionesProducer promocionesProducer;

//     @PostMapping("/nueva")
//     public String enviarPromocion(@RequestParam String titulo, @RequestParam String descripcion) {
//         PromocionDTO promo = new PromocionDTO();
//         promo.setTitulo(titulo);
//         promo.setDescripcion(descripcion);
//         promo.setFechaInicio(LocalDateTime.now());
//         promo.setFechaFin(LocalDateTime.now().plusDays(7));

//         promocionesProducer.enviarPromocion(promo);
//         return "✅ Promoción enviada a RabbitMQ.";
//     }

// }
