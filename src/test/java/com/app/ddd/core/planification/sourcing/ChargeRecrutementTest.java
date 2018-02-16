package com.app.ddd.core.planification.sourcing;

import com.app.ddd.core.sourcing.Candidat;
import com.app.ddd.core.sourcing.ChargeRecrutement;
import com.app.ddd.core.sourcing.Profile;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bench on 16/02/2018.
 */
public class ChargeRecrutementTest {

    @Test
    public void shouldContactCandidat(){
        Candidat c = new Candidat("c","c", new Profile("JAVA", 1));
        ChargeRecrutement CR = new ChargeRecrutement("CR", "CR", new Profile("JAVA", 5));
        CR.contactCandidate(c);
        Assert.assertEquals(true, c.isContacted());
    }
}
