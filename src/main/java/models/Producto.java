/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author sebas
 */
public class Producto {
    private int id_producto;
    private String nombre;
    private int precio;
    private String descripcion;
    private String url_img;
    private int stock;
    private int id_tipo_producto;

    public Producto() {
    }

    public Producto(int id_producto, String nombre, int precio, String descripcion, String url_img, int stock, int id_tipo_producto) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.url_img = url_img;
        this.stock = stock;
        this.id_tipo_producto = id_tipo_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUrl_img() {
        return url_img;
    }

    public int getStock() {
        return stock;
    }

    public int getId_tipo_producto() {
        return id_tipo_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setId_tipo_producto(int id_tipo_producto) {
        this.id_tipo_producto = id_tipo_producto;
    }
}
