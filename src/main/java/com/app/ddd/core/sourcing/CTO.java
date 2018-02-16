package com.app.ddd.core.sourcing;

import com.app.ddd.core.model.Id;
import com.app.ddd.core.model.Personne;

/**
 * Created by bench on 16/02/2018.
 */
public class CTO extends Personne {


    public CTO(String firstName, String lastName, Id globalId) {
        super(firstName, lastName, globalId);
    }

    public CTO(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public int analyserProfil(Candidat candidat){
        if (candidat.getProfile().isValid()){
            return 0;
        }
        return -1;
    }


}
