package com.app.ddd.core.sourcing;

import com.app.ddd.core.model.ValueObject;

/**
 * Created by bench on 16/02/2018.
 */
public class Profile extends ValueObject {

    private String competence;
    private int nbAnneeXP;

    public Profile(String competence, int nbAnneeXP) {
        this.competence = competence;
        this.nbAnneeXP = nbAnneeXP;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Profile){
            Profile comparedTo = (Profile)o;
            if(comparedTo.getCompetence().equals(this.competence) &&
                    comparedTo.getNbAnneeXP() == this.nbAnneeXP){
                return 0;
            }else{
                return -1;
            }
        }
        return -1;
    }

    public boolean isValid(){
        if(this.nbAnneeXP >= 1)
            return true;
        return false;
    }

    public String getCompetence() {
        return competence;
    }

    public int getNbAnneeXP() {
        return nbAnneeXP;
    }
}
