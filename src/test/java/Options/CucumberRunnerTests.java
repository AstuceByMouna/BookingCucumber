package Options;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driverconf.ConfigReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(plugin = { "pretty" }, tags = { "" }, features = { "src/test/java/features" }, glue = {
		"stepdefinitions" })
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@BeforeTest
	@Parameters("browser")
	public void defineBrowser(String browser) throws Throwable {
		ConfigReader.setBorowserType(browser);
	}

}