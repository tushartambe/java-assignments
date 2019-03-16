package com.step.assignments.generics.duplicateExercise;

public class UnoCard implements Duplicable<DuplicateUnoCard>{
    public UnoCard() {
    }

    @Override
    public DuplicateUnoCard duplicate() {
        return new DuplicateUnoCard();
    }
}
