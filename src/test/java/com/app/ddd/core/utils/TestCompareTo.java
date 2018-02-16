package com.app.ddd.core.utils;

import com.app.ddd.core.contractualisation.role.Candidat;
import com.app.ddd.core.integration.role.Employe;
import com.app.ddd.core.model.Entity;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas_Travail on 16/02/2018.
 */
public class TestCompareTo {
    @Test
    public void TestEntityCompareToInferior(){
        //normalement les id doivent être générés automatiquement mais pour ouvoir tester on les a mis à la main car nous n'avions pas le temps
        Employe employe = new Employe();

        employe.setGlobalId(1);
        Employe employe2= new Employe();
        employe.setGlobalId(2);

        assertEquals(((Entity)employe).compareTo((Entity)employe2),-1);

    }
}
