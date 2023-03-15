package utilities;

import org.openqa.selenium.WebDriver;

import pageObjects.*;

public class PageManager {

	private static PageManager pageManager;
	private WebDriver driver;

	private HomePage homePage;
	private SearchPage searchPage;


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

	public HomePage homePage() {
		if (homePage == null) {
			homePage = new HomePage(driver);
		}
		return homePage;
	}


	public SearchPage searchPage() {
		if (searchPage == null) {
			searchPage = new SearchPage(driver);
		}
		return searchPage;
	}



	}

