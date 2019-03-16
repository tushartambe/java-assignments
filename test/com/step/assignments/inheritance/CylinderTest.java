package com.step.assignments.inheritance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getRadius() {
        Cylinder cylinder = new Cylinder(10, 7);
        double output = cylinder.getRadius();
        assertEquals(output, 10);
    }

    @Test
    void getArea() {

    }

    @Test
    void getHeight() {
    }

    @Test
    void getVolume() {
    }
}