package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.json.simple.parser.ParseException;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;

public class LoginStepDefinition {

	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();

	@Given("User opens Mobile Application")
	public void userOpensMobileApplication() {
	}

	@Then("User enters valid username")
	public void userEntersValidUsername() throws IOException, ParseException {
		loginPage.enterUsername();
	}

	@And("User enters valid password")
	public void userEntersValidPassword() throws IOException, ParseException {
		loginPage.enterPassword();
	}

	@And("User clicks on login button")
	public void userClicksOnLoginButton() {
		loginPage.clickLoginBtn();
	}

	@Then("Validate user is directed to home page")
	public void validateUserIsDirectedToHomePage() {
		homePage.assertHomePageTitle();
	}

}
