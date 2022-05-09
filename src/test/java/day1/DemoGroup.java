package day1;

import org.testng.annotations.Test;

public class DemoGroup 
{


	@Test(groups = "Regression")
	public void abc() {
		System.out.println("Regression Testing: Sample1 ");
	}

	@Test(groups = "UAT")
	public void home() {
		System.out.println("UAT Testing Sample1 ");
	}

	@Test(groups = "System")
	public void search() {
		System.out.println("System Testing Sample1 ");
	}

	@Test(groups = "Sanity")
	public void admin() {
		System.out.println("sanity Testing Sample1 ");
	}
	
	@Test(groups="UAT")
	
	public void pqr()
	{
		System.out.println("UAT2 Testing Sample1 ");
	}
	
	
	@Test(groups="Sanity")
	public void xyz()
	{
		System.out.println("sanity2 Testing Sample1 ");	
	}

}
	
	
	
	

