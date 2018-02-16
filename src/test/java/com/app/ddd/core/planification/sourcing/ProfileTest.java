package com.app.ddd.core.planification.sourcing;

import com.app.ddd.core.sourcing.cv.Profil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bench on 16/02/2018.
 */
public class ProfileTest {

    @Test
    public void shouldCompareProfiles(){
        Profil p1 = new Profil("JAVA", 1);
        Profil p2 = new Profil("JAVA", 1);

        Assert.assertEquals(0, p1.compareTo(p2));
    }

    @Test
    public void shouldCompareProfiles2(){
        Profil p1 = new Profil("JAVA", 1);
        Profil p2 = new Profil("C#", 3);

        Assert.assertEquals(-1, p1.compareTo(p2));
    }
}
