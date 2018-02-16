package com.app.ddd.core.sourcing;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bench on 16/02/2018.
 */
public class ConsultantRecruteurTest {

    @Test
    public void shouldTestCandidate(){
        Candidat c = new Candidat("c","c", new Profile("JAVA", 1));
        ConsultantRecruteur recruteur = new ConsultantRecruteur("cr", "cr", new Profile("JAVA", 6));

        Assert.assertEquals(0, recruteur.canTest(c));
    }

    @Test
    public void shouldTestCandidate2(){
        Candidat c = new Candidat("c","c", new Profile("JAVA", 1));
        ConsultantRecruteur recruteur = new ConsultantRecruteur("cr", "cr", new Profile("C#", 6));

        Assert.assertEquals(-1, recruteur.canTest(c));
    }

}
