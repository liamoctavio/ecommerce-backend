package com.ecommerce.ecommerce_backend.controller;

import com.ecommerce.ecommerce_backend.model.Promocion;
import com.ecommerce.ecommerce_backend.repository.PromocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promociones")
public class PromocionController {

    @Autowired
    private PromocionRepository promocionRepository;

    @GetMapping("/activas")
    public List<Promocion> obtenerPromocionesActivas() {
        return promocionRepository.findByActivaTrue();
    }
}
