package com.app.ddd.core.model;

/**
 * Created by bench on 16/02/2018.
 */
public abstract class Entity implements Comparable{

    private Id globalId;

    @Override
    public int compareTo(Object o) {
        return globalId.compareTo(o);
    }
}
