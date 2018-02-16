package com.app.ddd.core.planification.sourcing;

import com.app.ddd.core.sourcing.*;
import com.app.ddd.core.sourcing.cv.Profil;
import com.app.ddd.core.sourcing.role.CTO;
import com.app.ddd.core.sourcing.role.Candidat;
import com.app.ddd.core.sourcing.role.ChargeRecrutement;
import com.app.ddd.core.sourcing.role.ConsultantRecruteur;
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
        c1 = new Candidat("c1", "c1", new Profil("JAVA", 2));
        c2 = new Candidat("c1", "c1", new Profil("JAVA", 0));
        c3 = new Candidat("c1", "c1", new Profil("C#", 4));
        c4 = new Candidat("c1", "c1", new Profil("C#", 3));

        CR = new ChargeRecrutement("cr", "cr");
        cto = new CTO("cto", "cto");

        recruteur1 = new ConsultantRecruteur("r", "r", new Profil("JAVA", 8));
        recruteur2 = new ConsultantRecruteur("r", "r", new Profil("C#", 8));
    }

    @Test
    public void shouldTestWithRightRecruiter(){
        DemandeAggregat demande1 = new DemandeAggregat(CR, c3, recruteur1, cto);
        DemandeAggregat demande2 = new DemandeAggregat(CR, c2, recruteur1, cto);

        Assert.assertEquals(-1, demande1.canTest());
        Assert.assertEquals(0, demande2.canTest());
    }

    @Test
    public void shouldValidateRightCandidate(){
        DemandeAggregat demande1 = new DemandeAggregat(CR, c2, recruteur1, cto);
        DemandeAggregat demande2 = new DemandeAggregat(CR, c3, recruteur1, cto);

        Assert.assertEquals(-1, demande1.isValidatedByCTO());
        Assert.assertEquals(0, demande2.isValidatedByCTO());
    }
}
