package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class SearchElements extends BaseTest {

    private final String GOOGLE_URL = "http://google.com";

    @Test(enabled = false)
    public void navigateBackAndForthTest() throws InterruptedException {
        var driver = getWebDriverInstance();
        driver.navigate().to(GOOGLE_URL);

        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

        driver.quit();
    }

    @Test(enabled = false)
    public void searchSomeElements() {
        var driver = getWebDriverInstance();
        driver.get(GOOGLE_URL);

        driver.findElement(By.cssSelector("h1.ddd"));
        var wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("input"))));

        driver.quit();
    }

}
