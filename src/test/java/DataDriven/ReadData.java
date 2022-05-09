package DataDriven;

import java.lang.reflect.Array;

public class ReadData {

	public static void main(String[] args) 
	{
		ExelReader obj=new ExelReader("D:\\\\Testing class\\\\daily notes\\\\TestNG\\\\TestNg data.xlsx");
		
		String value1=obj.getdata(3, 5, 3);
        System.out.println(value1);    

        int rows= obj.countrow(3);
        int columns=obj.countcol(3);
        
        
        //all column1 values
//        for(int i=0;i<=rows;i++)
//        {
//        	String b=obj.getdata(3,i,1);
//        	System.out.println(b);
//        	
//        }
//        
        //all data values
//      for(int i=0;i<rows;i++)
//        {
//        	for(int j=0;j<columns;j++)
//        	{
//        		String c=obj.getdata(3,i,j);
//        		System.out.print(c);
//        		System.out.println();
//        	}
//        }
      
      for(int i=0;i<columns;i++)
      {
    	  String b=obj.getdata(3,0,i);
    	  System.out.print(b);
    			  
      }
        
        
	}
}
