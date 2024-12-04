package com.omrbranch.stepdefinition;

import com.omrpage.pagemanager.pageobjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelStep {
	pageobjectManager pom = new pageobjectManager();

	@When("User save the first hotel name, hotel price")
	public void user_save_the_first_hotel_name_hotel_price() {

	}

	@When("User select the first hotel name")
	public void user_select_the_first_hotel_name() {
		pom.getSelectHotelPage().continuebtn();
	}

	@When("User accept the hotel booking alert")
	public void user_accept_the_hotel_booking_alert() {
		pom.getSelectHotelPage().acceptAlert();
	}

	@Then("User should verify after select hotel the success message {string}")
	public void user_should_verify_after_select_hotel_the_success_message(String string) {

	}

	@When("User dismiss the hotel booking alert")
	public void user_dismiss_the_hotel_booking_alert() {
		pom.getSelectHotelPage().dismissalert();
	}

}
