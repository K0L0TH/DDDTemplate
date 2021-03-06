package com.app.ddd.core.planification.sourcing;

import com.app.ddd.core.sourcing.role.CTO;
import com.app.ddd.core.sourcing.role.Candidat;
import com.app.ddd.core.sourcing.cv.Profil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bench on 16/02/2018.
 */
public class CTOTest {

    @Test
    public void shouldAnalyseCandidatProfile(){
        Candidat c = new Candidat("c","c", new Profil("JAVA", 1));
        CTO cto = new CTO("cto", "cto");

        Assert.assertEquals(0, cto.analyserProfil(c));
    }

    @Test
    public void shouldAnalyseCandidatProfile2(){
        Candidat c = new Candidat("c","c", new Profil("JAVA", 0));
        CTO cto = new CTO("cto", "cto");

        Assert.assertEquals(-1, cto.analyserProfil(c));
    }
}
