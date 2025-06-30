package com.ecommerce.ecommerce_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VentaDTO {

    private String producto;
    private double monto;
    private String fecha;

}
