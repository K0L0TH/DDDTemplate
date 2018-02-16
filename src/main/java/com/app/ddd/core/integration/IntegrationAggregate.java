package com.app.ddd.core.integration;

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

    public IntegrationAggregate(Employe employe, RH rh) {
        this.employe = employe;
        this.rh = rh;
    }


}
