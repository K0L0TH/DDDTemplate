package com.app.ddd.core.planification.utils;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListUtilsTest {
    private ArrayList<String> a;
    private ArrayList<String> b;

    @Before
    public void init(){
        a = new ArrayList<>();
        b = new ArrayList<>();
    }

    @Test
    public void listsSouldNotCountainsOneElementInCommon(){
        a.add("a");
        b.add("b");

        ListUtils listUtils = new ListUtils<String>();
        assertEquals(listUtils.listsCountainsElementsInCommon(a, b), false);
    }

    @Test
    public void listsSouldCountainsOneElemnetInCommon(){
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();

        a.add("a");
        b.add("a");

        ListUtils listUtils = new ListUtils<String>();
        assertEquals(listUtils.listsCountainsElementsInCommon(a, b), true);
    }

    @Test
    public void listShouldNotCountains(){
        a.add("a");
        ListUtils<String> listUtils = new ListUtils<String>();
        assertEquals(listUtils.listCountainsOneElementInCommon(a, "a"), true);
    }
}