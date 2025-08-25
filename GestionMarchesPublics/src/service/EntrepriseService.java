package service;

import model.Entreprise;
import exception.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class EntrepriseService {
    private List<Entreprise> entreprises = new ArrayList<>();

    public void ajouterEntreprise(Entreprise entreprise) {
        entreprises.add(entreprise);
        System.out.println("✅ Entreprise ajoutée : " + entreprise.getNom());
    }

    public void afficherEntreprises() {
        if (entreprises.isEmpty()) {
            System.out.println("Aucune entreprise disponible.");
        } else {
            entreprises.forEach(System.out::println);
        }
    }

    // Rechercher une entreprise par nom
    public Entreprise rechercherEntreprise(String nom) throws EntityNotFoundException {
        for (Entreprise e : entreprises) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                return e;
            }
        }
        throw new EntityNotFoundException("Entreprise non trouvée : " + nom);
    }
}
