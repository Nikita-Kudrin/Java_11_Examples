package collections;

import common.BaseTest;
import org.javatuples.Pair;
import org.testng.annotations.Test;

import java.util.*;

public class CollectionAlgorithmsTests extends BaseTest {
    public Pair<List, List> initNewCollections() {
        var firstList = Arrays.asList("90", "2.322", "340834");

        var secondList = new ArrayList<String>();
        secondList.add("1251234.3");
        secondList.add("424");
        secondList.add("6.4243");

        return new Pair<>(firstList, secondList);
    }

    @Test
    public void someAlgorithmsExample() {
        var collections = initNewCollections();
        var firstList = collections.getValue0();
        var secondList = collections.getValue1();

        firstList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                var number1 = Double.parseDouble(o1);
                var number2 = Double.parseDouble(o2);

                if (number1 == number2) return 0;
                return number1 > number2 ? 1 : 0;
            }

        });
        printCollection(firstList);
    }
}
