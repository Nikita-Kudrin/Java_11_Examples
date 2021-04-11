package sample.impl;

import sample.exceptions.ExceptionExample;
import sample.generics.GenericClass;
import sample.interfaces.Doable;
import sample.io.IOExample;

public class Main {

    public static void main(final String[] args) throws Exception {
        final var instance = new Child(new int[]{10, 33});
        final var isInstanceOfParent = instance instanceof Parent;

        System.out.println("Is instance of parent class: " + isInstanceOfParent);

        System.out.println(instance.getSomeText());
        instance.splitStringExample();

        // working with exceptions
        new ExceptionExample().MethodWithException();

        // enum
        final var enumExample = EnumExample.Red;
        final var values = EnumExample.values();
        for (final var value : values) {
            System.out.println(value.getColorNumber());
        }

        System.out.println(enumExample.getColorNumber());

        // type wrappers
        new TypeWrappers().testMethod();

        // IO example
        final var io = new IOExample();
        io.WriteTextIntoFile();
        io.ReadLinesFromFile();

        // interfaces
        final var doable = new sample.impl.Doable(new int[]{1, 3});
        System.out.println("Is instance of IDoable: " + (doable instanceof Doable));

        // generics
        final var genericInstance = new GenericClass<>(new sample.impl.Doable(new int[]{10, 1}));
    }
}
