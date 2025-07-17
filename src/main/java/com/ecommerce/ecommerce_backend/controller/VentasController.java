// package com.ecommerce.ecommerce_backend.controller;

// import java.time.LocalDateTime;

// import org.springframework.amqp.rabbit.annotation.RabbitListener;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// import com.ecommerce.ecommerce_backend.dto.VentaDTO;
// import com.ecommerce.ecommerce_backend.model.Venta;
// import com.ecommerce.ecommerce_backend.service.VentasProducer;

// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// import com.ecommerce.ecommerce_backend.repository.VentaRepository;
// @RestController
// @RequestMapping("/ventas")
// public class VentasController {

//     @Autowired
//     private VentasProducer ventasProducer;

//     @PostMapping("/nueva")
//     public String registrarVenta(@RequestParam String producto, @RequestParam double monto) {
//         VentaDTO venta = new VentaDTO(producto, monto,
//             LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
//         ventasProducer.enviarVenta(venta);
//         return "Venta registrada: " + producto + " por $" + monto;
//     }

  
// }
