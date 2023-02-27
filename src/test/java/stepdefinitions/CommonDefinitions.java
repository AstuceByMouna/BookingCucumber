package stepdefinitions;

import generic.Constants;

import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import driverconf.ConfigReader;
import driverconf.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CommonDefinitions {

	protected static WebDriver driver;
	static DriverFactory driverFactory;

	@Before
	public static void setup() {
		String browser = ConfigReader.getborowserType();
		driverFactory = new DriverFactory();
		driver = driverFactory.initializeDrivers(browser);
	}

	@After
	public void tearDown(Scenario scenario) {
		try {
			String screenshotName = scenario.getName().replaceAll("", "_");
			if (scenario.isFailed()) {
				TakesScreenshot ts = (TakesScreenshot) driver;
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "img/png", screenshotName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// driver.quit();
	}

}
