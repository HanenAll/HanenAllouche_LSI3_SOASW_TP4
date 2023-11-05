package server;

import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;

public class ServerJWS {
    public static void main(String[] args) {
        String url ="http://localhost:8084/";
        Endpoint.publish(url,new CalculatriceWS()); /* Endpoint.publish(..) me permet de faire le deployement
         de web service */
        System.out.println(url);
    }
}
