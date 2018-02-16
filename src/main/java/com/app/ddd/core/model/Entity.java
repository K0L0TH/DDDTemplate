package com.app.ddd.core.model;


public abstract class Entity implements Comparable{

    protected Id globalId;


    @Override
    public int compareTo(Object o) {
        return globalId.compareTo(o);
    }
}
