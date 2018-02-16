package com.app.ddd.core.planification.sourcing;

import com.app.ddd.core.sourcing.role.Candidat;
import com.app.ddd.core.sourcing.role.ChargeRecrutement;
import com.app.ddd.core.sourcing.cv.Profil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bench on 16/02/2018.
 */
public class ChargeRecrutementTest {

    @Test
    public void shouldContactCandidat(){
        Candidat c = new Candidat("c","c", new Profil("JAVA", 1));
        ChargeRecrutement CR = new ChargeRecrutement("CR", "CR");
        CR.contactCandidate(c);
        Assert.assertEquals(true, c.isContacted());
    }
}
