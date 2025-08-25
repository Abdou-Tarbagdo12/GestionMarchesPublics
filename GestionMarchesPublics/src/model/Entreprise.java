package model;

public class Entreprise {
    private String nom;
    private String adresse;
    private String telephone;
    private String qualification;

    // Constructeur
    public Entreprise(String nom, String adresse, String telephone, String qualification) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.qualification = qualification;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Entreprise: " + nom + " | Tel: " + telephone + " | Qualification: " + qualification;
    }
}
