package com.app.ddd.core.planification.entretien;

import com.app.ddd.core.planification.actors.Candidat;
import com.app.ddd.core.planification.actors.entity.Entity;
import com.app.ddd.core.planification.creneau.Creneau;

public class EntretienAgregate extends Entity {
    Candidat candidat;
}
