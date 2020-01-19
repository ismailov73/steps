package com.automationpractice.steps.warm_up;

import com.automationpractice.utilities.CommonStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import warm_up.AutomationPracticeTablePage;

import static org.junit.Assert.*;

public class AutomationPracticeTableSteps extends CommonStep {
	/*
	 * Sample table steps 
	 */
	
	private AutomationPracticeTablePage automationPracticeTablePage =
			AutomationPracticeTablePage.getAutomationPracticeTablePage(getDriver());
	
	@Given("User navigates to {string}")
	public void user_navigates_to(String string) {
	    String header = automationPracticeTablePage.getHeader();
	    assertEquals("Automation Practice Table", header);
	}

	@When("User is able to view Sample table")
	public void user_is_able_to_view_Sample_table() {
	    assertTrue(automationPracticeTablePage.isTableDisplayed());
	}

	@Then("User should be able to print values to console")
	public void user_should_be_able_to_print_values_to_console() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}
}
