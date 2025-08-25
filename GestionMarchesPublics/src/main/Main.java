package main;

import model.*;
import service.*;
import exception.EntityNotFoundException;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // --- 1. Création des services ---
        MarcheService marcheService = new MarcheService();
        EntrepriseService entrepriseService = new EntrepriseService();
        PropositionService propositionService = new PropositionService();
        ContratService contratService = new ContratService();

        // --- 2. Ajouter des marchés ---
        MarchePublic m1 = new MarchePublic("Construction Ecole", "Construction d'une école primaire", 5000000,
                LocalDate.of(2025, 8, 1), LocalDate.of(2025, 12, 1), "Ouvert");
        MarchePublic m2 = new MarchePublic("Réfection Route", "Réfection de la route nationale", 8000000,
                LocalDate.of(2025, 9, 1), LocalDate.of(2026, 1, 31), "Ouvert");

        marcheService.ajouterMarche(m1);
        marcheService.ajouterMarche(m2);

        // --- 3. Ajouter des entreprises ---
        Entreprise e1 = new Entreprise("BatirPlus", "Ouagadougou", "70123456", "Qualifiée");
        Entreprise e2 = new Entreprise("RoutesExpress", "Bobo-Dioulasso", "70234567", "Qualifiée");

        entrepriseService.ajouterEntreprise(e1);
        entrepriseService.ajouterEntreprise(e2);

        // --- 4. Ajouter des propositions ---
        Proposition p1 = new Proposition(e1, m1, 4800000, LocalDate.of(2025, 8, 5), "Reçue");
        Proposition p2 = new Proposition(e2, m2, 7900000, LocalDate.of(2025, 9, 5), "Reçue");

        propositionService.ajouterProposition(p1);
        propositionService.ajouterProposition(p2);

        // --- 5. Ajouter des contrats ---
        Contrat c1 = new Contrat(e1, m1, LocalDate.of(2025, 8, 10), LocalDate.of(2025, 12, 1), "En cours");
        Contrat c2 = new Contrat(e2, m2, LocalDate.of(2025, 9, 10), LocalDate.of(2026, 1, 31), "En cours");

        contratService.ajouterContrat(c1);
        contratService.ajouterContrat(c2);

        // --- 6. Affichage global ---
        System.out.println("\n--- Liste des marchés ---");
        marcheService.afficherMarches();

        System.out.println("\n--- Liste des entreprises ---");
        entrepriseService.afficherEntreprises();

        System.out.println("\n--- Liste des propositions ---");
        propositionService.afficherPropositions();

        System.out.println("\n--- Liste des contrats ---");
        contratService.afficherContrats();

        // --- 7. Tests de recherche avec try/catch ---
        System.out.println("\n--- Test recherche avec succès ---");

        try {
            MarchePublic marcheRecherche = marcheService.rechercherMarche("Construction Ecole");
            System.out.println("✅ Marché trouvé : " + marcheRecherche);
        } catch (EntityNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }

        try {
            Entreprise entrepriseRecherche = entrepriseService.rechercherEntreprise("BatirPlus");
            System.out.println("✅ Entreprise trouvée : " + entrepriseRecherche);
        } catch (EntityNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }

        try {
            Proposition propositionRecherche = propositionService.rechercherProposition(7900000);
            System.out.println("✅ Proposition trouvée : " + propositionRecherche);
        } catch (EntityNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }

        try {
            Contrat contratRecherche = contratService.rechercherContrat("Réfection Route");
            System.out.println("✅ Contrat trouvé : " + contratRecherche);
        } catch (EntityNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }

        // --- 8. Tester fermeture d'un marché ---
        try {
            marcheService.fermerMarche("Construction Ecole");
        } catch (EntityNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }

        // --- 9. Tests d'erreurs pour vérifier les exceptions ---
        System.out.println("\n--- Test exceptions ---");
        try {
            marcheService.rechercherMarche("Marché Inexistant");
        } catch (EntityNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }

        try {
            entrepriseService.rechercherEntreprise("Entreprise Inconnue");
        } catch (EntityNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }

        try {
            propositionService.rechercherProposition(9999999);
        } catch (EntityNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }

        try {
            contratService.rechercherContrat("Marché Inexistant");
        } catch (EntityNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }
}
