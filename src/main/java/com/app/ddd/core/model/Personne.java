package com.app.ddd.core.model;

/**
 * Created by bench on 16/02/2018.
 */
public abstract class Personne extends Entity {

    private String firstName;
    private String lastName;

    public Personne(String firstName, String lastName, Id globalId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.globalId = globalId;
    }

    public Personne(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int compareTo(Object o) {
        return 0;
    }
}
