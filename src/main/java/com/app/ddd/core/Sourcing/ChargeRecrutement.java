package com.app.ddd.core.Sourcing;

import com.app.ddd.core.model.Id;
import com.app.ddd.core.model.Personne;

/**
 * Created by bench on 16/02/2018.
 */
public class ChargeRecrutement extends Personne {

    private Profile profile;

    public ChargeRecrutement(String firstName, String lastName, Id globalId, Profile profil) {
        super(firstName, lastName, globalId);
        this.profile = profil;
    }

    public ChargeRecrutement(String firstName, String lastName, Profile profile) {
        super(firstName, lastName);
        this.profile = profile;
    }

    public boolean canTest(Candidat candidat){
        return true;
    }
}
