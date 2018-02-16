package com.app.ddd.core.sourcing.role;

import com.app.ddd.core.model.Id;
import com.app.ddd.core.sourcing.Personne;
import com.app.ddd.core.sourcing.cv.Profil;

/**
 * Created by bench on 16/02/2018.
 */
public class ConsultantRecruteur extends Personne {

    private Profil profile;

    public ConsultantRecruteur(String firstName, String lastName, Id globalId, Profil profile) {
        super(firstName, lastName, globalId);
        this.profile = profile;
    }

    public ConsultantRecruteur(String firstName, String lastName, Profil profile) {
        super(firstName, lastName);
        this.profile = profile;
    }

    public int canTest(Candidat candidat){
        Profil comparedTo = candidat.getProfile();
        if(this.profile.getCompetence().equals(comparedTo.getCompetence())){
            return 0;
        }else{
            return -1;
        }
    }

    public Profil getProfile() {
        return profile;
    }

    public void setProfile(Profil profile) {
        this.profile = profile;
    }
}
