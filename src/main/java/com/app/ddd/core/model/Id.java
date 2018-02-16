package com.app.ddd.core.model;

import javax.annotation.Generated;

/**
 * Created by Nicolas_Travail on 16/02/2018.
 */
public class Id extends ValueObject {
    //normalement les id doivent être générés automatiquement
      Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        return id.compareTo(((Id)o).id);
    }
}
