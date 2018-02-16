package com.app.ddd.core.planification.role;


import com.app.ddd.core.model.Entity;
import com.app.ddd.core.planification.Profil;
import com.app.ddd.core.planification.creneau.Creneau;
import com.app.ddd.core.planification.utils.ListUtils;

import java.util.ArrayList;

public class ConsultantRecruteur extends Entity {
    private Personne personne;
    private Profil profil;
    private ArrayList<Creneau> creneauxIndisponibilite;

    public ConsultantRecruteur(String nom, String prenom, String securiteSociale){
        personne = new Personne(nom, prenom, securiteSociale) {
        };
        creneauxIndisponibilite = new ArrayList<>();
    }

    public boolean ajouterUneIndisponibilite(Creneau creneau){
        if(creneau.getStatut() == Creneau.Statut.NONCREE) return false;
        if(!indisponibiliteExisteDeja(creneau)){
            creneauxIndisponibilite.add(creneau);
            return true;
        }
        return false;
    }

    private boolean indisponibiliteExisteDeja(Creneau creneau){
        ListUtils<String>listUtils = new ListUtils<>();
        ArrayList<String>d = new ArrayList<>();
        for(Creneau c: creneauxIndisponibilite){
            d.add(c.toString());
        }
        if(listUtils.listCountainsOneElementInCommon(d, creneau.toString())) return true; //L'indisponibilité existe, on ne peut pas la créer
        return false; //L'indisponibilité n'existe pas, on peut l'ajouter
    }

    public void ajouterUneCompetence(String competence){
        profil.ajouterUneCompetence(competence);
    }

    public boolean peutTester(Candidat candidat){
        ListUtils<String> listUtils = new ListUtils<>();
        return listUtils.listsCountainsElementsInCommon(profil.recupererCompetences(), candidat.recupererCompetences());
    }
}
