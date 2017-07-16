package com.techm.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.techm.factory.BrowserFactory;
import com.techm.factory.DataProviderFactory;


public class GoogleHomePage {
	
	@Test
	public void verifyGoogleHomePage()
	{
		WebDriver driver=BrowserFactory.getBrowser("firefox");
		//driver.switchTo().alert().accept();
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}

}
 