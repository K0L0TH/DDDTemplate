package com.app.ddd.core.integration.CV;

import com.app.ddd.core.model.ValueObject;

/**
 * Created by Nicolas_Travail on 16/02/2018.
 */
public class Profil extends ValueObject {
    String competence;
    Integer experience;
    @Override
    public int compareTo(Object o) {
        int res = competence.compareTo(((Profil)o).competence);
        if(res!=0)
            return res;
        return experience.compareTo(((Profil)o).experience);
    }

    public Profil(String competence, Integer experience) {
        this.competence = competence;
        this.experience = experience;
    }

    public Profil() {
    }
}
