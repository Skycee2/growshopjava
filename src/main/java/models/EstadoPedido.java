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
public class EstadoPedido {
    private int id_estado_pedido;
    private String desc_estado_pedido;

    public EstadoPedido() {
    }

    public EstadoPedido(int id_estado_pedido, String desc_estado_pedido) {
        this.id_estado_pedido = id_estado_pedido;
        this.desc_estado_pedido = desc_estado_pedido;
    }

    public int getId_estado_pedido() {
        return id_estado_pedido;
    }

    public String getDesc_estado_pedido() {
        return desc_estado_pedido;
    }

    public void setId_estado_pedido(int id_estado_pedido) {
        this.id_estado_pedido = id_estado_pedido;
    }

    public void setDesc_estado_pedido(String desc_estado_pedido) {
        this.desc_estado_pedido = desc_estado_pedido;
    }
}
