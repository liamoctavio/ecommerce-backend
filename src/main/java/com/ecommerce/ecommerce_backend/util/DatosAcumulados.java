package com.ecommerce.ecommerce_backend.util;

public class DatosAcumulados {
    private Integer stock;
    private Integer ventas;
    private String nombreProducto;

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getVentas() {
        return ventas;
    }

    public void setVentas(Integer ventas) {
        this.ventas = ventas;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public boolean tieneAmbosDatos() {
        return stock != null && ventas != null;
    }
}
