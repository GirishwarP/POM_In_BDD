package com.YOU.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.YOU.Base.Base;

public class HomePage extends Base {
	
	//Object Repository
	@FindBy(id="zz6_Menu")
	private WebElement userName;
	
	@FindBy(xpath="//img[contains(@title, 'YASH Online Universe')]")
	private WebElement youLogo;
	
	@FindBy(xpath="//a[contains(@title, 'YASH Infogram')]")
	private WebElement infogramBtn;
	
	//constructor
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getUserName() {
		return userName.getText();
	}
	
	public boolean isYouLogoDisplayed() {
		return youLogo.isDisplayed();
	}
	
	public InfogramPage clickOnInfogramBtn() {
		infogramBtn.click();
		return new InfogramPage();
	}
}
