package com.app.ddd.core.integration.CV;

import com.app.ddd.core.model.ValueObject;

/**
 * Created by Nicolas_Travail on 16/02/2018.
 */
public class Identite extends ValueObject {
    private String nom;
    private String prenom;
    private String numeroSecuriteSociale;

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

    public String getNumeroSecuriteSociale() {
        return numeroSecuriteSociale;
    }

    public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
        this.numeroSecuriteSociale = numeroSecuriteSociale;
    }

    public Identite(String nom, String prenom, String numeroSecuriteSociale) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroSecuriteSociale = numeroSecuriteSociale;
    }

    public Identite() {
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
