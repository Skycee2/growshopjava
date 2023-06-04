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
public class DetallePago {

    private int id_detalle_pago;
    private int id_pedido;
    private int monto;
    private String estado;

    public DetallePago() {
    }

    public DetallePago(int id_detalle_pago, int id_pedido, int monto, String estado) {
        this.id_detalle_pago = id_detalle_pago;
        this.id_pedido = id_pedido;
        this.monto = monto;
        this.estado = estado;
    }

    public int getId_detalle_pago() {
        return id_detalle_pago;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public int getMonto() {
        return monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setId_detalle_pago(int id_detalle_pago) {
        this.id_detalle_pago = id_detalle_pago;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
