package com.ecommerce.ecommerce_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce_backend.dto.InventarioDTO;
import com.ecommerce.ecommerce_backend.service.InventarioProducer;


@RestController
@RequestMapping("/inventario")
public class InventarioController {

    @Autowired
    private InventarioProducer inventarioProducer;

    @PostMapping("/actualizar")
    public String actualizarInventario(@RequestParam String producto, @RequestParam int cantidad) {
        InventarioDTO dto = new InventarioDTO(producto, cantidad);
        inventarioProducer.enviarInventario(dto);
        return "📦 Inventario enviado a RabbitMQ.";
    }

}
