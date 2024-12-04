package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.omrpage.pagemanager.pageobjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import omrbranchhotel.BaseClass;

public class TC1_LoginStep extends BaseClass {
	pageobjectManager pom = new pageobjectManager();

	@Given("User Is On OMRranch Hotel Page")
	public void user_is_on_om_rranch_hotel_page() throws FileNotFoundException, IOException {
		browsertype(getpropertyfilevalue("browserType"));
		enterApplnUrl(getpropertyfilevalue("url"));
		maximizeWindow();
		implicitWait(60);

	}

	@When("User Login {string},{string}")
	public void user_login(String username, String password) {
		pom.getLoginpage().login(username, password);
	}

	@When("User Login {string},{string} with ENTER key")
	public void user_login_with_enter_key(String username, String password) {
		pom.getLoginpage().login(username, password);
	}

	@Then("User Should Verefy The Success Message After Login {string}")
	public void user_should_verefy_the_success_message_after_login(String string) {

	}

	@Then("User Should Verefy The Error Message After Login {string}")
	public void user_should_verefy_the_error_message_after_login(String loginerrormsg) {
	 WebElement loginerrortxtmsg = pom.getLoginpage().getLoginerrortxtmsg();
	 boolean contains = loginerrormsg.contains(loginerrormsg);
	 Assert.assertTrue("verify after login error msg", contains);
	
		
	}
}
