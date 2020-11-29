package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public WebDriver getWebDriverInstance() {
        return WebDriverFactory.getDriver("LOCAL");
    }
}
