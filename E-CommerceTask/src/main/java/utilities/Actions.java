package utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Actions {
    protected static WebDriver driver;

    public Actions(WebDriver driver) {this.driver = driver;}



    protected static WebElement waitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static void click(By by) {
        try {
            WebElement element = waitForElement(by);
            element.click();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void type(By by, String text) {
        try {
            WebElement element = waitForElement(by);
            element.click();
            element.sendKeys(text);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
    public static String getElementText(By by) {
        WebElement element = waitForElement(by);
        return element.getText();
    }

}
