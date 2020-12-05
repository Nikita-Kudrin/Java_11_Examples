package selenium;

import org.openqa.selenium.WebDriver;

public class BaseTest {

    public WebDriver getWebDriverInstance() {
        return WebDriverFactory.getDriver("LOCAL");
    }
}
