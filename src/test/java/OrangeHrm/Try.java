package OrangeHrm;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Try 
{
  WebDriver driver;
   
  @BeforeMethod 
  public void setUpAndLogin()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAGRUTI\\Downloads\\chromedriver_win32\\chromedriver.exe");

	 driver= new ChromeDriver();
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	 
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
		
  }
  @Test (priority=1)
  public void homePage()
  {
	 boolean logostatus= driver.findElement(By.xpath("//img[@alt='OrangeHRM']")).isDisplayed();
	Assert.assertEquals(logostatus, true); 
  }
  
  @Test
	public void pimpage()
	{
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		boolean pimpage=driver.getCurrentUrl().contains("pim");
		
		Assert.assertEquals(pimpage,true);
		
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys("abc");
		driver.findElement(By.id("lastName")).sendKeys("abc");
		driver.findElement(By.id("btnSave")).click();
	}
	

	
}
