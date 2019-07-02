package com.StepDefinitions;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	List<WebElement> sharedServices;
	
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

	@Then("^YOU logo should be displayed$")
	public void you_logo_should_be_displayed() throws Throwable {
		System.out.println("Is YOU logo displayed : " + homePage.isYouLogoDisplayed());
	    Assert.assertTrue(homePage.isYouLogoDisplayed());	 		//test case is written(logo display verification)
	}

	@Then("^Yash Logo should be displayed$")
	public void yash_Logo_should_be_displayed() throws Throwable {
	    System.out.println("Is Yash logo displayed : " + homePage.isYashLogoDisplayed());
	    Assert.assertTrue(homePage.isYashLogoDisplayed());
	}
	
	@Then("^get Shared Services list$")
	public void get_Shared_Services_list() throws Throwable {
		sharedServices = homePage.getListOfSharedServices();
		System.out.println("No. of shared services are : " + sharedServices.size() + " and these are;");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		for(WebElement element : sharedServices) {
			wait.until(ExpectedConditions.visibilityOf(element));
			if(!element.getText().isEmpty()) {
				System.out.println(element.getText());
			}else
				System.out.println("it's blank");
		}
	}

	@When("^we click on Infogram button$")
	public void we_click_on_Infogram_button() throws Throwable {
		infogramPage = homePage.clickOnInfogramBtn(); 
	}

	@Then("^Infogram Page should open$")
	public void infogram_Page_should_open() throws Throwable {
	   
	}
}
