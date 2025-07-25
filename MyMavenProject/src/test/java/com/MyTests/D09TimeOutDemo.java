package com.MyTests;

import org.testng.annotations.Test;

public class D09TimeOutDemo {
  @Test(timeOut = 3000)
  public void test1() throws InterruptedException {
	  System.out.println("Test Started");
	  Thread.sleep(2500);
	  System.out.println("Test Ended");
  }
}
