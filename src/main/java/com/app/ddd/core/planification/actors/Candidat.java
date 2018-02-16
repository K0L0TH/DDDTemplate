package com.app.ddd.core.planification.actors;

import com.app.ddd.core.planification.actors.entity.Entity;
import com.app.ddd.core.planification.actors.entity.Person;
import com.app.ddd.core.planification.actors.objects.Profil;

import java.util.ArrayList;

public class Candidat extends Entity{
    private Person person;
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
