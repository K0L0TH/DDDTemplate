package com.app.ddd.core.contractualisation;

import com.app.ddd.core.contractualisation.role.Candidat;
import com.app.ddd.core.contractualisation.role.Daf;
import com.app.ddd.core.model.Aggregate;
import com.app.ddd.core.model.Id;
import com.app.ddd.core.planification.entretien.EntretienAgregate;

/**
 * Created by kokoghlanian on 16/02/2018.
 */
public class ContratAggregate extends Aggregate{

    private Contrat contrat;
    private EntretienAgregate entretienAgregate;
    private Daf daf;

    public Contrat getContrat() {
        return contrat;
    }

    public ContratAggregate(Daf daf, Id idEntretiensAggregate) {

       // Candidat candidat = entretienAgregate.SelectCandidatFromEntretienAgregateById(idEntretiensAggregate);
        this.daf = daf;
        double salaire = daf.determineSalaire();
        //this.contrat = daf.creerContrat(salaire,candidat);
    }

}
