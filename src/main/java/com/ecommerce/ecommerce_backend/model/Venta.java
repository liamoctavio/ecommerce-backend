package com.ecommerce.ecommerce_backend.model;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "ventas") // Asegúrate de que esta tabla exista en Oracle
@Data
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    private String producto;
    private double monto;
    private String fecha; 

}
