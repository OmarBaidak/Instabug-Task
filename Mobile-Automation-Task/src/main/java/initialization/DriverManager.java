package initialization;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import utilities.JsonListener;
import utilities.JsonPath;

import java.net.URL;

public class DriverManager {

    static AppiumDriver driver;

    public static void startDriver() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setCapability("autoGrantPermissions", "true");
        options.setCapability("platformName", "Android");
        options.setCapability("newCommandTimeout", 120); // Timeout in seconds
        options.setCapability("udid", JsonListener.getJsonValueByKey(JsonPath.jsonInitializationData,"udid"));
        options.setCapability("automationName", JsonListener.getJsonValueByKey(JsonPath.jsonInitializationData,"automationName"));
        options.setCapability("avd", JsonListener.getJsonValueByKey(JsonPath.jsonInitializationData,"avd"));
        options.setCapability("appPackage", JsonListener.getJsonValueByKey(JsonPath.jsonInitializationData,"appPackageName"));
        options.setCapability("appActivity", JsonListener.getJsonValueByKey(JsonPath.jsonInitializationData,"appActivity"));
        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AndroidDriver(url, options);
    }

    public static AppiumDriver getDriver() {
        return driver;
    }

    public static void tearDown() {
        driver.quit();
    }

}
