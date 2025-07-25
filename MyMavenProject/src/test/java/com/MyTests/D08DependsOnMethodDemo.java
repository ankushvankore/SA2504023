package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D08DependsOnMethodDemo {
  @Test(priority = 1)
  public void login() {
	  System.out.println("Login Test");
	  Assert.assertTrue(false);
  }
  @Test(priority = 2, dependsOnMethods = "login")
  public void logout()
  {
	  System.out.println("Logout Test");
  }
}
