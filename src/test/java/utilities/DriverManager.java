package utilities;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

	private static WebDriver driver;
	private static String customSessionId;

	private DriverManager() {
	};

	public static WebDriver getInstance() {
		try {
			if (driver == null) {
				System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
				ChromeOptions Option = new ChromeOptions();
				Option.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(Option);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			}
		} catch (Exception e) {
			assertTrue(false, e.getMessage());
		}
		return driver;
	}

	public static String getSessionId() {
		if (customSessionId == null) {
			customSessionId = Util.get6DigitCode() + "";
		}
		return customSessionId;
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
		if (customSessionId != null) {
			customSessionId = null;
		}
	}

}
