package collections;

import common.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SteamsExample extends BaseTest {

    @DataProvider(name = "dataProvider")
    private Object[][] dataProvider() {
        final var list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("two");
        list.add("1");
        list.add("1");
        list.add("a");

        return new Object[][]{{null, list}};
    }

    @Test
    public void acquireStream() {
        final var list = new ArrayList<String>();
        final var listStream = list.stream();

        final var array = new String[1];
        final var arrayStream = Arrays.stream(array);

        //var bufferedReader = new BufferedReader(new FileReader(Path.of("bla bla"));
        //var readerStream = bufferedReader.lines();
    }

    @Test(dataProvider = "dataProvider")
    public void sortStream(final Object param1, final ArrayList<String> sourceList) {
        sourceList.stream()
                .sorted()
                .distinct()
                .forEach(item -> System.out.println(item));
        //.collect(Collectors.toList());
    }

    @Test(dataProvider = "dataProvider")
    public void filterStream(final Object param, final ArrayList<String> sourceList) {
        final var filteredList = sourceList.stream()
                .filter(item -> item.length() <= 1)
                .map(item -> item + " _ ololo");

        printCollection(filteredList.collect(Collectors.toList()));
    }
}
