package day1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore 
public class Demo2 
{
	@Test 
	  public void lmn()
	  {
		  System.out.println("lmn test cases");
	  }
		
		@Test (enabled=false)
		  public void xyz()
		  {
			  System.out.println("xyz test cases");
		  }

}
