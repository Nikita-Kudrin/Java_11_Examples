package sample.generics;

import org.javatuples.Pair;

public class ClassWithGenericMethod {

    public <T extends Number> ClassWithGenericMethod(final T input) {
        // do something with input value
    }

    public <T extends Number, V extends String> Pair<T, V> GetResult() {
        return new Pair(12, "sdfads");
    }
}
