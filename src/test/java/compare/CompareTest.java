package compare;

import org.testng.annotations.Test;
import sample.impl.Doable;

import java.util.TreeSet;

public class CompareTest {

    @Test
    public void comparatorExample() {
        var treeSet = new TreeSet<Doable>(new DoableComparator());
        treeSet.add(new Doable(new int[]{1, 2}));
    }
}
