package com.app.ddd.core.model;

/**
 * Created by Nicolas_Travail on 16/02/2018.
 */
public class Id extends ValueObject {
    Integer id;

    @Override
    public int compareTo(Object o) {
        return id.compareTo(((Id)o).id);
    }
}
