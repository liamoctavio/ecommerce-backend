package com.ecommerce.ecommerce_backend.repository;

import com.ecommerce.ecommerce_backend.model.Promocion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PromocionRepository extends JpaRepository<Promocion, Long> {
    List<Promocion> findByActivaTrue();
}
