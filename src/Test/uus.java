package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.*;

public class uus  extends Browser{


  @Test(dataProvider = "Annamejuurdeyhe")

  public void f(String Case, String BrauseriOs, String Esimenetulemus, String Teinetulemus, String Kolmastulemuse ) throws Exception {
 
	driver.get(baseUrl);
			
		 
			Integer numbriks = Integer.valueOf(Case);
	  if (brauser == "firefox" ) {
			
			System.out.println(brauser);
		  	if (numbriks == 1){
		  		
				WriteToExcel.setExcelFile("C:\\Users\\Madis\\workspace\\testautomation\\src\\testdata\\reg.xlsx","Sheet9");
				 WriteToExcel.setCellData(Esimenetulemus, numbriks ,3);
		  		
		  		
		  	}
		  	else
		  	{
		  		
		  	}
		
			
		}
		else if (brauser == "chrome"){
			
			System.out.println(brauser);
			if(numbriks == 2){
				
				
				WriteToExcel.setExcelFile("C:\\Users\\Madis\\workspace\\testautomation\\src\\testdata\\reg.xlsx","Sheet9");
				 WriteToExcel.setCellData(Esimenetulemus, numbriks ,3);
				
				
			}
			else{
		
			}
			
		}
		else {
			
			System.out.println(brauser);
			if(numbriks == 3){
				
				
				WriteToExcel.setExcelFile("C:\\Users\\Madis\\workspace\\testautomation\\src\\testdata\\reg.xlsx","Sheet9");
				 WriteToExcel.setCellData(Esimenetulemus, numbriks ,3);
				
			}else
			{
			}
			
		}
 
  }
	  
  
  @DataProvider
  
  

  public Object[][] Annamejuurdeyhe() throws Exception{

   Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\Madis\\workspace\\testautomation\\src\\testdata\\Reg.xlsx","Sheet9");

   return (testObjArray);

  }
 
}

