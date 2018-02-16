package com.app.ddd.core.planification;

import com.app.ddd.core.planification.utils.ListUtils;

import java.util.ArrayList;

public class Profil {
    private ArrayList<String> competences;

    public Profil(){
        competences = new ArrayList<>();
    }

    public boolean ajouterUneCompetence(String competence){
        if(competenceNonPresente(competence)){
            competences.add(competence.toUpperCase());
            return true;
        }
        return false;
    }

    private boolean competenceNonPresente(String competence){
        ListUtils<String> listUtils = new ListUtils<>();
        return !listUtils.listCountainsOneElementInCommon(competences, competence);
    }

    public ArrayList<String> recupererCompetences() {
        return competences;
    }
}
