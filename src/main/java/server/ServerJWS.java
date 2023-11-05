package server;

import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;

public class ServerJWS {
    public static void main(String[] args) {
        String url ="http://localhost:8084/";
        Endpoint.publish(url,new CalculatriceWS());
        System.out.println(url);
    }
}