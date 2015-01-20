package sayatme.Registration;
import Utils.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.Profile;
import Utils.Constant;
import Utils.ExcelUtils;
import Utils.WriteToExcel;

public class registrationsuccess extends Browser{

	 

@Test(dataProvider = "Annamejuurdeyhe")
public void testregistrationsuccess(String Url1, String Nimi1, String Url2, String Nimi2, String Url3, String Nimi3,String Parool, String Feedback) throws Exception {



	
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
	// NB! WriteToExcel classis juhatab ta kindla faili juurde. Ehk REg xls. Siin ta naitab, mis lehte votta antud failist.
	WriteToExcel.setExcelFile(Constant.ExceliAsukoht,"Sheet4");
	 WriteToExcel.setCellData(Url1, 1, 0);
	 WriteToExcel.setCellData(Url2, 1, 2);
	 WriteToExcel.setCellData(Url3, 1, 4);
	 
	 driver.get(baseUrl);
	    Homepage.RegNimi(driver).sendKeys(Nimi1);
	    Homepage.RegPassword(driver).sendKeys(Parool);
	    Homepage.RegCPassword(driver).sendKeys(Parool);
	    Homepage.RegUrl(driver).sendKeys(Url1);
	    Homepage.RegButton(driver).click();
	wait.until(ExpectedConditions.visibilityOf(LoggedIn.Friends(driver)));
	    Assert.assertTrue(isElementPresent(By.linkText(Nimi1)));

	LoggedIn.DropdownMenu(driver).click();
	LoggedIn.Logout(driver).click();
	wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));

	  
	driver.get(baseUrl+Url1);
	   


	   Profile.TagasisideTextBox(driver).sendKeys(Feedback);
	   Profile.TagasisideCheckBox(driver).click();
	  Profile.ProfileFeedbackRegNimi(driver).sendKeys(Nimi2);
	  Profile.ProfileFeedbackRegPW(driver).sendKeys(Parool);
	    Profile.ProfileFeedbackRegConfirmPW(driver).sendKeys(Parool);
	    Profile.ProfileFeedbackRegUrl(driver).sendKeys(Url2);
	   Profile.ProfileFeedBackRegButton(driver).click();
		wait.until(ExpectedConditions.visibilityOf(LoggedIn.Friends(driver)));
	   Assert.assertTrue(isElementPresent(By.linkText(Nimi2)));

	   
	   
	   LoggedIn.DropdownMenu(driver).click();
	   LoggedIn.Logout(driver).click();
		wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
	 
	    
	    driver.get(baseUrl+Url2);
	  
	   Profile.ProfileRegNimi(driver).sendKeys(Nimi3);
	 Profile.ProfileRegPW(driver).sendKeys(Parool);
	   Profile.ProfileRegConfirmPW(driver).sendKeys(Parool);
	   Profile.ProfileRegUrl(driver).sendKeys(Url3);
	  Profile.ProfileRegButton(driver).click();
		wait.until(ExpectedConditions.visibilityOf(LoggedIn.Friends(driver)));
	  Assert.assertTrue(isElementPresent(By.linkText(Nimi3)));

	  
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
		wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
	
}

private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }






@DataProvider

public Object[][] Annamejuurdeyhe() throws Exception{

 Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet4");

 return (testObjArray);

}
}
