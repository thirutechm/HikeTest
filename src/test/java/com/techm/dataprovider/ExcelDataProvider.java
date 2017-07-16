package com.techm.dataprovider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	 XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		File f1=new File("./ApplicationTestData/AppData.xlsx");
		try
		{
			FileInputStream fis=new FileInputStream(f1);
			wb=new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public String getdata(String sheetName,int row,int coloumn)
	{
		String data=wb.getSheet(sheetName).getRow(row).getCell(coloumn).getStringCellValue();
		return data;
		
	}
	public String getdata(int sheetindex,int row,int coloumn)
	{
		String data=wb.getSheetAt(sheetindex).getRow(row).getCell(coloumn).getStringCellValue();
		return data;
		
	}

}
