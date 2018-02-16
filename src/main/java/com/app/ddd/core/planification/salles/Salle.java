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

    public boolean reserverUneSalle(Creneau creneau) {
        if (salleEstDisponiblePourEntretien(creneau, creneauIndisponibilite)) {
            creneauIndisponibilite.add(creneau);
            return true;
        }
       return false;
    }

    private boolean salleEstDisponiblePourEntretien(Creneau c, ArrayList<Creneau> list){
        ListUtils<String> listUtils = new ListUtils<>();
        ArrayList<String> d = new ArrayList<>();
        for(Creneau o : creneauIndisponibilite){
            d.add(o.toString());
        }
        return listUtils.listCountainsOneElementInCommon(d, c.toString());
    }
}
