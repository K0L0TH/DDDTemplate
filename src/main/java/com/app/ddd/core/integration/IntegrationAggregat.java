package com.app.ddd.core.integration;

import com.app.ddd.core.integration.role.Employe;
import com.app.ddd.core.integration.role.RH;
import com.app.ddd.core.contractualisation.contrat.ContratAggregat;
import com.app.ddd.core.model.Aggregat;


public class IntegrationAggregat extends Aggregat {
    ContratAggregat contrat;
    Employe employe;
    RH rh;

    public IntegrationAggregat(Employe employe, RH rh) {
        this.employe = employe;
        this.rh = rh;
    }


}
