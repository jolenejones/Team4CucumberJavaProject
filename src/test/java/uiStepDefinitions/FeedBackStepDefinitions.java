package uiStepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.PageManager;

public class FeedBackStepDefinitions {
	PageManager pages = PageManager.getInstance();
	
	@When("user clicks feedback")
	public void user_clicks_feedback() {
	   pages.homePage().clickFeedBack();
	}

	@When("user enters feedback content and click send")
	public void user_enters_feedback_content_and_click_send() {
		pages.homePage().inputToAlert();
	}

	@Then("user should see {string} message")
	public void user_should_see_message(String string) {
		pages.homePage().validate();
	}


}
