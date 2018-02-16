package com.app.ddd.core.sourcing;

import com.app.ddd.core.model.Id;
import com.app.ddd.core.model.Personne;

/**
 * Created by bench on 16/02/2018.
 */
public class ConsultantRecruteur extends Personne {

    private Profile profile;

    public ConsultantRecruteur(String firstName, String lastName, Id globalId) {
        super(firstName, lastName, globalId);
    }

    public ConsultantRecruteur(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public int canTest(Candidat candidat){
        return this.profile.compareTo(candidat.getProfile());
    }
}
