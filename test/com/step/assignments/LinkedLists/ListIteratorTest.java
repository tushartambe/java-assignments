package com.step.assignments.LinkedLists;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListIteratorTest {

    @Test
    void hasNext() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        ListIterator iterator = new ListIterator(list);
        assertTrue(iterator.hasNext());
    }


    @Test
    void next() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer integer = 1;
        list.add(integer);
        ListIterator iterator = new ListIterator(list);
        assertEquals(integer,iterator.next());
    }
}