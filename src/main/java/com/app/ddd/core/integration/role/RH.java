package com.app.ddd.core.integration.role;

import com.app.ddd.core.integration.cv.Identite;
import com.app.ddd.core.integration.cas_utilisation.creer_comptes.CreerMail;
import com.app.ddd.core.integration.cas_utilisation.creer_comptes.CreerSlack;
import com.app.ddd.core.model.ValueObject;

/**
 * Created by Nicolas_Travail on 16/02/2018.
 */
public class RH extends ValueObject {
    private Identite identite;

    public Identite getIdentite() {
        return identite;
    }

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }

    public String creerMailEmploye(Employe employe){
        return CreerMail.creerMail(employe);
    }

    public String creerSlackEmploye(Employe employe){
        return CreerSlack.creerSlack(employe);
    }
    @Override
    public int compareTo(Object o) {
        return identite.compareTo(((RH)o).identite);
    }
}
