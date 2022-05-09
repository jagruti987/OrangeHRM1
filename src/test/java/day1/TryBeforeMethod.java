package day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TryBeforeMethod
{

	@BeforeMethod
	public void setUpandLogin() {
		System.out.println("Before method");
	}

      @Test 
	public void homepage() {
		System.out.println("Home Page");
	}

	@Test(priority = 2)
	public void pimpage() {
		System.out.println("PIM Page");
	}

	@Test(priority = 3)
	public void searchPIMUserpage() {
		System.out.println("Search PIM User");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("After method");
		System.out.println("------------------------------");
	}
	
}
