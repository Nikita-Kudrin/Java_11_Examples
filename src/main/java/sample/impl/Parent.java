package sample.impl;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Parent {

    {
        // Initializer block - executes before every constructors
        System.out.println("Initializer block 1");
    }

    {
        // Initializer block - executes before every constructors
        System.out.println("Initializer block 2");
    }

    private int[] array = {12, 10};

    public int[] getArray() {
        return array;
    }

    public void setArray(final int[] array) {
        this.array = array;
    }

    public Parent(final int[] array) {
        this.array = array;
    }

    abstract Parent someAbstractMethod();

    final Parent finalMethodCannotBeOverriden() {
        return null;
    }

    /**
     * Example of for loop
     */
    public void forLoopExample() {
        for (var x = 0; x < 10; x++) {
            final var z = 0;
        }
    }

    public void splitStringExample() {
        final var str = "Somestring.bla.bla";
        final var result = new ArrayList<>(Arrays.asList(str.split("\\.")));

        for (final var item : result) {
            System.out.println(item);
            //result.add("new str"); // TODO: special "bug"
        }
    }
}
