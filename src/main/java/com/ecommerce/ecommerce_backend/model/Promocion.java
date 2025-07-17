package com.ecommerce.ecommerce_backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "promocion")
public class Promocion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productoId;
    private String nombreProducto;
    private int stock;
    private int ventas;
    private boolean activa;
    private LocalDateTime fechaCreacion;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getProductoId() {
        return productoId;
    }
    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getVentas() {
        return ventas;
    }
    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    public boolean isActiva() {
        return activa;
    }
    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    // Getters y Setters

    
}

