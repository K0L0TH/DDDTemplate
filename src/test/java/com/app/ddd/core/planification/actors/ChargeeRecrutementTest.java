package com.app.ddd.core.planification.actors;

import com.app.ddd.core.planification.creneau.Creneau;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChargeeRecrutementTest {
    private ChargeeRecrutement chargeeRecrutement;
    private Creneau creneau;
    private Candidat candidat;

    @Before
    public void init(){
        chargeeRecrutement = new ChargeeRecrutement("", "", "");
        creneau = new Creneau(2018, 03, 02, 2018, 03, 04);
    }

    @Test
    public void ajouterUneIndisponibilite() {
        assertEquals(chargeeRecrutement.ajouterUneIndisponibilite(creneau), true);
    }

    @Test
    public void peutTester() {
        //chargeeRecrutement.ajouterUneCompetence("java");
    }
}