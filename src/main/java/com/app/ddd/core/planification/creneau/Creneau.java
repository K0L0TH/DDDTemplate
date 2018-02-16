package com.app.ddd.core.planification.creneau;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Creneau {
    private DateTime debut;
    private DateTime fin;
    private String creneau;
    public enum Statut{
        CREE,
        NONCREE
    }
    private Statut statut;

    public Statut getStatut() {
        return statut;
    }

    public Creneau(int year, int month, int day, int heure, int duree) {
        if(creneauEstCoherent(year, month, day, duree)){
            this.debut= new DateTime(year, month, day, heure, 0, 0, 0);
            this.fin= new DateTime(year, month, day, heure + duree, 0, 0, 0);
            creneau = debut.toString() + "-" + fin.toString();
            statut = Statut.CREE;
        }else{
            statut = Statut.NONCREE;
        }
    }

    public Creneau(int anneeDebut, int moisDebut, int jourDebut, int anneeFin, int moisFin, int jourFin) {
        if(creneauEstCoherent(anneeDebut, moisDebut, jourDebut, anneeFin, moisFin, jourFin)){
            this.debut = new DateTime(anneeDebut, moisDebut, jourDebut, 0, 0, 0, 0);
            this.fin = new DateTime(anneeFin, moisFin, jourFin, 0, 0, 0, 0);
            creneau = debut.toString() + "-" + fin.toString();
            statut = Statut.CREE;
        }else{
            statut = Statut.NONCREE;
        }
    }

    private boolean creneauEstCoherent(int anneeDebut, int moisDebut, int jourDebut, int anneeFin, int moisFin, int jourFin){
        DateTime d = new DateTime();

        if(creneauEstCoherent(anneeDebut, moisDebut, jourDebut, 1) &&
                creneauEstCoherent(anneeFin, moisFin, jourFin, 1)){
            if(anneeDebut <= anneeFin){
                if(moisDebut == moisFin){
                    if(jourDebut < jourFin){
                        return true;
                    }else return false;
                }
                if(moisDebut <= moisFin){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean creneauEstCoherent(int year, int month, int day, int duree){
        DateTime d = new DateTime();

        if(duree >= 0){
            if(year == d.getYear()){
                if(month == d.getMonthOfYear()){
                    if(day >= d.getDayOfMonth())
                        return true;
                }
                return month > d.getMonthOfYear();
            }
            return year > d.getYear();
        }
        return false;
    }

    public ArrayList<DateTime> recupererCreneau(){
        ArrayList<DateTime> d = new ArrayList<>();
        d.add(debut);
        d.add(fin);
        return d;
    }

    @Override
    public String toString() {
        return creneau;
    }
}
