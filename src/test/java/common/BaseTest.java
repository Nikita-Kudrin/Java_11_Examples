package common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public static final Logger log = LogManager.getLogger(BaseTest.class.getName());

    protected <T extends Iterable<?>> void printCollection(final T collection) {
        collection.spliterator().forEachRemaining(item -> System.out.println(item));
    }

    @BeforeClass(timeOut = 10)
    public void beforeClass() {

    }
}
