package com.app.ddd.core.planification.sourcing;

import com.app.ddd.core.sourcing.Profile;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bench on 16/02/2018.
 */
public class ProfileTest {

    @Test
    public void shouldCompareProfiles(){
        Profile p1 = new Profile("JAVA", 1);
        Profile p2 = new Profile("JAVA", 1);

        Assert.assertEquals(0, p1.compareTo(p2));
    }

    @Test
    public void shouldCompareProfiles2(){
        Profile p1 = new Profile("JAVA", 1);
        Profile p2 = new Profile("C#", 3);

        Assert.assertEquals(-1, p1.compareTo(p2));
    }
}
