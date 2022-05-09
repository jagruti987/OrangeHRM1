package day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAndSoftDepend 
{
	
	@Test 
 public void login()
 {
	Assert.assertEquals("login", "abc"); 
	 
 }
	
	@Test (dependsOnMethods= {"login"}, priority=2, alwaysRun=true )
	public void homePage()
	{
		System.out.println("Homepage");
		
	}
	
	@Test(priority = 3)
	public void pimFunctionality() {
		System.out.println("PIM functionality");
	}

	@Test(priority = 4)
	public void logoutFunctionality() {
		System.out.println("Log out functionality");
	}
	
	
}
