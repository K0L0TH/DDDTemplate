package com.app.ddd.core.planification.actors.entity;

import com.app.ddd.core.planification.actors.Candidat;
import com.app.ddd.core.planification.creneau.Creneau;
import com.app.ddd.core.planification.salles.Salle;
import com.app.ddd.core.sourcing.ConsultantRecruteur;

public class Entretien extends Entity {
    public enum Statut {
            REUSSI,
            RATE,
            REPORTE,
            ANNULE
    }
    private Candidat candidat;
    private ConsultantRecruteur consultantRecruteur;
    private Creneau creneau;
    private Salle salle;
}
