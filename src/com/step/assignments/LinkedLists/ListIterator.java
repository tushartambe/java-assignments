package com.step.assignments.LinkedLists;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {
    private List<Integer> list;
    private static int currentIndex = -1;

    public ListIterator(List<Integer> list) {
        this.list = list;
        this.currentIndex = 0;
    }


    public boolean hasNext() {
        return this.currentIndex < this.list.size();
    }

    public int next() {

        if (this.hasNext()){
            return  this.list.get(this.currentIndex++);

        }
        throw new NoSuchElementException("Not found");
    }

}
