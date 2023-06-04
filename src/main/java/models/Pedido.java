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
public class Pedido {
    private int id_pedido;
    private int id_usuario;
    private int total;
    private int id_estado_pedido;
    private int id_detalle_pago;

    public Pedido() {
    }

    public Pedido(int id_pedido, int id_usuario, int total, int id_estado_pedido, int id_detalle_pago) {
        this.id_pedido = id_pedido;
        this.id_usuario = id_usuario;
        this.total = total;
        this.id_estado_pedido = id_estado_pedido;
        this.id_detalle_pago = id_detalle_pago;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public int getTotal() {
        return total;
    }

    public int getId_estado_pedido() {
        return id_estado_pedido;
    }

    public int getId_detalle_pago() {
        return id_detalle_pago;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setId_estado_pedido(int id_estado_pedido) {
        this.id_estado_pedido = id_estado_pedido;
    }

    public void setId_detalle_pago(int id_detalle_pago) {
        this.id_detalle_pago = id_detalle_pago;
    }
}
