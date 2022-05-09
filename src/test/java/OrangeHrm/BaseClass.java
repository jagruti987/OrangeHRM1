package OrangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;
	
   public  void initialization()
   {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\JAGRUTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 
	   
   }
	
	
}
