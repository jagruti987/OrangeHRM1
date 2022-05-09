package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FBDemo 
{
  
	@Test (dataProvider="Login")
	
	public void register(String fname, String lname) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAGRUTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();	
		  driver.get("https://www.facebook.com/reg/");
		  
		  driver.findElement(By.name("firstname")).sendKeys(fname);
		  driver.findElement(By.name("lastname")).sendKeys(lname);
		  Thread.sleep(5000);
		  driver.quit();
		  
		  
		  
	}
	
	@DataProvider(name="Login")
	
		public Object[][] testdata()
	{
		ExelReader obj=new ExelReader("D:\\Testing class\\daily notes\\TestNG\\TestNg data.xlsx");
		
		int row=obj.countrow(1);
		System.out.println(row);
		int column=obj.countcol(1);
		Object[][] abc=new Object[row][column];
		
//		for(int i=0;i<row;i++)
//		{
//			abc[i][0]= obj.getdata(1, i, 0);
//			abc[i][1]=obj.getdata(1, i, 1);
//		}
//		return abc;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				abc[i][j]=obj.getdata(1, i, j);
			}
		}
		return abc;
		
	}
	
	
}
