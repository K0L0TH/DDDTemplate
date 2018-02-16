package com.app.ddd.core.planification.role.objects;

import com.app.ddd.core.planification.Profil;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProfilTest {
    @Test
    public void shouldNotCountainSkill(){
        Profil profil = new Profil();
        assertEquals(profil.ajouterUneCompetence("Java"), true);
        assertEquals(profil.ajouterUneCompetence("JAVA"), false);
    }

}