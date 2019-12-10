/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adip.interfazsai.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author enrique
 */
public class Lote {
    
    @JsonProperty("id")
    private int id;
    
    @JsonProperty("deleted")
    private String deleted;
    
    @JsonProperty("nombre")
    private String nombre;
    
    @JsonProperty("emision")
    private String emision;
    
    @JsonProperty("estatus")
    private int estatus;
    
    @JsonProperty("created_at")
    private String created_at;
    
    @JsonProperty("updated_at")
    private String updated_at;

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

    public int getId() {
        return id;
    }

    public String getDeleted() {
        return deleted;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
