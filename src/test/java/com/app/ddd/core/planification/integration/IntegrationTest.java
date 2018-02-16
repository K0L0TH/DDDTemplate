package com.app.ddd.core.planification.integration;

import com.app.ddd.core.integration.CV.Identite;
import com.app.ddd.core.integration.CV.Profil;
import com.app.ddd.core.integration.role.Employe;
import com.app.ddd.core.integration.role.RH;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas_Travail on 16/02/2018.
 */
public class IntegrationTest {
    @Test
    public void TestCreateMail(){
        RH rh = new RH();
        Profil profil = new Profil("Java",5);
        Identite identite = new Identite("TestNom","TestPrenom","SecuritéSocialeTest");
        Employe employe= new Employe(profil,identite);

        String mailCree=rh.creerMailEmploye(employe);
        assertEquals(mailCree,"TestNom.TestPrenom@soat.fr");

    }
}
