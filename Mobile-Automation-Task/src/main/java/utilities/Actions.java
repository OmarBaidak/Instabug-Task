package utilities;

import initialization.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Actions {

    public static WebElement waitForElement(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
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
    public static String removeCommas(String string) {
        return string.replaceAll(",", "");
    }

}
