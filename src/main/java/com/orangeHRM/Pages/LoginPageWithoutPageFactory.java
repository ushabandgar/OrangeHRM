package com.orangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.orangeHRM.base.TestBase;

public class LoginPageWithoutPageFactory {

	//constructor: to initiate driver
	//locators: to locate the web element
	//action methods: to do action 
	
	//1.without page factory
	
	WebDriver driver;
	public LoginPageWithoutPageFactory(WebDriver driver){
		this.driver=driver;
	}
	
	By username=By.xpath("//input[@name=\"username\"]");
	By password=By.xpath("//input[@name=\"password\"]");
	By loginButton=By.xpath("//button[@type=\"submit\"]");
	
	public void getUsername(){
		driver.findElement(username).sendKeys("Admin");
	}
	
	public void getPassword(){
		driver.findElement(password).sendKeys("admin123");
	}
	public void clickOnLogin(){
		driver.findElement(loginButton).click();;
	}
	
	public void verifyLogin(){
		String actualURL=driver.getCurrentUrl();
		Assert.assertTrue(actualURL.contains("dashboard"));
	}
	
}
