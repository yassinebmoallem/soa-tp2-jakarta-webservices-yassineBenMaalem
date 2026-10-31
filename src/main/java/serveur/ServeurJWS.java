package serveur;

import jakarta.xml.ws.Endpoint;
import service.Calculatrice;

public class ServeurJWS {

    public static void main(String[] args) throws Exception {
        String url = "http://localhost:8080/calculatrice";
        Endpoint.publish(url, new Calculatrice());
        System.out.println("Le service est demarre sur : " + url + "?wsdl");
        System.in.read();
    }
}