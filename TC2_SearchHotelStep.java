package com.omrbranch.stepdefinition;

import com.omrpage.pagemanager.pageobjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep {
	pageobjectManager pom = new pageobjectManager();

	@When("User search hotels {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotels_and(String sateName, String cityName, String roomType, String checkinDate,
			String checkutDate, String noofroom, String noofadult, String noofchild) {
		pom.getSearchHotelPage().selectallfields(sateName, cityName, roomType, checkinDate, checkutDate, noofroom,
				noofadult, noofchild);
		pom.getSearchHotelPage().switchToDefault();

	}

	@Then("user should verify success message after search hotel {string}")
	public void user_should_verify_success_message_after_search_hotel(String string) {

	}

	@When("user click the low to high sort option")
	public void user_click_the_low_to_high_sort_option() throws InterruptedException {
		pom.getSelectHotelPage().clicklowtohighbtn();
		pom.getSelectHotelPage().selectlowtohighprice();
	}

	@Then("user should verify the low to high price option")
	public void user_should_verify_the_low_to_high_price_option() {

	}

	@Then("user should verify success message after search hotel\"Select Hotel\"")
	public void user_should_verify_success_message_after_search_hotel_select_hotel() {
	
	}
}
