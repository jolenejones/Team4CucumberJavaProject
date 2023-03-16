package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

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

//	Constructor
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
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


}

