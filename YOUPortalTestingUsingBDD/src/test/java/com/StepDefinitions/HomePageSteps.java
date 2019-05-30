package com.StepDefinitions;

import com.YOU.Base.Base;
import com.YOU.Pages.HomePage;
import com.YOU.Pages.InfogramPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class HomePageSteps extends Base {

	HomePage homePage;
	InfogramPage infogramPage;
	
	@Given("^Enter the URL of YOU portal$")
	public void enter_the_URL_of_YOU_portal() throws Throwable {
		initialization();	//Base class method to initialize driver and hit URL
	}

	@When("^YOU home page open$")
	public void you_home_page_open() throws Throwable {
		homePage = new HomePage();	//HomePage object is created
	}

	@Then("^the User name validation should be true$")
	public void the_User_name_validation_should_be_true() throws Throwable {
	    String userName = homePage.getUserName();
	    System.out.println("User name on Home page : " + userName);
	    Assert.assertEquals("Girishwar Jaykumar Patil", userName);   //test case is written(User name assertion)
	}

	@Then("^the YOU logo should be displayed$")
	public void the_YOU_logo_should_be_displayed() throws Throwable {
		System.out.println("Is YOU logo displayed : " + homePage.isYouLogoDisplayed());
	    Assert.assertTrue(homePage.isYouLogoDisplayed());	 		//test case is written(logo display verification)
	}

	@When("^we click on Infogram button$")
	public void we_click_on_Infogram_button() throws Throwable {
		infogramPage = homePage.clickOnInfogramBtn(); 
	}

	@Then("^Infogram Page should open$")
	public void infogram_Page_should_open() throws Throwable {
	   
	}
}
