package serveur;
import javax.xml.ws.Endpoint;

public class ServeurJWS {

    public static void main(String[] args) {
        // Spécifiez l'URL à laquelle le service web doit être publié
        String url = "http://localhost:8084/";

        // Créez une instance de votre service web
        // Remplacez ServiceWebImpl par le nom de votre classe d'implémentation de service web
        ServiceWebImpl service = new ServiceWebImpl();

        // Publiez le service web à l'URL spécifiée
        Endpoint.publish(url, service);

        // Affichez un message indiquant que le service a été publié avec succès
        System.out.println("Service web publié avec succès à l'adresse : " + url);
    }
}
