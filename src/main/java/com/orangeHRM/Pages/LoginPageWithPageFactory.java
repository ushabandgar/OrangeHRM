package com.orangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageWithPageFactory {
	WebDriver driver;
	public LoginPageWithPageFactory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@name=\"username\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement loginButton;
	
	@FindBy(xpath="//img[@src=\"/web/images/ohrm_branding.png?v=1721393199309\"]")
	WebElement appLogo;
	
	public void enterUsername(){
		username.sendKeys("Admin");
	}
	public void enterPassword(){
		password.sendKeys("admin123");
	}
	public void clickOnLogin(){
		loginButton.click();;
	}
	
	public void verifyLogin(){
		String actualURL=driver.getCurrentUrl();
		Assert.assertTrue(actualURL.contains("dashboard"));
	}
	
	public void verifyAppLogo() {
		Assert.assertTrue(appLogo.isDisplayed());
	}
	public void verifyLoginPageTitle() {
		String loginPageTitle=driver.getCurrentUrl();
		Assert.assertTrue(loginPageTitle.equals("OrangeHRM"));
	}
}
