package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PagesObjects.homePage;
import PagesObjects.manageAccountsPage;
import PagesObjects.passwordPage;
import PagesObjects.personalDetailsPage;
import PagesObjects.signUpPage;
import generic.Constants;
import generic.GenericMethods;

public class accountCreationSteps {
	private WebDriver driver;
	private homePage HomePage;
	private signUpPage SignUpPage;
	private passwordPage PasswordPage;
	private manageAccountsPage ManageAccountsPage;
	private personalDetailsPage PersonalDetailsPage;
	private WebDriverWait wait;
	private GenericMethods genericMethods;
	String homepagetitle = " Booking.com | Site officiel | Hôtels, vols, voitures de location et hébergements";
	String signuppagetitle = "Booking.com";
	String passwordpagetitle = "Create a password for your new account | Booking.com";
	String manageaccountpagetitle = "Booking.com";

	public accountCreationSteps() {
		this.driver = CommonDefinitions.driver;
	}

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		driver.get(Constants.BOOKING_PROD_URL);
		driver.manage().window().fullscreen();

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		HomePage = new homePage(driver);
		// the modal button appears on chrone and not in firefox , so i made a
		// pallaiative solution tu wait until it appears and then click else , do
		// nothing: i will change it to test with the browser name
		int n = 10;
		genericMethods = new GenericMethods(driver);
		while (n > 0) {
			if (HomePage.searchGeniusModalButton() != 0) {
				HomePage.clickGeniusModalButton();
				n = 0;
			} else {
				genericMethods.pause(1000);
				n = n - 1;
			}
		}
	}

	@Given("language used is English")
	public void language_used_is_english() {
		if (!HomePage.getPageLanguage().equals("en")) {
			HomePage.clickLanguageButton();
			HomePage.clickEnglishButton();
		}
	}

	@Given("Currency is USD")
	public void currency_is_usd() {

		if (!HomePage.getSelectedCurrency().equals("US dollar")) {
			HomePage.clickCurrencyButton();
			HomePage.clickDollarCurrencyButton();
		}
	}

	@Given("I am in Sign Up page")
	public void i_am_in_sign_up_page() {
		HomePage.clickSignUpButton();
		Assert.assertEquals(driver.getTitle(), signuppagetitle);
	}

	@When("I enter valid {string}")
	public void i_enter_valid(String username) {
		SignUpPage = new signUpPage(driver);
		SignUpPage.enterEmail(username);
	}

	@When("click on “GET STARTED” button")
	public void click_on_get_started_button() {
		SignUpPage.clickGetStartedButton();
		Assert.assertEquals(driver.getTitle(), passwordpagetitle);

	}

	@When("I enter valid {string} two times")
	public void i_enter_valid_two_times(String password) {
		PasswordPage = new passwordPage(driver);
		PasswordPage.enterNewPassword(password);
		PasswordPage.enterconfirmedPassword(password);

	}

	@When("click on “Create Account” button")
	public void click_on_create_account_button() {
		PasswordPage.clickCreateAccountButton();

	}

	@When("main page is opened")
	public void main_page_is_opened() {
		Assert.assertEquals(driver.getTitle(), homepagetitle);
		HomePage = new homePage(driver);
		HomePage.clickModalMaskCloseButton();

	}

	@When("I click on “Manage Acounts” button under account menu")
	public void i_click_on_manage_acounts_button_under_account_menu() {
		HomePage.clickAccountMenuButton();
		HomePage.clickManageAccountButton();
		Assert.assertTrue(driver.getTitle().equals(manageaccountpagetitle));
	}

	@When("I click on “Personal Details” button under manage accounts section")
	public void i_click_on_personal_details_button_under_manage_accounts_section() {

		ManageAccountsPage = new manageAccountsPage(driver);
		ManageAccountsPage.clickPersonalDetailsButton();
	}

	@Then("“Personal Details” page is opened")
	public void personal_details_page_is_opened() {
		Assert.assertTrue(driver.getCurrentUrl().contains("https://account.booking.com/mysettings/personal?"));

	}

	@Then("correct value is prefilled in email verification placeholder based on registered {string}")
	public void correct_value_is_prefilled_in_email_verification_placeholder_based_on_registered(String usermail) {
		PersonalDetailsPage = new personalDetailsPage(driver);
		PersonalDetailsPage.clickmodifyButton();

		Assert.assertEquals(false, PersonalDetailsPage.getemailVerificationvalue());
	}
}
