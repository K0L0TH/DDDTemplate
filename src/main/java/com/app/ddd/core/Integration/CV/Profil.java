package com.app.ddd.core.Integration.CV;

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
}
