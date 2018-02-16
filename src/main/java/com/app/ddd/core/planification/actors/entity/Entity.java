package com.app.ddd.core.planification.actors.entity;

public class Entity implements Comparable {
    GlobalId id;

    public GlobalId getGlobalId() {
        return id;
    }

    public void setGlobalId(GlobalId id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
