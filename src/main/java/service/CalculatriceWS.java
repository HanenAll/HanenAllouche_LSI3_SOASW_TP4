package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class CalculatriceWS {
    @WebMethod
    public double Somme(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }
}