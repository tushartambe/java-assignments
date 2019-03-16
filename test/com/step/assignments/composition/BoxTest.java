    package com.step.assignments.composition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    void name() {
        Box _5thLevelBox = new Box();

        Box _4thLevelBox = new Box(_5thLevelBox);

        Jewellery nacklace = new Jewellery("necklace");
        Box _3rdLevelBox = new Box(_4thLevelBox, nacklace);

        Jewellery ring = new Jewellery("ring");

        Box _2ndLevelBox = new Box(_3rdLevelBox, ring);
        Box _1stLevelBox = new Box(_2ndLevelBox);

        assertEquals(2, _1stLevelBox.getJewelleryCount());
    }
}