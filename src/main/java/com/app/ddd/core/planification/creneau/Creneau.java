package com.app.ddd.core.planification.creneau;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Creneau {
    private DateTime debutEntretien;
    private DateTime finEntretien;
    private String creneau;

    public Creneau(int year, int month, int day, int heure, int duree) {
        if(creneauEstCoherent(year, month, day, heure, duree)){
            this.debutEntretien = new DateTime(year, month, day, heure, 0, 0, 0);
            this.finEntretien = new DateTime(year, month, day, heure + duree, 0, 0, 0);
            creneau = debutEntretien.toString() + "-" + finEntretien.toString();
        }
    }

    private boolean creneauEstCoherent(int year, int month, int day, int heure, int duree){
        DateTime d = new DateTime();

        if(duree > 0 && year >= d.getYear() && month >= d.getMonthOfYear() && day >= d.getDayOfMonth())
                        return true;

        return false;
    }

    public ArrayList<DateTime> recupererCreneau(){
        ArrayList<DateTime> d = new ArrayList<>();
        d.add(debutEntretien);
        d.add(finEntretien);
        return d;
    }

    @Override
    public String toString() {
        return creneau;
    }
}
