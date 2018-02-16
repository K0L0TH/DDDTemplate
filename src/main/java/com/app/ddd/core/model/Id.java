package com.app.ddd.core.model;


public class Id extends ValueObject {
    Integer id;

    @Override
    public int compareTo(Object o) {
        return id.compareTo(((Id)o).id);
    }
}
