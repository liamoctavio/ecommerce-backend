package com.ecommerce.ecommerce_backend.dto;

import java.time.LocalDateTime;

public class PromocionDTO {

    private String titulo;
    private String descripcion;
    private double descuento; // porcentaje (ej: 15.0)
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    // Constructor vacío
    public PromocionDTO() {
    }

    // Constructor con parámetros
    public PromocionDTO(String titulo, String descripcion, double descuento, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.descuento = descuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "PromocionDTO{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", descuento=" + descuento +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }

}
