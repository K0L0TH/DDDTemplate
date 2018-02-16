package com.app.ddd.core.planification.actors.entity;

import org.joda.time.DateTime;

public class Person {
    private String prenom;
    private String nom;
    private String numeroSecuriteSociale;

    public Person(String prenom, String nom, String numeroSecuriteSociale) {
        this.prenom = prenom;
        this.nom = nom;
        this.numeroSecuriteSociale = numeroSecuriteSociale;
    }
}
