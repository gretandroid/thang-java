package com.example.model;


import java.time.LocalDate;
import java.util.*;

public class Personne implements IPersonne {

    private int matricule;
    private String nom;
    private String prenom;
    private int age;
    private LocalDate dateNaissance;
    private double salaire;

    // Vehicule
    private List<Vehicule> vehicules = new ArrayList<>();

    public Personne(int matricule, String nom, String prenom, int age, LocalDate dateNaissance, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateNaissance = dateNaissance;
        this.salaire = salaire;
    }

    public Personne(String nom, String prenom, int age, LocalDate dateNaissance, double salaire, List<Vehicule> vehicules) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateNaissance = dateNaissance;
        this.salaire = salaire;
        this.vehicules = vehicules;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public List<Vehicule> getVehicules() {
        return Collections.unmodifiableList(vehicules);
    }

    public void addVehicules(List<Vehicule> vehicules) {
        this.vehicules.addAll(vehicules);
    }

    public void removeVehicules(List<Vehicule> vehicules) {
        this.vehicules.removeAll(vehicules);
    }


    @Override
    public void afficher(String chaine) {
        System.out.println("afficher() by " + this.getClass().getSimpleName() + " param = " + chaine);
    }

    @Override
    public int anciennete(int age) {
        // Do nothing
        System.out.println("anciennete() by " + this.getClass().getSimpleName() + " param = " + age);
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personne)) return false;
        Personne personne = (Personne) o;
        return getMatricule() == personne.getMatricule() && getAge() == personne.getAge() && Double.compare(personne.getSalaire(), getSalaire()) == 0 && Objects.equals(getNom(), personne.getNom()) && Objects.equals(getPrenom(), personne.getPrenom()) && Objects.equals(getDateNaissance(), personne.getDateNaissance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricule(), getNom(), getPrenom(), getAge(), getDateNaissance(), getSalaire());
    }

    @Override
    public String toString() {
        return "Personne{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", dateNaissance=" + dateNaissance +
                ", salaire=" + salaire +
                ", vehicules=" + vehicules +
                '}';
    }

}
