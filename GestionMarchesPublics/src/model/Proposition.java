package model;

import java.time.LocalDate;

public class Proposition {
    private Entreprise entreprise;
    private MarchePublic marche;
    private double montant;
    private LocalDate dateSoumission;
    private String statut;

    // Constructeur
    public Proposition(Entreprise entreprise, MarchePublic marche, double montant, LocalDate dateSoumission, String statut) {
        this.entreprise = entreprise;
        this.marche = marche;
        this.montant = montant;
        this.dateSoumission = dateSoumission;
        this.statut = statut;
    }

    // Getters et Setters
    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public MarchePublic getMarche() {
        return marche;
    }

    public void setMarche(MarchePublic marche) {
        this.marche = marche;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public LocalDate getDateSoumission() {
        return dateSoumission;
    }

    public void setDateSoumission(LocalDate dateSoumission) {
        this.dateSoumission = dateSoumission;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Proposition de " + entreprise.getNom() + " pour le marché " + marche.getTitre() +
                " | Montant: " + montant + " | Statut: " + statut;
    }
}
