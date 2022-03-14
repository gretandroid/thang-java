package com.example;

import com.example.model.Personne;
import com.example.model.Salarie;
import com.example.model.Vehicule;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- com.example.Main OK");
// Create objects Personne
        System.out.println("--- Create objects Personne");
        Personne p1 = new Personne(1, "PHAM", "Thang", 40, LocalDate.of(1981, 10, 1), 40000);
        System.out.println("P1 : " + p1);
        Personne p2 = new Personne(1, "PHAM", "Thang", 40, LocalDate.of(1981, 10, 1), 40000);
        System.out.println("P2 : " + p2);
        Personne p3 = new Personne(3, "PHAM", "Alexandre", 8, LocalDate.of(2014, 8, 10), 00.000);
        System.out.println("P3 : " + p3);
        Personne p4 = new Personne(4, "PHAM", "Louis", 7, LocalDate.of(2015, 9, 30), 00.000);
        System.out.println("P4 : " + p4);
// Create an array to stock all objects
        System.out.println("--- Create an array to stock all objects");
        List<Personne> personnes = new ArrayList<>();
        personnes.add(p1);
        personnes.add(p2);
        personnes.add(p3);
        personnes.add(p4);
// Print objects using while
        System.out.println("--- Print objects using while");
        printPersonnes(personnes);
// Print objects using for
        System.out.println("--- Print objects using for");
        for(Personne p : personnes) {
            System.out.println(p);
        }
// Chercher objects equivalents
        System.out.println("--- Chercher objects equivalents");
        List<Personne> personnesToCompare = new ArrayList(personnes);
        List<Personne> foundList = new ArrayList<>();
        for (Personne pToCompare : personnesToCompare) {
            for (Personne p : personnes) {
                if (Objects.equals(pToCompare, p) && !foundList.contains(pToCompare) && pToCompare != p) {
                    System.out.println("Object " + personnesToCompare.indexOf(pToCompare)
                            + " equal Object " + personnes.indexOf(p));
                    foundList.add(pToCompare);
                }
            }
        }

        // Create vehicules
        System.out.println("--- Create vehicules");
        Vehicule v1 = new Vehicule(1, "red");
        Vehicule v2 = new Vehicule(2, "blue");
        Vehicule v3 = new Vehicule(3, "green");
        Vehicule v4 = new Vehicule(4, "yellow");
        Vehicule v5 = new Vehicule(5, "white");
        Vehicule v6 = new Vehicule(6, "black");
        Vehicule v7 = new Vehicule(7, "rose");
        Vehicule v8 = new Vehicule(8, "brown");

        // Init relations Personne and Vehicule
        System.out.println("--- Init relations Personne and Vehicule");
        p1.addVehicules(Arrays.asList(v1, v2));
        p2.addVehicules(Arrays.asList(v3, v4));
        p3.addVehicules(Arrays.asList(v5, v6));
        p4.addVehicules(Arrays.asList(v7, v8));
        printPersonnes(personnes);

        // 6 - Create a Personne with a constructor without matricule
        System.out.println("6 - Create a Personne with a constructor without matricule");
        Personne p5 = new Personne("TRINH", "Laura", 30, LocalDate.of(1989, 8, 25), 10000, new ArrayList<>());
        personnes.add(p5);
        printPersonnes(personnes);

        // 8 - Create 2 Salarie
        System.out.println("8 - Create 2 Salarie");
        Salarie s1 = new Salarie(5, "KHUONG", "Victor", 39, LocalDate.of(1982, 10, 2), 50000, "Developpeur", "Master", true);
        personnes.add(s1);
        System.out.println("Salarie s1 : " + s1);
        Personne p6 = new Salarie(6, "NGUYEN", "Hong Minh", 36, LocalDate.of(1986, 1, 20), 45000, "Manager", "Master", true);
        personnes.add(p6);
        System.out.println("Personne p6 : " + p6);

        // 10 - afficher()
        System.out.println("10 - afficher()");
        afficherPersonnes(personnes);

    }

    private static void printPersonnes(List<Personne> personnes) {
        Iterator<Personne> iterator = personnes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void afficherPersonnes(List<Personne> personnes) {
        Iterator<Personne> iterator = personnes.iterator();
        while (iterator.hasNext()) {
            Personne p = iterator.next();
            p.afficher(p.toString());
        }
    }
}
