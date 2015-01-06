package Linking;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.Mailinator;
import Utils.*;

public class EmailLinking extends Browser  {
	

 
	
  @Test(dataProvider = "Emaillinking")
  public void TestEmailLinking(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2, String Feedback3,String Answer, String Email, String Social, String jarjekord) throws Exception {
	

	  
		if(Email.matches("(.*)[0-9]+(.*)")){
			
			String Uus = Email;
				String [] before = Uus.split("@");			 
			   String[] splitString = before[0].split("(?<=\\D)(?=\\d)");
			   String piece1= splitString[0];
			   String piece2= splitString[1];
			 
			 int Number = Integer.parseInt(piece2);
			   int UusNumber = Number +1;
			   String Final = piece1+UusNumber;
			   Email = Final+"@mailinator.com";
			
			
			
				
			}
			   else
			   {
				   String [] before = Email.split("@");
					 String uus1 = before[0];
				   String Uus2 = uus1+1;
				
				   Email = Uus2+"@mailinator.com";	   
				   
				  
			   
			
			}
		Integer numbriks = Integer.valueOf(jarjekord);
		WriteToExcel.setExcelFile(Constant.ExceliAsukoht,"Sheet5");
		 WriteToExcel.setCellData(Email, numbriks ,8);
	  
	  
		 driver.get(baseUrl);
			
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.Epost(driver).sendKeys(Email);
	  LoggedIn.Epostkinnitus(driver).click();
	  Thread.sleep(10000);
	  driver.get("http://mailinator.com");
	  Mailinator.MailinatorTextBox(driver).sendKeys(Email);
	  Mailinator.MailinatorButton(driver).click();
	  Thread.sleep(5000);
	  
	  for (int m = 0; m < 10; m++) 
	  {
	

	  	if (driver.findElements(By.cssSelector("html#ng-app.ng-app.ng-scope body div.full-height div.app-content div.container div.content.inbox div.row-fluid div.span9 div#maildirpane div.row-fluid div.inbox-content div#InboxCtrl.mail-list.ng-scope ul#mailcontainer.unstyled li.row-fluid.message.ng-scope a")).size() == 1) {
	  		
	  		break;
	  	}
	  	
	  	else {
	  		
	  		Thread.sleep(10000);
	  		driver.navigate().refresh();
	  		
	  	}

	  }
	  Mailinator.MailinatorEmail(driver).click();
	  Thread.sleep(2000);
	  driver.switchTo().frame("rendermail");
	  String Emailconfirmationlink = driver.findElement(By.partialLinkText("sayat.me/claim")).getText();
	   String uuslink = baseUrl+Emailconfirmationlink.substring(16);
	
	   driver.get(uuslink);
	Assert.assertTrue(Mailinator.Emailkinnitusonnestus(driver).isDisplayed());
	
	LoggedIn.DropdownMenu(driver).click();
	LoggedIn.Logout(driver).click();
	wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
	  
  }
@DataProvider
  
  public Object[][] Emaillinking() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet5");

       return (testObjArray);

      }
  
  
}
