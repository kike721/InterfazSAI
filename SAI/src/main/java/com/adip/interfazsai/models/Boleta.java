/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adip.interfazsai.models;

import java.io.File;

/**
 *
 * @author enrique
 */
public class Boleta {
    private File boleta_anverso;
    private File boleta_reverso;

    public Boleta() {
    }

    public Boleta(File boleta_anverso, File boleta_reverso) {
        this.boleta_anverso = boleta_anverso;
        this.boleta_reverso = boleta_reverso;
    }

    public File getBoleta_anverso() {
        return boleta_anverso;
    }

    public File getBoleta_reverso() {
        return boleta_reverso;
    }

    public void setBoleta_anverso(File boleta_anverso) {
        this.boleta_anverso = boleta_anverso;
    }

    public void setBoleta_reverso(File boleta_reverso) {
        this.boleta_reverso = boleta_reverso;
    }
}
