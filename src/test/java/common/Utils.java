package common;

import org.testng.annotations.Test;

import java.util.Currency;

public class Utils extends BaseTest {
    @Test
    public void currencyTest() {
        var currency = Currency.getInstance("USD");

        log.info("Some log message");

        System.out.println(currency.getSymbol());
    }
}
