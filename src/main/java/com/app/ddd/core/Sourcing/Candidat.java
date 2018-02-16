package com.app.ddd.core.Sourcing;

import com.app.ddd.core.model.Id;
import com.app.ddd.core.model.Personne;

/**
 * Created by bench on 16/02/2018.
 */
public class Candidat extends Personne {


    public Candidat(String firstName, String lastName, Id globalId) {
        super(firstName, lastName, globalId);
    }

    public Candidat(String firstName, String lastName){
      super(firstName, lastName);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
