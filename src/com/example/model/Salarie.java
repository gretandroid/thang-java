package com.example.model;


import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Salarie extends Personne {

    private String fonction;
    private String diplôme;
    private boolean statutCadre;

    private int anciennete;

    public Salarie(int matricule, String nom, String prenom, int age, LocalDate dateNaissance, double salaire) {
        super(matricule, nom, prenom, age, dateNaissance, salaire);
    }

    public Salarie(String nom, String prenom, int age, LocalDate dateNaissance, double salaire, List<Vehicule> vehicules) {
        super(nom, prenom, age, dateNaissance, salaire, vehicules);
    }

    public Salarie(int matricule, String nom, String prenom, int age, LocalDate dateNaissance, double salaire, String fonction, String diplôme, boolean statutCadre) {
        super(matricule, nom, prenom, age, dateNaissance, salaire);
        this.fonction = fonction;
        this.diplôme = diplôme;
        this.statutCadre = statutCadre;
    }

    public Salarie(String nom, String prenom, int age, LocalDate dateNaissance, double salaire, List<Vehicule> vehicules, String fonction, String diplôme, boolean statutCadre) {
        super(nom, prenom, age, dateNaissance, salaire, vehicules);
        this.fonction = fonction;
        this.diplôme = diplôme;
        this.statutCadre = statutCadre;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getDiplôme() {
        return diplôme;
    }

    public void setDiplôme(String diplôme) {
        this.diplôme = diplôme;
    }

    public boolean isStatutCadre() {
        return statutCadre;
    }

    public void setStatutCadre(boolean statutCadre) {
        this.statutCadre = statutCadre;
    }

    @Override
    public void afficher(String chaine) {
        System.out.println("afficher() by " + this.getClass().getSimpleName() + " param = " + chaine);
    }

    @Override
    public int anciennete(int age) {
        // Do nothing
        System.out.println("anciennete() by " + this.getClass().getSimpleName() + " param = " + age);
        anciennete = age;
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Salarie)) return false;
        if (!super.equals(o)) return false;
        Salarie salarie = (Salarie) o;
        return isStatutCadre() == salarie.isStatutCadre() && Objects.equals(getFonction(), salarie.getFonction()) && Objects.equals(getDiplôme(), salarie.getDiplôme());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFonction(), getDiplôme(), isStatutCadre());
    }

    @Override
    public String toString() {
        return "Salarie{" +
                "fonction='" + fonction + '\'' +
                ", diplôme='" + diplôme + '\'' +
                ", statutCadre=" + statutCadre +
                ", anciennete=" + anciennete +
                "} " + "-> " + super.toString();
    }
}
