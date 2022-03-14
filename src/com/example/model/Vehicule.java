package com.example.model;

import java.util.Objects;

public class Vehicule {
    int numero;
    String couleur;

    public Vehicule(int numero, String couleur) {
        this.numero = numero;
        this.couleur = couleur;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicule)) return false;
        Vehicule vehicule = (Vehicule) o;
        return getNumero() == vehicule.getNumero() && Objects.equals(getCouleur(), vehicule.getCouleur());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumero(), getCouleur());
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "numero=" + numero +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
