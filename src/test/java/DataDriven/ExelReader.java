package DataDriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelReader 
{
	
	XSSFWorkbook workbook;
	
  public ExelReader(String path)
  {
	  File f= new File("D:\\\\Testing class\\\\daily notes\\\\TestNG\\\\TestNg data.xlsx");
	  try
	  {
	  FileInputStream fis= new FileInputStream(f);
	  
	  workbook= new XSSFWorkbook(fis);
	  }
	  catch(Exception e)
	  {
		 e.getStackTrace();
		 
	  }
	  
  }
  
  public String getdata(int sheetindex, int rownum,int column)
  {
	  
	  XSSFSheet sheet= workbook.getSheetAt(sheetindex);
	  
	  String value= sheet.getRow(rownum).getCell(column).getStringCellValue();
	  
	  return value;
	    
  }
  
  public int countrow(int sheetindex) 
  {
	  int row= workbook.getSheetAt(sheetindex).getLastRowNum();
	  return row;
	  
  }
  
  
  
  public int countcol(int sheetindex)
  {
	  int column=workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
	  
	  return column;
  }
  
	
	
	
}
