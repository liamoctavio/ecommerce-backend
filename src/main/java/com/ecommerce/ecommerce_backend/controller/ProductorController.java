package com.ecommerce.ecommerce_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce_backend.service.ProductorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProductorController {

    @Autowired
    private ProductorService producer;

    @PostMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        //TODO: process POST request
        producer.sendMessage(message);
        return "Mensaje enviado" + message;
    }
    

}
