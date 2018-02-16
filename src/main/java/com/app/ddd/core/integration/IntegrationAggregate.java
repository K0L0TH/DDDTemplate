package com.app.ddd.core.integration;

import com.app.ddd.core.contractualisation.role.Candidat;
import com.app.ddd.core.integration.role.Employe;
import com.app.ddd.core.integration.role.RH;
import com.app.ddd.core.contractualisation.ContratAggregate;
import com.app.ddd.core.model.Aggregate;
import com.app.ddd.core.contractualisation.*;

/**
 * Created by Nicolas_Travail on 16/02/2018.
 */
public class IntegrationAggregate extends Aggregate{
    ContratAggregate contrat;
    Employe employe;
    RH rh;
    //repository

    public IntegrationAggregate(Employe employe, RH rh) {
        this.employe = employe;
        this.rh = rh;
    }

    public IntegrationAggregate(ContratAggregate contrat,RH rh){
        this.contrat=contrat;
        this.rh=rh;
        employe=new Employe();
        //employe=repository.getById(contrat.getContrat().getCandidat());

    }

    public void mettreEnPlaceEnvironnementCandidat(){
        rh.creerMailEmploye(employe);
        rh.creerSlackEmploye(employe);

    }


}
