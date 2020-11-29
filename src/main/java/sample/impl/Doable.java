package sample.impl;

public class Doable extends Parent implements sample.interfaces.Doable {

    public Doable() {
        this(new int[]{});
    }

    public Doable(int[] array) {
        super(array);
    }

    @Override
    Parent someAbstractMethod() {
        return null;
    }

    @Override
    public void doSomething(int x) {

    }
}
