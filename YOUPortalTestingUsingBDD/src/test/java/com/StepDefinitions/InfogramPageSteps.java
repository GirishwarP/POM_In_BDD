package com.StepDefinitions;

import com.YOU.Base.Base;
import com.YOU.Pages.HomePage;
import com.YOU.Pages.InfogramPage;
import com.YOU.util.Utility;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class InfogramPageSteps extends Base {

	HomePage homePage;
	InfogramPage infogramPage;
	
	@When("^YOU home page open And we click on Infogram button$")
	public void you_home_page_open_And_we_click_on_Infogram_button() throws Throwable {
		homePage = new HomePage(); 
		infogramPage = homePage.clickOnInfogramBtn(); 
		driver.switchTo().window(Utility.getWindowID());	//switching window(to infogram page)
		System.out.println("Switching to infogram page");
	}

	@Then("^Infogram page should open And the user name validation should be true$")
	public void infogram_page_should_open_And_the_user_name_validation_should_be_true() throws Throwable {
		String userName = infogramPage.getUserName();
		System.out.println("User name on Infogram page : " + userName);
		Assert.assertEquals("Girishwar Patil", userName); // test case is written(User name assertion)
	}
}
