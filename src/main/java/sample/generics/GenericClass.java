package sample.generics;

import sample.impl.Parent;
import sample.interfaces.Doable;

public class GenericClass<T extends Parent & Doable> {

    private T obj;

    public GenericClass(T obj) {
        this.obj = obj;
    }

    public void Ololo() {
    }

    public void DoSomething(GenericClass<? extends Doable> differentTypeObj) {
        differentTypeObj.Ololo();
    }
}
