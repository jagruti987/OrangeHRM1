package com.TestNG.SeleniumWithTestNG;

import org.testng.annotations.Test;

public class Demo2
{
     @Test (priority=1)
	public void login()
	{
		System.out.println("login");
		
	}
	@Test(priority=3)
	
	public void logout()
	{
		System.out.println("login");
		
	}
	@Test (priority=2)
	public void search()
	{
		System.out.println("login");
		
	}
	
	
}
