package com.ecommerce.ecommerce_backend.controller;

import java.time.LocalDateTime;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce_backend.dto.VentaDTO;
import com.ecommerce.ecommerce_backend.service.producers.RabbitVentasProducerService;

import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/ventas")
public class VentasController {

    @Autowired
    private RabbitVentasProducerService ventasProducer;

    @PostMapping("/nueva")
    public String registrarVenta(@RequestParam String producto, @RequestParam double monto) {
        VentaDTO venta = new VentaDTO(producto, monto,
            LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        ventasProducer.enviarVenta(venta);
        return "Venta registrada: " + producto + " por $" + monto;
    }

  
}
