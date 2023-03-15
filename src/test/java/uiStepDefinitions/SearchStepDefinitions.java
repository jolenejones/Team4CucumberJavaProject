package uiStepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinitions {
	
	
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
	   System.out.println("browser is open");
	   
	   String projectPath = System.getProperty("user.dir");
	   System.out.println("Project path is :" + projectPath);
	   System.setProperty("webdriver.chrome.driver", projectPath+"src/test/resources/drivers/chromedriver_windows.exe");
	   driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	   
	}

	@And("user is on youtube search page")
	public void user_is_on_youtube_search_page() {
	    driver.navigate().to("https://www.youtube.com/");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
	    driver.findElement(By.name("search_query")).sendKeys("michelle yeoh");
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	   driver.getPageSource().contains("Michelle Yeoh makes history with best actress win at 2023 Oscars: Full speech");
	   driver.close();
	   driver.quit();
	}
	@Given("I open the url {string}")
	public void i_open_the_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("the element {string} not contains any text")
	public void the_element_not_contains_any_text(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I clear the inputfield {string}")
	public void i_clear_the_inputfield(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I add {string} to the inputfield {string}")
	public void i_add_to_the_inputfield(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I press {string}")
	public void i_press(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I expect that search content contains the text {string}")
	public void i_expect_that_search_content_contains_the_text(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	}


