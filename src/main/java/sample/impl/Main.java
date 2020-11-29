package sample.impl;

import sample.exceptions.ExceptionExample;
import sample.generics.GenericClass;
import sample.interfaces.Doable;
import sample.io.IOExample;

public class Main {

    public static void main(String[] args) throws Exception {
        var instance = new Child(new int[]{10, 33});
        var isInstanceOfParent = instance instanceof Parent;

        System.out.println("Is instance of parent class: " + isInstanceOfParent);

        System.out.println(instance.getSomeText());
        instance.splitStringExample();

        // working with exceptions
        new ExceptionExample().MethodWithException();

        // enum
        var enumExample = EnumExample.Red;
        var values = EnumExample.values();
        for (var value : values) {
            System.out.println(value.getColorNumber());
        }

        System.out.println(enumExample.getColorNumber());

        // type wrappers
        new TypeWrappers().testMethod();

        // IO example
        var io = new IOExample();
        io.WriteTextIntoFile();
        io.ReadLinesFromFile();

        // interfaces
        var doable = new sample.impl.Doable(new int[]{1, 3});
        System.out.println("Is instance of IDoable: " + (doable instanceof Doable));

        // generics
        var genericInstance = new GenericClass<>(new sample.impl.Doable(new int[]{10, 1}));
    }
}
