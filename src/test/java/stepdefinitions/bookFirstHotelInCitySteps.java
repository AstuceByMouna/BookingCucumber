package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PagesObjects.manageAccountsPage;
import PagesObjects.passwordPage;
import PagesObjects.personalDetailsPage;
import PagesObjects.signUpPage;
import generic.Constants;

public class bookFirstHotelInCitySteps {
	@Given("I have account created")
	public void i_have_account_created() {
		System.out.println("I have account created");
	}

	@Given("I am in Home page")
	public void i_am_in_Home_page() {
		System.out.println("I am in Home page");

	}

	@When("I set up destination as {string}")
	public void i_set_up_destination_as(String string) {
		System.out.println("i_set_up_destination_as");

	}

	@When("I set dates {string} and {string}")
	public void i_set_dates_and(String string, String string2) {
		System.out.println("i_set_dates_and");

	}

	@When("I select {string} adults and {string} children")
	public void i_select_adults_and_children(String string, String string2) {
		System.out.println("i_select_adults_and_children");

	}

	@When("I click on “See availability” for fist hotel in the list")
	public void i_click_on_See_availability_for_fist_hotel_in_the_list() {
		System.out.println("i_click_on_See_availability_for_fist_hotel_in_the_list");

	}

	@When("I click on “Reserve” button for recommended room")
	public void i_click_on_Reserve_button_for_recommended_room() {
		System.out.println("i_click_on_Reserve_button_for_recommended_room");

	}

	@When("I click on “I'll Reserve” button")
	public void i_click_on_I_ll_Reserve_button() {
		System.out.println("i_click_on_I_ll_Reserve_button");

	}

	@Then("“Checkout” page is displayed")
	public void checkout_page_is_displayed() {
		System.out.println("checkout_page_is_displayed");

	}

	@Then("I enter valid booking information")
	public void i_enter_valid_booking_information() {
		System.out.println("i_enter_valid_booking_information");

	}

	@Then("“Final Details” page is displayed")
	public void final_Details_page_is_displayed() {
		System.out.println("final_Details_page_is_displayed");

	}
}
