package com.ecommerce.ecommerce_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.ecommerce_backend.model.Inventario;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {

}
