package serveur;
import service.CalculatriceWS;
import jakarta.xml.ws.Endpoint;

public class serveurjws {
        public static void main(String[] args) {
            String URL="http://localhost:8084/";

            CalculatriceWS C1 = new CalculatriceWS();
            Endpoint.publish(URL, C1);
            System.out.println(URL);
        }

    }

