package com.techm.utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic {
	public static void captureSreenShot(WebDriver driver ,String sreenshotname)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String destination="./Screenshots/"+sreenshotname+System.currentTimeMillis()+".png";
		try
		{
			FileUtils.copyFile(src, new File(destination));
		}
		catch(Exception e)
		{
			System.out.println("Failed to copy sreenshots"+e.getMessage());
		}
	}

}
