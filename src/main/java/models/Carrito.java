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
public class Carrito {
    private int id_carrito;
    private int id_usuario;
    private int total;

    public Carrito() {
    }

    public Carrito(int id_carrito, int id_usuario, int total) {
        this.id_carrito = id_carrito;
        this.id_usuario = id_usuario;
        this.total = total;
    }

    public int getId_carrito() {
        return id_carrito;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public int getTotal() {
        return total;
    }

    public void setId_carrito(int id_carrito) {
        this.id_carrito = id_carrito;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
