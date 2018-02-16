package com.app.ddd.core.sourcing;


import com.app.ddd.core.model.Entity;
import com.app.ddd.core.model.Id;

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
