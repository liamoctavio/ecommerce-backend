package com.ecommerce.ecommerce_backend.dto;

public class InventarioDTO {

    private String producto;
    private int cantidad;

    public InventarioDTO() {
    }

    public InventarioDTO(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "InventarioDTO{" +
                "producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

}
