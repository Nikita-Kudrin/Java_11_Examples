package common;

import org.testng.annotations.Test;
import sample.impl.Child;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class LambdaTestExample {

    @Test(description = "Sorting example")
    public void sortingExample() {

        var list = new ArrayList<String>();
        list.add("c");
        list.add("b");
        list.add("a");

        //BiFunction<String, String, Integer> sorting = (item1, item2) -> item1.compareTo(item2);

        list.sort((item1, item2) -> item1.compareTo(item2));

        for (var item : list) {
            System.out.print(item);
        }
    }

    @Test
    public void methodReference() {
        Runnable childConstructor = Child::new;
        childConstructor.run();

        BiFunction<String, String, String[]> stringBiFunction = String::split;
    }

}
