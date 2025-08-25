package service;

import model.Contrat;
import exception.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ContratService {
    private List<Contrat> contrats = new ArrayList<>();

    public void ajouterContrat(Contrat contrat) {
        contrats.add(contrat);
        System.out.println("✅ Contrat ajouté pour le marché : " + contrat.getMarche().getTitre());
    }

    public void afficherContrats() {
        if (contrats.isEmpty()) {
            System.out.println("Aucun contrat disponible.");
        } else {
            contrats.forEach(System.out::println);
        }
    }

    // Rechercher un contrat par le marché
    public Contrat rechercherContrat(String titreMarche) throws EntityNotFoundException {
        for (Contrat c : contrats) {
            if (c.getMarche().getTitre().equalsIgnoreCase(titreMarche)) {
                return c;
            }
        }
        throw new EntityNotFoundException("Contrat pour le marché '" + titreMarche + "' non trouvé.");
    }
}
