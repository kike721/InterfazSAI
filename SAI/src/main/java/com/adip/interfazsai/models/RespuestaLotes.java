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
public class RespuestaLotes {
    @JsonProperty("count")
    private int count;
    
    @JsonProperty("next")
    private String next;
    
    @JsonProperty("previous")
    private String previous;
    
    @JsonProperty("results")
    private Lote results[];

    public RespuestaLotes() {
    }

    public RespuestaLotes(int count, String next, String previous, Lote[] results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public Lote[] getResults() {
        return results;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public void setResults(Lote[] results) {
        this.results = results;
    }
}
