package service;

import model.MarchePublic;
import exception.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class MarcheService {
    private List<MarchePublic> marches = new ArrayList<>();

    public void ajouterMarche(MarchePublic marche) {
        marches.add(marche);
        System.out.println("✅ Marché ajouté : " + marche.getTitre());
    }

    public void afficherMarches() {
        if (marches.isEmpty()) {
            System.out.println("Aucun marché disponible.");
        } else {
            marches.forEach(System.out::println);
        }
    }

    // Rechercher un marché par titre (lève une exception si introuvable)
    public MarchePublic rechercherMarche(String titre) throws EntityNotFoundException {
        for (MarchePublic m : marches) {
            if (m.getTitre().equalsIgnoreCase(titre)) {
                return m;
            }
        }
        throw new EntityNotFoundException("Marché non trouvé : " + titre);
    }

    // Fermer un marché
    public void fermerMarche(String titre) throws EntityNotFoundException {
        MarchePublic marche = rechercherMarche(titre);
        marche.setStatut("Fermé");
        System.out.println("🚫 Marché fermé : " + titre);
    }
}
