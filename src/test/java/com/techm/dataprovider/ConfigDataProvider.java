package com.techm.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
 Properties pr;
	public ConfigDataProvider()
	{
		File f1=new File("./Configuration/config.properties");
		
		try
		{
			FileInputStream fis=new FileInputStream(f1);
			pr=new Properties();
			pr.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
public  String getChromePath()

{
	String path=pr.getProperty("Chromepath");
	return path;
}
public String getIEPath()

{
	String path=pr.getProperty("IEPath");
	return path;
}
public String getApplicationUrl()

{
	String url=pr.getProperty("Url");
	return url;
}
public String getFirefoxPath()

{
	String path=pr.getProperty("firefoxpath");
	return path;
}
}
