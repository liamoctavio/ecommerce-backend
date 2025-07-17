package com.ecommerce.ecommerce_backend.dto;

import java.io.Serializable;

public class PromocionDTO implements Serializable {
    private String productoId;
    private String nombreProducto;
    private int stockDisponible;
    private int ventasTotales;

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
    public int getStockDisponible() {
        return stockDisponible;
    }
    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }
    public int getVentasTotales() {
        return ventasTotales;
    }
    public void setVentasTotales(int ventasTotales) {
        this.ventasTotales = ventasTotales;
    }
}
