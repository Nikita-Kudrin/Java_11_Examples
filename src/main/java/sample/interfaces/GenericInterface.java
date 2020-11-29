package sample.interfaces;

public interface GenericInterface<T extends Comparable<T>> {
    public T doSomeStuff();

    public void doAnotherStuff(T input);
}
