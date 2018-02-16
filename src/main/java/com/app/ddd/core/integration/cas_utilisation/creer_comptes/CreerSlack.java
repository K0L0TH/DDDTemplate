package com.app.ddd.core.integration.cas_utilisation.creer_comptes;

import com.app.ddd.core.integration.role.Employe;

/**
 * Created by Nicolas_Travail on 16/02/2018.
 */
public class CreerSlack {
    public static String creerSlack(Employe employe){
        //crée un compte
        return employe.getIdentite().getNom()+"."+employe.getIdentite().getPrenom()+"@soat.fr";
    }
}