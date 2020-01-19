package com.automationpractice.steps.warm_up;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationpractice.pages.contact_us.ContactUsPage;
import com.automationpractice.utilities.CommonStep;
import com.automationpractice.utilities.TestDataGenerator;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import warm_up.AutomationPracticeCreateAccountPage;

public class AutomationPracticeCreateAccountSteps extends CommonStep {
	
 AutomationPracticeCreateAccountPage  automationPracticeCreateAccountPage = AutomationPracticeCreateAccountPage.getAutomationPracticeCreateAccountPage(getDriver());
	
	
	
	@Given("I am on home page")
	public void i_am_on_home_page() {
      
	}

	@And("Click on sign in button")
	public void i_click_on_sing_in_button() {
		automationPracticeCreateAccountPage.clickLoginButton();
	  
	}
	
	@Given("In email address text field of left side enter already registered email address")
	public void in_email_address_text_field_of_left_side_enter_already_registered_email_address() {
		automationPracticeCreateAccountPage.enterEmailAddress("abc@mailinator.com");
		
	}
	
	@Then("Click on create an account button and verify error message displayed")
	public void click_on_create_an_account_button_and_verify_error_message_displayed() {
		automationPracticeCreateAccountPage.enterSubmit();
		String actualText = automationPracticeCreateAccountPage.errorText();
		assertEquals("An account using this email address has already been registered. Please enter a valid password or request a new one.", actualText);
		System.out.println(actualText);
	}

	@Given("In email address text field of left side enter new email address")
	public void in_email_address_text_field_of_left_side_enter_new_email_address() {
		String email = "abcd213@mailinator.com";
		automationPracticeCreateAccountPage.enterEmailAddress(email);
	}
	
	@Given("Click on create account")
	public void click_on_create_account() {
		automationPracticeCreateAccountPage.enterSubmit();
	}
	
	@Then("Click on register and verify error messages displayed")
	public void click_on_register_and_verify_error_messages_displayed() {
	    automationPracticeCreateAccountPage.clickRegister();
	    
	    String actualText = automationPracticeCreateAccountPage.errorText1();
	    assertEquals("You must register at least one phone number.", actualText);
	    
	    String actualText2 = automationPracticeCreateAccountPage.errorText2();
	    assertEquals("lastname is required.", actualText2);
	    
	    String acutalText3 = automationPracticeCreateAccountPage.errorText3();
	    assertEquals("firstname is required.", acutalText3);
	    
	    String actualText4 = automationPracticeCreateAccountPage.errorText4();
	    assertEquals("passwd is required.", actualText4);
	    
	    String actualText5 = automationPracticeCreateAccountPage.errorText5();
	    assertEquals("address1 is required.", actualText5);
	    
	    String actualText6 = automationPracticeCreateAccountPage.errorText6();
	    assertEquals("city is required.", actualText6);
	    
	    String actualText7 = automationPracticeCreateAccountPage.errorText7();
	    assertEquals("The Zip/Postal code you've entered is invalid. It must follow this format: 00000", actualText7);
	    
	    String actualText8 = automationPracticeCreateAccountPage.errorText8();
	    assertEquals("This country requires you to choose a State.", actualText8);
	    
	}
	
	@Then("Fill up the apllication with data provided")
	public void fill_up_the_apllication_with_data_provided() {
	    automationPracticeCreateAccountPage.selectGender();
	    
	   // String firstName = "John";
	    automationPracticeCreateAccountPage.enterFirstName();
	    
	    String lastName = "Smith";
	    automationPracticeCreateAccountPage.enterLastName(lastName);
	    
	    String str = automationPracticeCreateAccountPage.validateEmail();
		assertEquals("abcd213@mailinator.com", str);
	    System.out.println(str);  //get attribute
	    
	    String password = "MyStrong_Password";
	    automationPracticeCreateAccountPage.createPassword(password);
	    
	   
	    automationPracticeCreateAccountPage.clickOnDay();
	   
	    
	    automationPracticeCreateAccountPage.pickOnDay();
	    
	    String fName = automationPracticeCreateAccountPage.validateFName();
	    assertEquals("John", fName);
	    System.out.println(fName);
	    
	    String lName = automationPracticeCreateAccountPage.validateLName();
	    assertEquals("Smith", lName);
	    System.out.println(lName);
	    
	    String compName = "Time and Training";
	    automationPracticeCreateAccountPage.CompanyName(compName);
	    
	    
	     
	     
	     
//	    Select select = new Select(element);
//	   select.selectByValue("22");
	    
	}
	
	
	
//	@And("On create account email box enter email and click on create account")
//	public void on_create_acoount_email_box_I_put_my_email_and_click_on_create_account() {
//		String firstName = TestDataGenerator.getRandomFirstName();
//		String lastName = TestDataGenerator.getRandomLastName();
//		automationPracticeCreateAccountPage.enterEmailAddress(TestDataGenerator.getRandomEmail(firstName, lastName));
//		automationPracticeCreateAccountPage.enterSubmit();
//	}

//	@Given("Start filling up information fileds")
//	public void i_start_filling_up_information_fileds() {
//		automationPracticeCreateAccountPage.selectGender();
//		String firstName = TestDataGenerator.getRandomFirstName();
//		automationPracticeCreateAccountPage.enterFirstName(firstName);
//		String lastName = TestDataGenerator.getRandomLastName();
//		automationPracticeCreateAccountPage.enterLastName(lastName);
//	    automationPracticeCreateAccountPage.validateEmail();
//	    automationPracticeCreateAccountPage.createPassword(firstName + lastName);
//	    automationPracticeCreateAccountPage.clickOnDay();
//	    automationPracticeCreateAccountPage.pickOnDay();
//	    automationPracticeCreateAccountPage.selectMonthValue();
//	    automationPracticeCreateAccountPage.selectYearValue();
//	    automationPracticeCreateAccountPage.selectCheckBox();
//	    automationPracticeCreateAccountPage.selectOptin();
//	    automationPracticeCreateAccountPage.enterAddress();
//	    automationPracticeCreateAccountPage.enterAddress2();
//	    automationPracticeCreateAccountPage.enterCity();
//	    automationPracticeCreateAccountPage.enterState();
//	    automationPracticeCreateAccountPage.additionalInfo(TestDataGenerator.getRandomText(50));
//	    automationPracticeCreateAccountPage.phoneNumber();
//	    automationPracticeCreateAccountPage.enterfutureReference();
//	   
//	    
//	    
//	}
//
//	@When("Click on register")
//	public void i_click_register() {
//		 automationPracticeCreateAccountPage.enterRegister();
//	}
//
//	@Then("It should take me to my account page")
//		public void validateAccount() {
//	System.out.println("actualText");
//	
//	}

}
