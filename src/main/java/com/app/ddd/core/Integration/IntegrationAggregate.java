package com.app.ddd.core.Integration;

import com.app.ddd.core.Integration.role.Employe;
import com.app.ddd.core.Integration.role.RH;
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
