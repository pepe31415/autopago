package com.example.autopago.model;

import java.math.BigDecimal;

public class Producto {
    private String codigoBarras;
    private String nombre;
    private BigDecimal precio;

    public Producto(String codigoBarras, String nombre, String precio) {
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.precio = new BigDecimal(precio);
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }
}
