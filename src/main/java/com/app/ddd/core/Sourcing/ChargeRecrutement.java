package com.app.ddd.core.Sourcing;

import com.app.ddd.core.model.Id;
import com.app.ddd.core.model.Personne;

/**
 * Created by bench on 16/02/2018.
 */
public class ChargeRecrutement extends Personne {

    public ChargeRecrutement(String firstName, String lastName, Id globalId) {
        super(firstName, lastName, globalId);
    }

    public ChargeRecrutement(String firstName, String lastName) {
        super(firstName, lastName);
    }


}
