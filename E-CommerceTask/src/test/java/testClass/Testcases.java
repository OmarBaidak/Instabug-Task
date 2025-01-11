package testClass;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import utilities.BrowserInitializer;

import java.io.IOException;


public class Testcases {
	private WebDriver driver;
	private BrowserInitializer browserInitializer;
	HomePage homePage;
	ProductPage productPage;
    @BeforeTest
    public void Setup () throws IOException {
		browserInitializer = new BrowserInitializer();
		driver = browserInitializer.initializeBrowser("chrome");
		homePage = new HomePage(driver);
		productPage = new ProductPage(driver);
	}
	@Test
	public void searchForLaptop() throws IOException, ParseException {

	homePage.clickOnCloseButton();
	homePage.switchToEnglish();
	homePage.searchForProduct();
	homePage.clickOnSearchButton();
	productPage.assertWithProductFoundTitle();
	productPage.assertByProductCurrency();
	}


	@AfterTest
	public void teardown(){
		driver.quit();
	}


}
