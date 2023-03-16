package utilities;

import org.openqa.selenium.WebDriver;

import pageObjects.*;

public class PageManager {

	private static PageManager pageManager;
	private WebDriver driver;

	private SearchPage searchPage;
	private LoginPage loginPage;

	private PageManager(WebDriver driver) {
		this.driver = driver;
	}

	public static PageManager getInstance() {
		if (pageManager == null) {
			pageManager = new PageManager(DriverManager.getInstance());
		}
		return pageManager;
	}

	public static void cleanup() {
		if (pageManager != null) {
			pageManager = null;
		}
	}

	public SearchPage searchPage() {
		if (searchPage == null) {
			searchPage = new SearchPage(driver);
		}
		return searchPage;
	}
<<<<<<< HEAD

}
=======
	public LoginPage loginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage(driver);
		}
		return loginPage;
	}


	}

>>>>>>> 4a6b08f (changes)
