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
public class ItemCarrito {

    private int id_item_carrito;
    private int id_carrito;
    private int id_producto;
    private int cantidad;

    public ItemCarrito() {
    }

    public ItemCarrito(int id_item_carrito, int id_carrito, int id_producto, int cantidad) {
        this.id_item_carrito = id_item_carrito;
        this.id_carrito = id_carrito;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
    }

    public int getId_item_carrito() {
        return id_item_carrito;
    }

    public int getId_carrito() {
        return id_carrito;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setId_item_carrito(int id_item_carrito) {
        this.id_item_carrito = id_item_carrito;
    }

    public void setId_carrito(int id_carrito) {
        this.id_carrito = id_carrito;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
