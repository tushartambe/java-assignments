package com.step.assignments.composition;

public class Box {
    private Box box;
    private Jewellery jewellery;
    static int counter = 0;


    public Box() {
    }

    public Box(Box box) {
        this.box = box;
    }

    public Box(Jewellery jewellery) {
        this.jewellery = jewellery;
        increaseCount();
    }

    public Box(Box box, Jewellery jewellery) {
        this.box = box;
        this.jewellery = jewellery;
        increaseCount();
    }

    static void increaseCount() {
        counter++;
    }

    public int getJewelleryCount() {
        return counter;
    }
}
