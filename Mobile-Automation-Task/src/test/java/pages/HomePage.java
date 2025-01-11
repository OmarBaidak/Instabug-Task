package pages;

import org.openqa.selenium.By;
import utilities.Assertions;

public class HomePage {
	By homePage = By.xpath("//*[contains(@text,'Home')]");

	public void assertHomePageTitle() {
		Assertions.assertElementExists(homePage);
	}
}
