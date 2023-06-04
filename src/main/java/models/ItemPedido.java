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
public class ItemPedido {
    private int id_item_pedido;
    private int id_pedido;
    private int id_producto;
    private int cantidad;

    public ItemPedido() {
    }

    public ItemPedido(int id_item_pedido, int id_pedido, int id_producto, int cantidad) {
        this.id_item_pedido = id_item_pedido;
        this.id_pedido = id_pedido;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
    }

    public int getId_item_pedido() {
        return id_item_pedido;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setId_item_pedido(int id_item_pedido) {
        this.id_item_pedido = id_item_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
