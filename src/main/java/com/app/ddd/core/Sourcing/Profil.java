package com.app.ddd.core.Sourcing;

import com.app.ddd.core.model.ValueObject;

/**
 * Created by bench on 16/02/2018.
 */
public class Profil extends ValueObject {

    private String competence;
    private int nbAnneeXP;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
