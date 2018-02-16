package com.app.ddd.core.planification.entretien;

import com.app.ddd.core.model.Entity;
import com.app.ddd.core.planification.role.Candidat;
import com.app.ddd.core.planification.creneau.Creneau;
import com.app.ddd.core.planification.salles.Salle;


public class Entretien extends Entity {
    public enum Statut {
            REUSSI,
            RATE,
            REPORTE,
            ANNULE
    }
    private Candidat candidat;
    private Creneau creneau;
    private Salle salle;
}
