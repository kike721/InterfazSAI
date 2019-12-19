/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adip.interfazsai.clientRest;
import com.adip.interfazsai.models.Boleta;
import com.adip.interfazsai.models.Lote;
import com.adip.interfazsai.models.Token;
import com.adip.interfazsai.models.User;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.glassfish.jersey.media.multipart.MultiPart;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.media.multipart.file.FileDataBodyPart;

/**
 *
 * @author enrique
 */
public class RequestUtil {
    private Client client;
    private String url;
    private WebTarget target;
    private FormDataMultiPart multiPart;

    public RequestUtil() {
        this.initialClient(false);
    }
    
    public RequestUtil(Boolean isMultipart) {
        this.initialClient(isMultipart);
    }

    public Client getClient() {
        return client;
    }

    public WebTarget getTarget() {
        return target;
    }

    public String getUrl() {
        return url;
    }

    public FormDataMultiPart getMultiPart() {
        return multiPart;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setTarget(WebTarget target) {
        this.target = target;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMultiPart(FormDataMultiPart multiPart) {
        this.multiPart = multiPart;
    }
    
    public void initialClient(Boolean isMultiPart) {
        if (isMultiPart) {
            this.setClient(ClientBuilder.newBuilder()
            .register(MultiPartFeature.class).build());
            FormDataMultiPart multiPart = new FormDataMultiPart();
            multiPart.setMediaType(MediaType.MULTIPART_FORM_DATA_TYPE);
            this.setMultiPart(multiPart);
        } else {
            this.setClient(ClientBuilder.newClient());
        }
        // Ambiente local
        // this.setUrl("http://localhost:8000/api/v1/");
        // Ambiente de pruebas
        // this.setUrl("https://sai.adiphub.mx/api/v1/");
        // Ambiente produccion
        this.setUrl("https://sai.cdmx.gob.mx/api/v1/");
    }
    
    public void getEstados(String token) {
        this.setTarget(client.target(this.getUrl() + "estados/"));
        Response response = this.target
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", token).get();
    }
    
    public Response login(User user) {
        this.setTarget(client.target(this.getUrl() + "token/"));
        Response response = this.target
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(user, MediaType.APPLICATION_JSON));
        return response;
    }
    
    public Response crearBoletas(Boleta boleta, Lote lote, String token) {
        this.setTarget(client.target(this.getUrl() + "boletas/"));
        FileDataBodyPart boleta_anverso = new FileDataBodyPart("boleta_anverso",
            boleta.getBoleta_anverso(),
            MediaType.APPLICATION_OCTET_STREAM_TYPE);
        FileDataBodyPart boleta_reverso = new FileDataBodyPart("boleta_reverso",
            boleta.getBoleta_reverso(),
            MediaType.APPLICATION_OCTET_STREAM_TYPE);
        FormDataMultiPart multiPart = this.getMultiPart();
        multiPart.bodyPart(boleta_anverso);
        multiPart.bodyPart(boleta_reverso);
        multiPart.field("lote", String.valueOf(lote.getId()));
        Response response = this.target
                .request(MediaType.APPLICATION_JSON_TYPE)
                .header("Authorization", token)
                .post(Entity.entity(multiPart, multiPart.getMediaType()));
        return response;
    }
    
    public Response crearLote(Lote lote, String token) {
        this.setTarget(client.target(this.getUrl() + "lote/"));
        Response response = this.target
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", token)
                .post(Entity.entity(lote, MediaType.APPLICATION_JSON));
        return response;
    }
    
    public Response getLotes(String token) {
        this.setTarget(client.target(this.getUrl() + "lote/?estatus=2"));
        Response response = this.target
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", token).get();
        return response;
    }
    
}
