package com.ecommerce.ecommerce_backend.repository;

import com.ecommerce.ecommerce_backend.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
