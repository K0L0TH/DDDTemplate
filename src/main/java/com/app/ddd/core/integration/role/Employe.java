package com.app.ddd.core.integration.role;

import com.app.ddd.core.integration.CV.Identite;
import com.app.ddd.core.integration.CV.Profil;
import com.app.ddd.core.model.Entity;

/**
 * Created by Nicolas_Travail on 16/02/2018.
 */
public class Employe extends Entity {
    private Profil profil;
    private Identite identite;

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }

    public Identite getIdentite() {
        return identite;
    }

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }

    public Employe(Profil profil, Identite identite) {
        this.profil = profil;
        this.identite = identite;
    }

    public Employe() {
    }
}
