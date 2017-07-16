package com.techm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage {
	WebDriver driver;
	public GoogleHomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
@FindBy(id="lst-ib")
WebElement googleSerchBox;

public WebElement getGoogleSerachBox()
{
	
	return googleSerchBox;
}
public String getGoogleTitle()
{
	
	return driver.getTitle();
}
}
