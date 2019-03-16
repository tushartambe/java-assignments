package com.step.assignments.generics;

import java.awt.*;
import java.util.ArrayList;

public class NumberRange extends Range<Integer>  {

    private ArrayList<Integer> range = new ArrayList<>();

    public NumberRange(Integer start, Integer end) {
        super(start, end);
        createRange();
    }

    public void createRange(){
        for (int i = super.start; i < super.end; i++) {
            this.range.add(i);
        }
    }

    @Override
    public ArrayList<Integer> getAll() {
        return this.range;
    }

    @Override
    public boolean contains(Integer element) {
        return range.contains(element);
    }
}
