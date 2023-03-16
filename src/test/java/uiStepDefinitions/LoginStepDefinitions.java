package uiStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.PageManager;
import utilities.Util;

public class LoginStepDefinitions {

	PageManager pages = PageManager.getInstance();

//		@Given("is on login page")
//		public void is_on_login_page() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		pages.homePage().clickSigninButton();
		Util.wait(5);
		pages.loginPage().clickanotherAccount();
		Util.wait(5);
	}

	@When("user enters username {string} and click next")
	public void userEntersUsername(String email) {
		Util.wait(5);
		pages.loginPage().enterEmail(email);
		pages.loginPage().clickNext();
	}
	
	@When("user eneters password {string} and click next")
	public void userEntersPassword(String password) {
		Util.wait(5);
		pages.loginPage().enterEmail(password);
		pages.loginPage().clickNext();
	}
	

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	 pages.loginPage().validateMessage();
	}

}
