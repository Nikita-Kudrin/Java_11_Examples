package sample.generics;

import sample.impl.Parent;
import sample.interfaces.Doable;

public class GenericClass<T extends Parent & Doable> {

    private final T obj;

    public GenericClass(final T obj) {
        this.obj = obj;
    }

    public void Ololo() {
    }

    public void DoSomething(final GenericClass<? extends Doable> differentTypeObj) {
        differentTypeObj.Ololo();
    }
}
