package com.app.ddd.core.planification.role;

public class Personne {
    private String prenom;
    private String nom;
    private String numeroSecuriteSociale;

    public Personne(String prenom, String nom, String numeroSecuriteSociale) {
        this.prenom = prenom;
        this.nom = nom;
        this.numeroSecuriteSociale = numeroSecuriteSociale;
    }
}
