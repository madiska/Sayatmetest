package GeneralFunctions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.UserSettings;
import Utils.*;

public class ChangeProfilePicLinux extends Browser{

@Test(dataProvider = "Upload")
  public void ChangingProfilePicLinux(String Case, String BrauserOs, String Esimenetulemus, String TeineTulemus, String KolmasTulemus) throws Exception {
	  
	  
	  driver.get(baseUrl);		
		
 	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys("testime13");
	  Homepage.LoginPW(driver).sendKeys("testime11");
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  driver.findElement(By.linkText("Toivo Tavaline")).click();
	  LoggedIn.Seaded(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
		Integer numbriks = Integer.valueOf(Case);
		 String myString = Constant.Pilt1;
		 StringSelection stringSelection = new StringSelection (myString);
		 Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
		 clpbrd.setContents (stringSelection, null);
	
		if (brauser == "firefox " && numbriks == 1 || brauser == "chrome" && numbriks == 2 || brauser == "IE" && numbriks == 3) {
	  
	  UserSettings.Valipilt(driver).click();
		 
	
	  
	  //Siin tuleb linuxi file upload aken lahti. Selleks, et faili uploadida on vaja teha aktiivseks linuxi yleslaadimis aknal location bar 
	  Thread.sleep(5000);
	  
	  Robot r = new Robot();
	  if (brauser == "firefox") {
		  r.mouseMove(140, 295);
		  r.mousePress(InputEvent.BUTTON1_MASK);
		  r.mouseRelease(InputEvent.BUTTON1_MASK);
		  	r.delay(1000);
		  	r.mouseMove(115, 120);
		  	r.mousePress(InputEvent.BUTTON1_MASK);
		  	r.mouseRelease(InputEvent.BUTTON1_MASK);
		  		r.delay(1000);
		  		r.mouseMove(200, 170);
		  		r.mousePress(InputEvent.BUTTON1_MASK);
		  		r.mouseRelease(InputEvent.BUTTON1_MASK);
		  		r.delay(1000);
		  			r.keyPress(KeyEvent.VK_CONTROL);
		  			r.keyPress(KeyEvent.VK_V);
		  			r.keyRelease(KeyEvent.VK_V);
		  			r.keyRelease(KeyEvent.VK_CONTROL);
		  			r.delay(1000);
		  			r.keyPress(KeyEvent.VK_ENTER);
		  			r.keyRelease(KeyEvent.VK_ENTER);	
	  } else {
		  r.mouseMove(140, 265);
		  r.mousePress(InputEvent.BUTTON1_MASK);
		  r.mouseRelease(InputEvent.BUTTON1_MASK);
		  	r.delay(1000);
		  	r.mouseMove(115, 90);
		  	r.mousePress(InputEvent.BUTTON1_MASK);
		  	r.mouseRelease(InputEvent.BUTTON1_MASK);
		  		r.delay(1000);
		  		r.mouseMove(200, 140);
		  		r.mousePress(InputEvent.BUTTON1_MASK);
		  		r.mouseRelease(InputEvent.BUTTON1_MASK);
		  		r.delay(1000);
		  			r.keyPress(KeyEvent.VK_CONTROL);
		  			r.keyPress(KeyEvent.VK_V);
		  			r.keyRelease(KeyEvent.VK_V);
		  			r.keyRelease(KeyEvent.VK_CONTROL);
		  			r.delay(1000);
		  			r.keyPress(KeyEvent.VK_ENTER);
		  			r.keyRelease(KeyEvent.VK_ENTER);	
		  
		  
	  }	
	  			
	  			wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Eemaldapilt(driver)));
	  			 long start = System.currentTimeMillis();
	  			UserSettings.SettingsSaveInformation(driver).click();
	  			wait.until(ExpectedConditions.visibilityOf(UserSettings.DataAdded(driver)));
	  			 long finish = System.currentTimeMillis();
				 long totalTime = finish - start; 
				 Esimenetulemus = Long.toString(totalTime);
				 System.out.println("Total Time for page load - "+totalTime); 
				 
						WriteToExcel.setExcelFile(Constant.ExceliAsukoht,"Sheet9");
						 WriteToExcel.setCellData(Esimenetulemus, numbriks ,2);
		
						 
				 UserSettings.SettingsCloseInformation(driver).click();
				 Thread.sleep(3000);
				 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
				LoggedIn.Friends(driver).click();
				wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Saadetud(driver)));
				
				LoggedIn.DropdownMenu(driver).click();
				LoggedIn.Seaded(driver).click();
				wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));

				UserSettings.Valipilt(driver).click();
				Thread.sleep(5000);
				
				
				 String myString2 = Constant.Pilt3;
				 StringSelection stringSelection2 = new StringSelection (myString2);
				 Clipboard clpbrd2 = Toolkit.getDefaultToolkit ().getSystemClipboard ();
				 clpbrd.setContents (stringSelection2, null);
			  
				  if (brauser == "firefox") {
					  r.mouseMove(140, 295);
					  r.mousePress(InputEvent.BUTTON1_MASK);
					  r.mouseRelease(InputEvent.BUTTON1_MASK);
					  	r.delay(1000);
					  	r.mouseMove(115, 120);
					  	r.mousePress(InputEvent.BUTTON1_MASK);
					  	r.mouseRelease(InputEvent.BUTTON1_MASK);
					  		r.delay(1000);
					  		r.mouseMove(200, 170);
					  		r.mousePress(InputEvent.BUTTON1_MASK);
					  		r.mouseRelease(InputEvent.BUTTON1_MASK);
					  		r.delay(1000);
					  			r.keyPress(KeyEvent.VK_CONTROL);
					  			r.keyPress(KeyEvent.VK_V);
					  			r.keyRelease(KeyEvent.VK_V);
					  			r.keyRelease(KeyEvent.VK_CONTROL);
					  			r.delay(1000);
					  			r.keyPress(KeyEvent.VK_ENTER);
					  			r.keyRelease(KeyEvent.VK_ENTER);	
				  } else {
					  r.mouseMove(140, 265);
					  r.mousePress(InputEvent.BUTTON1_MASK);
					  r.mouseRelease(InputEvent.BUTTON1_MASK);
					  	r.delay(1000);
					  	r.mouseMove(115, 90);
					  	r.mousePress(InputEvent.BUTTON1_MASK);
					  	r.mouseRelease(InputEvent.BUTTON1_MASK);
					  		r.delay(1000);
					  		r.mouseMove(200, 140);
					  		r.mousePress(InputEvent.BUTTON1_MASK);
					  		r.mouseRelease(InputEvent.BUTTON1_MASK);
					  		r.delay(1000);
					  			r.keyPress(KeyEvent.VK_CONTROL);
					  			r.keyPress(KeyEvent.VK_V);
					  			r.keyRelease(KeyEvent.VK_V);
					  			r.keyRelease(KeyEvent.VK_CONTROL);
					  			r.delay(1000);
					  			r.keyPress(KeyEvent.VK_ENTER);
					  			r.keyRelease(KeyEvent.VK_ENTER);	
					  
					  
				  }		
				  			
				  
				
									WriteToExcel.setExcelFile(Constant.ExceliAsukoht,"Sheet9");
									 WriteToExcel.setCellData(Esimenetulemus, numbriks ,3);
		
				  			 UserSettings.SettingsCloseInformation(driver).click();
							 Thread.sleep(3000);
							 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
							LoggedIn.Friends(driver).click();
							wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Saadetud(driver)));
							
							LoggedIn.DropdownMenu(driver).click();
							LoggedIn.Seaded(driver).click();
							wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
				    
							UserSettings.Valipilt(driver).click();
							Thread.sleep(5000);
							
							 String myString3 = Constant.Pilt4;
							 StringSelection stringSelection3 = new StringSelection (myString3);
							 Clipboard clpbrd3 = Toolkit.getDefaultToolkit ().getSystemClipboard ();
							 clpbrd.setContents (stringSelection3, null);
						  if (brauser == "firefox") {
							  r.mouseMove(140, 295);
							  r.mousePress(InputEvent.BUTTON1_MASK);
							  r.mouseRelease(InputEvent.BUTTON1_MASK);
							  	r.delay(1000);
							  	r.mouseMove(115, 120);
							  	r.mousePress(InputEvent.BUTTON1_MASK);
							  	r.mouseRelease(InputEvent.BUTTON1_MASK);
							  		r.delay(1000);
							  		r.mouseMove(200, 170);
							  		r.mousePress(InputEvent.BUTTON1_MASK);
							  		r.mouseRelease(InputEvent.BUTTON1_MASK);
							  		r.delay(1000);
							  			r.keyPress(KeyEvent.VK_CONTROL);
							  			r.keyPress(KeyEvent.VK_V);
							  			r.keyRelease(KeyEvent.VK_V);
							  			r.keyRelease(KeyEvent.VK_CONTROL);
							  			r.delay(1000);
							  			r.keyPress(KeyEvent.VK_ENTER);
							  			r.keyRelease(KeyEvent.VK_ENTER);	
						  } else {
							  r.mouseMove(140, 265);
							  r.mousePress(InputEvent.BUTTON1_MASK);
							  r.mouseRelease(InputEvent.BUTTON1_MASK);
							  	r.delay(1000);
							  	r.mouseMove(115, 90);
							  	r.mousePress(InputEvent.BUTTON1_MASK);
							  	r.mouseRelease(InputEvent.BUTTON1_MASK);
							  		r.delay(1000);
							  		r.mouseMove(200, 140);
							  		r.mousePress(InputEvent.BUTTON1_MASK);
							  		r.mouseRelease(InputEvent.BUTTON1_MASK);
							  		r.delay(1000);
							  			r.keyPress(KeyEvent.VK_CONTROL);
							  			r.keyPress(KeyEvent.VK_V);
							  			r.keyRelease(KeyEvent.VK_V);
							  			r.keyRelease(KeyEvent.VK_CONTROL);
							  			r.delay(1000);
							  			r.keyPress(KeyEvent.VK_ENTER);
							  			r.keyRelease(KeyEvent.VK_ENTER);	
							  
							  
						  }	
							  
	
												WriteToExcel.setExcelFile(Constant.ExceliAsukoht,"Sheet9");
												 WriteToExcel.setCellData(Esimenetulemus, numbriks ,4);
	
											 
										 }
		else {}
							  			 
				UserSettings.SettingsCloseInformation(driver).click();
				Thread.sleep(3000);
				wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.DropdownMenu(driver)));
				LoggedIn.DropdownMenu(driver).click();
				LoggedIn.Logout(driver).click();
				wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
	  
	  
	  
	
  }
  @DataProvider
  
  

  public Object[][] Upload() throws Exception{

   Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet9");

   return (testObjArray);

  }
}
