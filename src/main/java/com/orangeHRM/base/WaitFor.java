package com.orangeHRM.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitFor {

	FluentWait wait;
	
	public void elementToBeClickable(WebElement element){
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
