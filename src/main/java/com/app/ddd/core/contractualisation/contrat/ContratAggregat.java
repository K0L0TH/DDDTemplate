package com.app.ddd.core.contractualisation.contrat;

import com.app.ddd.core.contractualisation.role.Daf;
import com.app.ddd.core.model.Aggregat;
import com.app.ddd.core.model.Id;
import com.app.ddd.core.planification.entretien.EntretienAgregat;

/**
 * Created by kokoghlanian on 16/02/2018.
 */
public class ContratAggregat extends Aggregat {

    private Contrat contrat;
    private EntretienAgregat entretienAgregate;
    private Daf daf;

    public Contrat getContrat() {
        return contrat;
    }

    public ContratAggregat(Daf daf, Id idEntretiensAggregate) {

       // Candidat candidat = entretienAgregate.SelectCandidatFromEntretienAgregateById(idEntretiensAggregate);
        this.daf = daf;
        double salaire = daf.determineSalaire();
     //   this.contrat = daf.creerContrat(salaire,candidat);
    }

}
