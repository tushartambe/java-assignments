package com.step.assignments.generics;


import java.util.ArrayList;

public class AlphabetRange extends Range<Character>  {

    private ArrayList<Character> range = new ArrayList<>();

    public AlphabetRange(Character start, Character end) {
        super(start, end);
        createRange();
    }

    public void createRange(){
        for (char i = super.start; i < super.end; i++) {
            this.range.add(i);
        }
    }

    @Override
    public ArrayList<Character> getAll() {
        return this.range;
    }

    @Override
    public boolean contains(Character element) {
        return range.contains(element);
    }
}
