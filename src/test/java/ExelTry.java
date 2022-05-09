import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExelTry {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAGRUTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		
		File f=new File("D:\\Testing class\\daily notes\\TestNG\\TestNg data.xlsx");
		System.out.println(f.exists());
		
		FileInputStream fis= new FileInputStream(f);
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		XSSFSheet sheet= workbook.getSheetAt(2);
		
		String username=sheet.getRow(0).getCell(0).getStringCellValue();
		String password=sheet.getRow(0).getCell(1).getStringCellValue();
		String url=sheet.getRow(0).getCell(2).getStringCellValue();
		
		driver.get(url);
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		
		
	}

}
