package com.app.ddd.core.planification.sourcing;

import com.app.ddd.core.sourcing.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by bench on 16/02/2018.
 */
public class SourcingIT {

    Candidat c1;
    Candidat c2;
    Candidat c3;
    Candidat c4;

    ChargeRecrutement CR;
    CTO cto;

    ConsultantRecruteur recruteur1;
    ConsultantRecruteur recruteur2;


    @Before
    public void init(){
        c1 = new Candidat("c1", "c1", new Profile("JAVA", 2));
        c2 = new Candidat("c1", "c1", new Profile("JAVA", 0));
        c3 = new Candidat("c1", "c1", new Profile("C#", 4));
        c4 = new Candidat("c1", "c1", new Profile("C#", 3));

        CR = new ChargeRecrutement("cr", "cr");
        cto = new CTO("cto", "cto");

        recruteur1 = new ConsultantRecruteur("r", "r", new Profile("JAVA", 8));
        recruteur2 = new ConsultantRecruteur("r", "r", new Profile("C#", 8));
    }

    @Test
    public void shouldTestWithRightRecruiter(){
        Demande demande1 = new Demande(CR, c3, recruteur1, cto);
        Demande demande2 = new Demande(CR, c2, recruteur1, cto);

        Assert.assertEquals(-1, demande1.canTest());
        Assert.assertEquals(0, demande2.canTest());
    }

    @Test
    public void shouldValidateRightCandidate(){
        Demande demande1 = new Demande(CR, c2, recruteur1, cto);
        Demande demande2 = new Demande(CR, c3, recruteur1, cto);

        Assert.assertEquals(-1, demande1.isValidatedByCTO());
        Assert.assertEquals(0, demande2.isValidatedByCTO());
    }
}
