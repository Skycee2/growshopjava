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
public class Comuna {

    private int id_comuna;
    private String desc_comuna;

    public Comuna() {
    }

    public Comuna(int id_comuna, String desc_comuna) {
        this.id_comuna = id_comuna;
        this.desc_comuna = desc_comuna;
    }

    public int getId_comuna() {
        return id_comuna;
    }

    public String getDesc_comuna() {
        return desc_comuna;
    }

    public void setId_comuna(int id_comuna) {
        this.id_comuna = id_comuna;
    }

    public void setDesc_comuna(String desc_comuna) {
        this.desc_comuna = desc_comuna;
    }
}
