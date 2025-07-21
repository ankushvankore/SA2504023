package com.MyTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class D03ReadFromExcel {

	public static void main(String[] args) throws IOException {
		String[][] d = getData();
		for(int i = 0; i < 7; i++)
		{
			for(int j = 0; j <3; j++)
				System.out.println(d[i][j]);
		}
	}
	@DataProvider
	public static String[][] getData() throws IOException
	{
		File file = new File("D:\\StarAgile\\Demos\\SA2504023\\MyAutomationProject\\ExcelFiles\\LoginData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String [][]data = new String[sheet.getPhysicalNumberOfRows()][3];
		
		for(int i = 0; i < sheet.getPhysicalNumberOfRows(); i++)
		{
			for(int j = 0; j < 3; j++)
			{
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		wb.close();
		fis.close();
		
		return data;
	}

}
