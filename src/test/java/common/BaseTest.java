package common;

import jdk.jfr.Timespan;
import org.testng.annotations.BeforeClass;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class BaseTest {

    public static final Logger log = LogManager.getLogger(BaseTest.class.getName());

    protected <T extends Iterable<?>> void printCollection(T collection) {
        collection.spliterator().forEachRemaining(item -> System.out.println(item));
    }

    @BeforeClass(timeOut = 10)
    public void beforeClass() {

    }
}
