package com.app.ddd.core.Sourcing;

import com.app.ddd.core.model.Aggregate;

/**
 * Created by bench on 16/02/2018.
 */
public class Demande extends Aggregate {

    private ChargeRecrutement CR;
    private Candidat candidat;
    private ConsultantRecruteur recruteur;
    private CTO cto;

    public Demande(ChargeRecrutement CR, Candidat candidat, ConsultantRecruteur recruteur) {
        this.CR = CR;
        this.candidat = candidat;
        this.recruteur = recruteur;
    }

    public void contacterCandidat(){
       CR.contactCandidate(candidat);
    }

    public int demandeCTO(){
        return this.CR.demanderCTO(cto, candidat);
    }

    public int canTest(){
        return this.recruteur.canTest(candidat);
    }

}
