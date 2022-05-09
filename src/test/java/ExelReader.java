import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelReader 
{
  public static void main(String args[]) throws Exception
  {
	  File f=new File("D:\\Testing class\\daily notes\\TestNG\\TestNg data.xlsx");
	  
	 boolean a=  f.exists();
	System.out.println(a);
	  
	  FileInputStream fis= new FileInputStream(f);
	  
	  XSSFWorkbook workbook= new XSSFWorkbook(fis);
	  
	  XSSFSheet sheets= workbook.getSheetAt(1);
	  
	  String b= sheets.getRow(0).getCell(0).getStringCellValue();
	  System.out.println(b);
	  
	  for(int i=0;i<10;i++)
	  {
		String data=sheets.getRow(i).getCell(0).getStringCellValue();
		
		String xy=sheets.getRow(i).getCell(1).getStringCellValue();
		System.out.println(data +" "+xy);
	
		
	  }
	  
	  /*String c = sheets.getRow(0).getCell(0).getStringCellValue();
		System.out.println(c);

		String d = sheets.getRow(0).getCell(1).getStringCellValue();
		System.out.println(d);



		for (int i = 0; i < 15; i++) {
			String e = sheets.getRow(i).getCell(0).getStringCellValue();

			String fe = sheets.getRow(i).getCell(1).getStringCellValue();
			System.out.println(e + " " + fe);
	  
		}*/
  }
	
	
}

