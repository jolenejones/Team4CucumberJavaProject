package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	
	
	@FindBy(xpath = "//div[text()='Use another account']")
	private WebElement anotherAccount;
	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailField;
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextButton;
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordField;
	@FindBy(xpath = "//div[text()='You’re signed in']")
	private WebElement signinMessage;
	
	
	

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickanotherAccount() {
		anotherAccount.click();
	}
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	
	}
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
		
	}
	public void validateMessage() {
		signinMessage.isDisplayed();
	}
	public void clickNext() {
		nextButton.click();
	}
	
	
	
	
	
	

}
