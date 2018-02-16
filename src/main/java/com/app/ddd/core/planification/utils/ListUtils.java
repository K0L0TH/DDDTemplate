package com.app.ddd.core.planification.utils;

import java.util.ArrayList;

public class ListUtils<T> {
    public boolean listsCountainsElementsInCommon(ArrayList<T> A, ArrayList<T> B){
        for (Object a : A) {
            for (Object b : B) {
                if(a.equals(b)) return false;
            }
        }
        return true;
    }

    public boolean listCountainsOneElementInCommon(ArrayList<T> A, T B){
        for (Object a : A) {
            if(a.equals(B)) return false;
        }
        return true;
    }
}
