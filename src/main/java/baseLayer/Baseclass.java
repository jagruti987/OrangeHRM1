package baseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass 
{
WebDriver driver;

public void initialization()
{
  System.setProperty("webdriver.chrome.driver","C:\\Users\\JAGRUTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
  driver= new ChromeDriver();	
  driver.get("https://www.facebook.com");
}	
}
