package pages;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import utilities.Actions;
import utilities.JsonPath;
import utilities.JsonReader;

import java.io.IOException;

public class LoginPage {

	By usernameField = By.xpath("//*[@text()='Enter your password']//preceding-sibling::input[1]");
	By passwordField = By.xpath("//*[@text()='Enter your password']");
	By loginBtn = By.id("Login");


	public void enterUsername() throws IOException, ParseException {
		Actions.type(usernameField, JsonReader.getJsonValueByKey(JsonPath.jsonData, "username"));
	}

	public void enterPassword() throws IOException, ParseException {
		Actions.type(passwordField, JsonReader.getJsonValueByKey(JsonPath.jsonData, "password"));
	}

	public void clickLoginBtn() {
		Actions.click(loginBtn);
	}
}
