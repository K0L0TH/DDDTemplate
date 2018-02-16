package com.app.ddd.core.integration.environnement_travail;

import com.app.ddd.core.model.ValueObject;

/**
 * Created by Nicolas_Travail on 16/02/2018.
 */
public class Comptes extends ValueObject {
    String email;
    String slack;
    @Override
    public int compareTo(Object o) {
        int res = email.compareTo(((Comptes)o).email);
        if(res!=0)
            return res;
        return slack.compareTo(((Comptes)o).slack);
    }
}
