package com.app.ddd.core.planification.actors.objects;

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