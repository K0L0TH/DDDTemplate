package com.app.ddd.core.Sourcing;

import com.app.ddd.core.model.Aggregate;

/**
 * Created by bench on 16/02/2018.
 */
public class Demande extends Aggregate {

    private ChargeRecrutement CR;
    private Candidat candidat;

    public Demande(ChargeRecrutement CR, Candidat candidat) {
        this.CR = CR;
        this.candidat = candidat;
    }
}
