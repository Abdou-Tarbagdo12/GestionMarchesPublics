package model;

import java.time.LocalDate;

public class Contrat {
    private Entreprise entreprise;
    private MarchePublic marche;
    private LocalDate dateSignature;
    private LocalDate dateFin;
    private String statut;

    // Constructeur
    public Contrat(Entreprise entreprise, MarchePublic marche, LocalDate dateSignature, LocalDate dateFin, String statut) {
        this.entreprise = entreprise;
        this.marche = marche;
        this.dateSignature = dateSignature;
        this.dateFin = dateFin;
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

    public LocalDate getDateSignature() {
        return dateSignature;
    }

    public void setDateSignature(LocalDate dateSignature) {
        this.dateSignature = dateSignature;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Contrat entre " + entreprise.getNom() + " et le marché " + marche.getTitre() +
                " | Signé le: " + dateSignature + " | Statut: " + statut;
    }
}
