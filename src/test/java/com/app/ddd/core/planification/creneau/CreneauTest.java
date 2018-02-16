package com.app.ddd.core.planification.creneau;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreneauTest {
    @Test
    public void recupererCreneau(){
        Creneau creneau = new Creneau(2018, 2, 26, 12, 2);
        assertEquals(creneau.toString().equals("2018-02-26T12:00:00.000+01:00-2018-02-26T14:00:00.000+01:00"), true);
    }
}