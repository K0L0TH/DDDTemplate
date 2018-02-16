package com.app.ddd.core.planification.role;

import com.app.ddd.core.model.Entity;
import com.app.ddd.core.planification.Profil;

import java.util.ArrayList;

public class Candidat extends Entity {
    private Personne person;
    private Profil profil;

    public Candidat() {

    }

    public void ajouterUneCompetence(String competence){
        profil.ajouterUneCompetence(competence);
    }

    public ArrayList<String> recupererCompetences(){
        return profil.recupererCompetences();
    }
}
