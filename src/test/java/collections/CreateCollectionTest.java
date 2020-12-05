package collections;

import common.BaseTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CreateCollectionTest extends BaseTest {

    @Test
    public void exploreListAndSetCollections() {
        var arrayList = new ArrayList<String>();
        arrayList.add("asdf");
        arrayList.ensureCapacity(100); // increase to 100 items
        arrayList.trimToSize(); // trim to current actual size
        printCollection(arrayList);

        var array = new String[arrayList.size()];
        array = arrayList.toArray(array);

        var hashSet = new HashSet<String>();
        hashSet.add("One");
        hashSet.add(new String("One"));
        // only 1 of the "One" will remain
        printCollection(hashSet);
    }

    @Test
    public void exploreMapsCollections() {
        var hashMap = new HashMap<String, Integer>();

        hashMap.put("bla", 12);
        printCollection(hashMap.entrySet());


    }


    // Locale

    // EventListenerProxy
    // EventObject

    // Optional
}
