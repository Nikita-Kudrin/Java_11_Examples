package sample.interfaces;

public interface GenericInterface<T extends Comparable<T>> {
    T doSomeStuff();

    void doAnotherStuff(T input);
}
