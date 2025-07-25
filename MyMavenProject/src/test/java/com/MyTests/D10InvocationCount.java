package com.MyTests;

import org.testng.annotations.Test;

public class D10InvocationCount {
  @Test(invocationCount = 5)
  public void myTest() {
	  System.out.println("This is my test!!!");
  }
}
