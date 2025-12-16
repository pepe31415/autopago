package com.example.autopago.repositorios;

import com.example.autopago.model.Producto;

import java.util.List;

public class RepositorioProductos {
    private List<Producto> productos = List.of(
            new Producto("84123456","Botella Agua 50cl","0.78"),
            new Producto("8400000000001","Botella Agua 50cl","0.78"),
            new Producto("84000002","Botella Agua 50cl","0.78"),
            new Producto("84000003","Botella Agua 100cl","1.1"),
            new Producto("84000004","Bolsa patatas fritas","1.5"),
            new Producto("84000005","Golosinas variadas","2.4"),
            new Producto("84000006","Chocolate 200gr","3.5")
    );
    public Producto encuentraProducto(String codigoBarras) {
        for (Producto producto : productos) {
            if (producto.getCodigoBarras().equals(codigoBarras)) {
                return producto;
            }
        }
        return null;
    }
}
