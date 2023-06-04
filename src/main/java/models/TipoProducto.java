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
public class TipoProducto {

    private int id_tipo_producto;
    private String desc_tipo_producto;

    public TipoProducto() {
    }

    public TipoProducto(int id_tipo_producto, String desc_tipo_producto) {
        this.id_tipo_producto = id_tipo_producto;
        this.desc_tipo_producto = desc_tipo_producto;
    }

    public int getId_tipo_producto() {
        return id_tipo_producto;
    }

    public String getDesc_tipo_producto() {
        return desc_tipo_producto;
    }

    public void setId_tipo_producto(int id_tipo_producto) {
        this.id_tipo_producto = id_tipo_producto;
    }

    public void setDesc_tipo_producto(String desc_tipo_producto) {
        this.desc_tipo_producto = desc_tipo_producto;
    }
}
