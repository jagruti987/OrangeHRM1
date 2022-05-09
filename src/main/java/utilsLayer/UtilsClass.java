package utilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseLayer.Baseclass;

public class UtilsClass extends Baseclass

{
   public static void drpdwn(WebElement wb, String s)
   {
	   Select sel=new Select(wb);
	   sel.selectByVisibleText(s);
   }
	
	
}
