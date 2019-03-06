package com.step.assignments;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean bark, int hours) {
        if (!bark || hours < 0 || hours > 23) {
            return false;
        }
        if (hours < 8 || hours > 22) {
            return true;
        }
        return false;
    }
}