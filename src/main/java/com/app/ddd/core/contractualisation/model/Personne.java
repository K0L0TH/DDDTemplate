package com.app.ddd.core.contractualisation.model;

import com.app.ddd.core.model.Entity;
import com.app.ddd.core.model.Id;

/**
 * Created by kokoghlanian on 16/02/2018.
 */
public abstract class Personne extends Entity {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

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