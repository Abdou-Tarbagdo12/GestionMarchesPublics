package model;

import java.time.LocalDate;

public class MarchePublic {
    private String titre;
    private String description;
    private double budget;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String statut;

    // Constructeur
    public MarchePublic(String titre, String description, double budget, LocalDate dateDebut, LocalDate dateFin, String statut) {
        this.titre = titre;
        this.description = description;
        this.budget = budget;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.statut = statut;
    }

    // Getters et Setters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
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
        return "Marché: " + titre + " | Budget: " + budget + " | Statut: " + statut;
    }
}
