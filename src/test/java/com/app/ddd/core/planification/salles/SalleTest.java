package com.app.ddd.core.planification.salles;

import com.app.ddd.core.planification.creneau.Creneau;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalleTest {
    @Test
    public void shouldNotSelectARoom(){
        Salle salle = new Salle();
        Creneau creneau = new Creneau(2018, 02, 26, 12, 2);

        assertEquals(salle.reserverUneSalle(creneau), true);
        assertEquals(salle.reserverUneSalle(creneau), false);
    }

}