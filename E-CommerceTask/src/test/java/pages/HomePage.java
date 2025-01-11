package pages;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Actions;
import utilities.JsonPath;
import utilities.JsonReader;

import java.io.IOException;

public class HomePage extends Actions {
	By closeButton = By.xpath("//*[@class=\"cls\"]");
	By englishLanguageButton = By.xpath("(//*[text()='English'] )[1]");
	By searchField = By.xpath("//*[@type='text']");
	By searchButton = By.xpath("//*[text()='Search']");


	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void clickOnCloseButton(){
		Actions.click(closeButton);
	}
	public void switchToEnglish(){
		Actions.click(englishLanguageButton);
	}
	public void searchForProduct() throws IOException, ParseException {
		Actions.type(searchField, JsonReader.getJsonValueByKey(JsonPath.jsonData,"Product"));
	}
	public void clickOnSearchButton(){
		Actions.click(searchButton);
	}



}
