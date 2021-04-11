package sample.impl;

import java.util.Random;

public enum EnumExample {
    Red,
    Blue,
    Green,
    Yellow;

    // this variable is unique for each Enum instance (Red, Blue ...)
    private final int colorNumber;

    EnumExample() {
        colorNumber = new Random().nextInt(Integer.MAX_VALUE);
    }

    public int getColorNumber() {
        return colorNumber;
    }
}
