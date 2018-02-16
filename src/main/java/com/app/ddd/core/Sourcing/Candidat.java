package com.app.ddd.core.Sourcing;

import com.app.ddd.core.model.Id;
import com.app.ddd.core.model.Personne;

/**
 * Created by bench on 16/02/2018.
 */
public class Candidat extends Personne {

    private Profile profile;
    private boolean contacted;

    public Candidat(String firstName, String lastName, Id globalId, Profile profile) {
        super(firstName, lastName, globalId);
        this.profile = profile;
    }

    public Candidat(String firstName, String lastName, Profile profile){
      super(firstName, lastName);
      this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Candidat){
            Candidat comparedTo = (Candidat)o;
            return comparedTo.profile.compareTo(this.profile);
        }
        return -1;
    }

    public boolean isContacted(){
        return contacted;
    }

    public void setContacted(boolean contacted){
        this.contacted = contacted;
    }


}
