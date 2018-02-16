package com.app.ddd.core.contractualisation;

import com.app.ddd.core.model.Aggregate;

/**
 * Created by kokoghlanian on 16/02/2018.
 */
public class ContratAggregate extends Aggregate{

    private Contrat contrat;

    public Contrat getContrat() {
        return contrat;
    }

    public ContratAggregate(Contrat contrat) {
        this.contrat = contrat;
    }

}
