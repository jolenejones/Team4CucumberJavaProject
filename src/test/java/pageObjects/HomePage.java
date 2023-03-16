package pageObjects;

import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Util;

public class HomePage {

	// Local Variable
	private WebDriver driver;
	private static final String URL = "https://www.youtube.com/";

	// Elements
	@FindBy(how = How.ID, using = "search")
	private WebElement searchField;
	@FindBy(how = How.CLASS_NAME, using = "style-scope ytd-searchbox")
	private WebElement searchButton;
	@FindBy(how = How.XPATH, using = "//*[text()='Michelle Yeoh Accepts the Oscar for Lead Actress']")
	private WebElement searchResult;
	@FindBy(how = How.XPATH, using = "//yt-formatted-string[text()='Send feedback']")
	private WebElement feedBackButton;
	@FindBy(how = How.XPATH, using ="(//*[text()='Sign in'])[1]")
	private WebElement signinButton;

//	Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

// Action
	public void navigate() {
		driver.get(URL);
	}

	public void enterSearchInformation(String searchInformation) {
		searchField.sendKeys(searchInformation);
	}

	public void clickSearchButton() {
		searchButton.click();
	}

	public void clickFeedBack() {
		feedBackButton.click();
	}

	public void inputToAlert() {
		String mainWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Util.wait(5);
		for (String window : windows) {
			if (!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				Util.wait(5);
			}
		}
		driver.findElement(By.xpath("//textarea[@class='scSharedMaterialtextfieldnative-control']"))
				.sendKeys("can i send feedback without login?");
		Util.wait(5);
		driver.findElement(By.xpath("//span[text()='Send']")).click();

	}

	public void validate() {

		assertTrue(driver.findElement(By.id("uvFeedbackThankyoupagerce-6664177854284081")).isDisplayed());
	}
	
	public void clickSigninButton() {
		signinButton.click();
	}
}
