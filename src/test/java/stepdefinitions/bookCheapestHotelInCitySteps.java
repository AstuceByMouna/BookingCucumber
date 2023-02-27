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

public class bookCheapestHotelInCitySteps {

	@When("I click on “Search” button")
	public void i_click_on_Search_button() {
		System.out.println("i_click_on_Search_button");
	}

	@When("I click on “See availability” for the cheapest hotel in the list with a rating above {string} stars")
	public void i_click_on_See_availability_for_the_cheapest_hotel_in_the_list_with_a_rating_above_stars(
			String string) {
		System.out.println("i_click_on_See_availability_for_the_cheapest_hotel_in_the_list_with_a_rating_above_stars");

	}

	@When("“Hotel Details” page is opened for selected hotel")
	public void hotel_Details_page_is_opened_for_selected_hotel() {
		System.out.println("i_click_on_See_availability_for_the_cheapest_hotel_in_the_list_with_a_rating_above_stars");

	}

	@When("I click on “I'll Reserve” button for the most expensive available room in the hotel")
	public void i_click_on_I_ll_Reserve_button_for_the_most_expensive_available_room_in_the_hotel() {
		System.out.println("i_click_on_I_ll_Reserve_button_for_the_most_expensive_available_room_in_the_hotel");

	}

	@Then("“Checkout” page is displayed dates are correct price matches the price in details page")
	public void checkout_page_is_displayed_dates_are_correct_price_matches_the_price_in_details_page() {
		System.out.println("checkout_page_is_displayed_dates_are_correct_price_matches_the_price_in_details_page");

	}

	@Then("I click on “Next: Final Details” button")
	public void i_click_on_Next_Final_Details_button() {
		System.out.println("i_click_on_Next_Final_Details_button");

	}

	@Then("“Final Details” page is displaye")
	public void final_Details_page_is_displaye() {
		System.out.println("final_Details_page_is_displaye");

	}
}
