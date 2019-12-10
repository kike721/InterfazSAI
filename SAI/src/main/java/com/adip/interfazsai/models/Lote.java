/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adip.interfazsai.models;

/**
 *
 * @author enrique
 */
public class Lote {
    private String nombre;
    private String emision;
    private int estatus;

    public Lote() {
    }

    public Lote(String nombre, String emision, int estatus) {
        this.nombre = nombre;
        this.emision = emision;
        this.estatus = estatus;
    }

    public String getEmision() {
        return emision;
    }

    public int getEstatus() {
        return estatus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEmision(String emision) {
        this.emision = emision;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
