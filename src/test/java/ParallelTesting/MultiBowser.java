package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBowser 
{
	WebDriver driver;
	
	
	@Parameters("browser")
	@Test 
   public void setUp(String browser)
   {
	if (browser.equalsIgnoreCase("chrome"))	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAGRUTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
	}
	
	else if (browser.equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\JAGRUTI\\Downloads\\edgedriver_win64 (2)\\msedgedriver2.exe");
		driver= new EdgeDriver();
	}
	
	
	//driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.close();
	
	
	//driver.findElement(By.name("q")).sendKeys("Selenium testing");
	
	
		
   }
	

	
	
}
