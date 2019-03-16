package com.step.assignments.collections;

import java.util.HashSet;
import java.util.Set;

public class NumberSet {
    Set<Integer> numbers = new HashSet<>();

    public void add(int number) {
        this.numbers.add(number);
    }

    public Set<Integer> intersection(Set<Integer> anotherSet) {
        this.numbers.retainAll(anotherSet);
        return this.numbers;
    }

    public Set<Integer> union(Set<Integer> anotherSet){
        this.numbers.addAll(anotherSet);
        return  this.numbers;
    }

    public Set<Integer> difference(Set<Integer> anotherSet){
        this.numbers.containsAll(anotherSet);
        return this.numbers;
    }
}
