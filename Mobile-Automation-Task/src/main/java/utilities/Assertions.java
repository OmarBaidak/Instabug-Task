package utilities;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Assertions {

    public static void assertElementExists(By by) {
        try {
            Actions.waitForElement(by);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

}
