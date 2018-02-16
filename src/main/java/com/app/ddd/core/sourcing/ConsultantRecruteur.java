package com.app.ddd.core.sourcing;

import com.app.ddd.core.model.Id;
import com.app.ddd.core.model.Personne;

/**
 * Created by bench on 16/02/2018.
 */
public class ConsultantRecruteur extends Personne {

    private Profile profile;

    public ConsultantRecruteur(String firstName, String lastName, Id globalId, Profile profile) {
        super(firstName, lastName, globalId);
        this.profile = profile;
    }

    public ConsultantRecruteur(String firstName, String lastName, Profile profile) {
        super(firstName, lastName);
        this.profile = profile;
    }

    public int canTest(Candidat candidat){
        return this.profile.compareTo(candidat.getProfile());
    }
}
