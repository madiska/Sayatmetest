package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.Profile;
import Utils.ExcelUtils;
import Utils.WriteToExcel;

public class testime {
	  private WebDriver driver;
	  private String baseUrl;


	
	 @BeforeMethod public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://kask6iktundubkorras.sayat.me/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	  }
	

@Test(dataProvider = "Annamejuurdeyhe")
public void testTextreplace(String Url1, String Nimi1, String Url2, String Nimi2, String Url3, String Nimi3,String Parool, String Feedback) throws Exception {


driver.get(baseUrl);
	
	if(Url1.matches("(.*)[0-9]+")){
		
	String Uus = Url1;
	   String[] splitString = Uus.split("(?<=\\D)(?=\\d)");
	   String piece1= splitString[0];
	   String piece2= splitString[1];
	 int Number = Integer.parseInt(piece2);
	   int UusNumber = Number +1;
	   String Final = piece1+UusNumber;
	   Url1 = Final;
	  System.out.println(Number);
	  System.out.println(UusNumber);
	  System.out.println(Final);
	  System.out.println(Url1);
	
		
	}
	   else
	   {
		   
		   String Uus2 = Url1+1;
		   System.out.println(Uus2);
			Url1 = Uus2;	   
		   
		  
	   
	
	}
	
	
	if(Url2.matches("(.*)[0-9]+")){
		
	String Uus = Url2;
	   String[] splitString = Uus.split("(?<=\\D)(?=\\d)");
	   String piece1= splitString[0];
	   String piece2= splitString[1];
	 int Number = Integer.parseInt(piece2);
	   int UusNumber = Number +1;
	   String Final = piece1+UusNumber;
	   Url2 = Final;
	  System.out.println(Number);
	  System.out.println(UusNumber);
	  System.out.println(Final);
	  System.out.println(Url2);
	
		
	}
	   else
	   {
		   
		   String Uus2 = Url2+1;
		   System.out.println(Uus2);
			Url2 = Uus2;	   
		   
		  
	   
	
	}
	if(Url3.matches("(.*)[0-9]+")){
		
	String Uus = Url3;
	   String[] splitString = Uus.split("(?<=\\D)(?=\\d)");
	   String piece1= splitString[0];
	   String piece2= splitString[1];
	 int Number = Integer.parseInt(piece2);
	   int UusNumber = Number +1;
	   String Final = piece1+UusNumber;
	   Url3 = Final;

	  System.out.println(Url3);
	
		
	}
	   else
	   {
		   
		   String Uus2 = Url3+1;
		   System.out.println(Uus2);
			Url3 = Uus2;	   
		   
		  
	   
	
	}

	WriteToExcel.setExcelFile("C:\\Users\\Madis\\workspace\\testautomation\\src\\testdata\\Testin.xlsx","Sheet4");
	 WriteToExcel.setCellData(Url1, 1, 0);
	 WriteToExcel.setCellData(Url2, 1, 2);
	 WriteToExcel.setCellData(Url3, 1, 4);
	 
	  driver.get("http://kask6iktundubkorras.sayat.me");
	    Homepage.RegNimi(driver).sendKeys(Nimi1);
	    Homepage.RegPassword(driver).sendKeys(Parool);
	    Homepage.RegCPassword(driver).sendKeys(Parool);
	    Homepage.RegUrl(driver).sendKeys(Url1);
	    Homepage.RegButton(driver).click();
	    Thread.sleep(1000);
	    Assert.assertTrue(isElementPresent(By.linkText(Nimi1)));

	LoggedIn.DropdownMenu(driver).click();
	LoggedIn.Logout(driver).click();

	  
	driver.get("http://kask6iktundubkorras.sayat.me/"+Url1);
	   


	   Profile.TagasisideTextBox(driver).sendKeys(Feedback);
	   Profile.TagasisideCheckBox(driver).click();
	  Profile.ProfileFeedbackRegNimi(driver).sendKeys(Nimi2);
	  Profile.ProfileFeedbackRegPW(driver).sendKeys(Parool);
	    Profile.ProfileFeedbackRegConfirmPW(driver).sendKeys(Parool);
	    Profile.ProfileFeedbackRegUrl(driver).sendKeys(Url2);
	   Profile.ProfileFeedBackRegButton(driver).click();
	   Thread.sleep(1000);
	   Assert.assertTrue(isElementPresent(By.linkText(Nimi2)));

	   
	   
	   LoggedIn.DropdownMenu(driver).click();
	   LoggedIn.Logout(driver).click();

	 
	    
	    driver.get("http://kask6iktundubkorras.sayat.me/"+Url2);
	  
	   Profile.ProfileRegNimi(driver).sendKeys(Nimi3);
	 Profile.ProfileRegPW(driver).sendKeys(Parool);
	   Profile.ProfileRegConfirmPW(driver).sendKeys(Parool);
	   Profile.ProfileRegUrl(driver).sendKeys(Url3);
	  Profile.ProfileRegButton(driver).click();
	   Thread.sleep(1000);
	  Assert.assertTrue(isElementPresent(By.linkText(Nimi3)));

	  
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();

	
}

private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }


@AfterMethod 

public void closeBrowser()
{try{
driver.wait(15000);
}
catch(Exception e){}
driver.close();
driver.quit();
}




@DataProvider

public Object[][] Annamejuurdeyhe() throws Exception{

 Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\Madis\\workspace\\testautomation\\src\\testdata\\Testin.xlsx","Sheet4");

 return (testObjArray);

}
}
