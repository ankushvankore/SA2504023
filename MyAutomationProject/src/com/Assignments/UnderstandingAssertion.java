package com.Assignments;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UnderstandingAssertion {
	@Test
	public void test() {
		String name = "Ankush";
		//Assert.assertTrue(name.contains("ankush"));
		SoftAssert ast = new SoftAssert();
		ast.assertEquals(name, "Sachin");
		System.out.println("Test ends");
		ast.assertAll();
	}
}
