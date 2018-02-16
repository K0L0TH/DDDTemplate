package com.app.ddd.core.planification.sourcing;

import com.app.ddd.core.sourcing.Candidat;
import com.app.ddd.core.sourcing.Profile;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bench on 16/02/2018.
 */
public class CandidatTest {

    @Test
    public void shouldCompareCandidat(){
        Candidat c1 = new Candidat("c1", "c1", new Profile("JAVA", 1));
        Candidat c2 = new Candidat("c2", "c2", new Profile("JAVA", 1));
        Assert.assertEquals(0, c1.compareTo(c2));
    }

    @Test
    public void shouldCompareCandidat2(){
        Candidat c1 = new Candidat("c1", "c1", new Profile("JAVA", 1));
        Candidat c2 = new Candidat("c2", "c2", new Profile("C#", 1));
        Assert.assertEquals(-1, c1.compareTo(c2));
    }
}
