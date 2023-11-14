package service;
import metier.Compte;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;
// Dans le package "service"
@WebService
public class BanqueService {

    @WebMethod
    public double conversion(@WebParam(name = "montant") double montant) {
        // Implémentation de la conversion
        // ...

        return convertedValue;
    }

    @WebMethod
    public List<Compte> getComptes() {
        // Implémentation pour récupérer la liste des comptes
        // ...

        return compteList;
    }
}
