package collections;

import common.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SteamsExample extends BaseTest {

    @DataProvider(name = "dataProvider")
    private Object[][] dataProvider() {
        var list = new ArrayList<String>();
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
        var list = new ArrayList<String>();
        var listStream = list.stream();

        var array = new String[1];
        var arrayStream = Arrays.stream(array);

        //var bufferedReader = new BufferedReader(new FileReader(Path.of("bla bla"));
        //var readerStream = bufferedReader.lines();
    }

    @Test(dataProvider = "dataProvider")
    public void sortStream(Object param1, ArrayList<String> sourceList) {
        sourceList.stream()
                .sorted()
                .distinct()
                .forEach(item -> System.out.println(item));
        //.collect(Collectors.toList());
    }

    @Test(dataProvider = "dataProvider")
    public void filterStream(Object param, ArrayList<String> sourceList) {
        var filteredList = sourceList.stream()
                .filter(item -> item.length() <= 1)
                .map(item -> new String(item + " _ ololo"));


        printCollection(filteredList.collect(Collectors.toList()));
    }


}
