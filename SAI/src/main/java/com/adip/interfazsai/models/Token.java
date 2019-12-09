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
public class Token {
    @JsonProperty("refresh")
    private String refresh;
    
    @JsonProperty("access")
    private String access;

    public Token() {
    }
    
    public Token(String refresh, String access) {
        this.refresh = refresh;
        this.access = access;
    }

    public String getAccess() {
        return access;
    }

    public String getRefresh() {
        return refresh;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }    
    
}
