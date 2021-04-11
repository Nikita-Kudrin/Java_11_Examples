package sample.interfaces;

public interface Doable {
    void doSomething(int x);

    default void methodWithDefaultImplementation(final int z) {
        final var variable = 10;
        somePrivateMethod();
        staticInterfaceMethod();
    }

    private void somePrivateMethod() {

    }

    static void staticInterfaceMethod() {

    }
}

