/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adip.interfazsai.clientRest;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author enrique
 */
public class RequestUtil {
    Client client;
    String url;
    WebTarget target;

    public RequestUtil() {
        this.client = ClientBuilder.newClient();
        this.url = "https://sai.cdmx.gob.mx/api/v1/estados/?format=json";
        this.target = client.target(url);
    }
    
    public void getEstados() {
        Response response = this.target.request(MediaType.APPLICATION_JSON).get();
        System.out.println("response.toString()" + response.getEntity());
        System.out.println("Status " + response.getStatus());
    }
    
}
