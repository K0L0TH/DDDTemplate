package com.app.ddd.core.planification.salles;

import com.app.ddd.core.planification.creneau.Creneau;
import com.app.ddd.core.planification.utils.ListUtils;

import java.util.ArrayList;

public class Salle {
    private int identifiantSalle;
    private String batiment;
    private ArrayList<Creneau> creneauIndisponibilite;


    public Salle() {
        creneauIndisponibilite = new ArrayList<>();
    }

    public boolean reserverUneSalle(Creneau creneau){
       if(salleEstDisponiblePourEntretien(creneau, creneauIndisponibilite))
            creneauIndisponibilite.add(creneau);
        else{
            return false;
        }
       return true;
    }

    public boolean salleEstDisponiblePourEntretien(Creneau c, ArrayList<Creneau> list){
        ListUtils<Creneau> listUtils = new ListUtils<>();
        //return listUtils.listCountainsOneElementsInCommon(c, list);
        return false;
    }
}
