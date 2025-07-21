package com.MyTests;

import org.testng.annotations.Test;

public class D04GetLoginData {
	@Test(dataProvider = "getData", dataProviderClass = com.MyTests.D03ReadFromExcel.class)
	public void displayData(String un, String ps, String rs) {
		System.out.println(un);
		System.out.println(ps);
		System.out.println(rs);
	}
}
