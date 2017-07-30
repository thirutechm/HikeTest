package com.techm.factory;

import com.techm.dataprovider.ConfigDataProvider;
import com.techm.dataprovider.ExcelDataProvider;

public class DataProviderFactory {
	
	public static ExcelDataProvider getExcel()
	{
		ExcelDataProvider ex=new ExcelDataProvider();
		return ex;
	}
	public static ConfigDataProvider getConfig()
	{
		ConfigDataProvider config=new ConfigDataProvider();
		return config;
	}
}
