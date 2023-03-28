package Selenium;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import java.io.File;
import java.io.IOException;

public class DataDriven {
 
  @Test
  public void f() throws BiffException, IOException {
	  
	                     //what is my first step
	                    //i am creating a variable which store the path of my excel sheet 
	  File excel = new File("C:\\Users\\user\\Desktop\\dataselenium1.xls");
	                      //workbook//sheet //row and coloumn
	 
	  Workbook wb = Workbook.getWorkbook(excel);
	  //Sheet st = wb.getSheet("Sheet1")
	 
	  Sheet st = null;
	  Cell cl = null;
	 
	  int Sheets = wb.getNumberOfSheets();
	  for(int i=0;i<Sheets;i++)
	  {
		 
		  st=wb.getSheet(i);
		  int rows= st.getRows();
		  int column= st.getColumns();
		 // System.out.println("No. of rows ="+rows);
		 //  System.out.println("No. of column ="+column);
	 
		   
		   for(int x=0;x<rows;x++) 
				 for(int y=0;y<column;y++)
				{
					cl=st.getCell(y,x);
					if(cl.getContents().length()>0)
					{
						System.out.println(cl.getContents());
					}
				}
	    }
}
}



