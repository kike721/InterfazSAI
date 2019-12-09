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
public class ErrorLogin {
    @JsonProperty("detail")
    private String detail;

    public ErrorLogin() {
    }

    public ErrorLogin(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    
}
