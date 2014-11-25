package GeneralFunctions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.UserSettings;
import Utils.Constant;
import Utils.Browser;

public class ChangeProfilePic2 extends Browser{
	

	
	
	
  @Test
  public void AvalikultProfiililtpildivahetus() throws InterruptedException, AWTException {
	  
	  
	  driver.get(baseUrl);
		
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys("testime13");
	  Homepage.LoginPW(driver).sendKeys("testime11");
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  driver.get(baseUrl+"testime13");
		

	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Seaded(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
	
	  if (brauser == "firefox" ) {
			
			
			
		
			  Thread.sleep(2000);
		
		
		System.out.println(brauser);
	
	 
		UserSettings.Valipilt(driver).click(); 

		 
		 
		 String myString = Constant.Pilt1;
		 StringSelection stringSelection = new StringSelection (myString);
		 Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
		 clpbrd.setContents (stringSelection, null);
		 Thread.sleep(2000);
		 Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);

			
			 Assert.assertTrue(UserSettings.Eemaldapilt(driver).isDisplayed());
			  Robot r = new Robot();
			  r.keyPress(KeyEvent.VK_ESCAPE);
			  Thread.sleep(1000);
			
			
	
	  	
			  UserSettings.SettingsSaveInformation(driver).click();
			 
			Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());  
	
		
	  
	
		
	}
	else if (brauser == "chrome"){
	

		  Thread.sleep(2000);
			
		
		System.out.println(brauser);
	

		
		  Thread.sleep(2000);
			
			UserSettings.Valipilt(driver).click(); 

			 
			 
			 String myString = Constant.Pilt1;
			 StringSelection stringSelection = new StringSelection (myString);
			 Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
			 clpbrd.setContents (stringSelection, null);
			 Thread.sleep(2000);
			 Robot robot = new Robot();
			  robot.keyPress(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_V);
			    robot.keyRelease(KeyEvent.VK_V);
			    robot.keyRelease(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_ENTER);
			    robot.keyRelease(KeyEvent.VK_ENTER);
	
			
			 Assert.assertTrue(UserSettings.Eemaldapilt(driver).isDisplayed());
			  Robot r = new Robot();
			  r.keyPress(KeyEvent.VK_ESCAPE);
			
			
			 
			  UserSettings.SettingsSaveInformation(driver).click();
		
			Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());  
	
		
		
		
	}
	else {
	
	
		  Thread.sleep(2000);
			
		
		System.out.println(brauser);
		
		
		
		  Thread.sleep(2000);
			UserSettings.Valipilt(driver).click(); 

			 
			 
			 String myString = Constant.Pilt1;
			 StringSelection stringSelection = new StringSelection (myString);
			 Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
			 clpbrd.setContents (stringSelection, null);
			 Thread.sleep(2000);
			 Robot robot = new Robot();
			  robot.keyPress(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_V);
			    robot.keyRelease(KeyEvent.VK_V);
			    robot.keyRelease(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_ENTER);
			    robot.keyRelease(KeyEvent.VK_ENTER);
	
			Thread.sleep(2000);
			 Assert.assertTrue(UserSettings.Eemaldapilt(driver).isDisplayed());
			  Robot r = new Robot();
			  r.keyPress(KeyEvent.VK_ESCAPE);
			
			
			
			  UserSettings.SettingsSaveInformation(driver).click();
		
			Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());  
	
			
		
		
	}
  
  
  
  
  if 	(brauser == "firefox" ) {
		
		
	  	
	  			
	
		System.out.println(brauser);
		UserSettings.SettingsCloseInformation(driver).click();
		
		 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
		driver.get(baseUrl+"testime13");
		 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	
		LoggedIn.DropdownMenu(driver).click();
		 LoggedIn.Seaded(driver).click();
		 wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
	  WebElement Fileinput = driver.findElement(By.name("account_image"));
		 Fileinput.click();
		
		 Fileinput.sendKeys(Constant.Pilt3);
		
		 Assert.assertTrue(UserSettings.Eemaldapilt(driver).isDisplayed());
		  Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_ESCAPE);
		 	
			  UserSettings.SettingsSaveInformation(driver).click();
			 
			Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());  
  		}
  	

	
  
  else if (brauser == "chrome"){


	  Thread.sleep(2000);
	
	
	System.out.println(brauser);
	
		UserSettings.SettingsCloseInformation(driver).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
		driver.get(baseUrl+"testime13");
		wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
		
		LoggedIn.DropdownMenu(driver).click();
		 LoggedIn.Seaded(driver).click();
		 wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
		
		UserSettings.Valipilt(driver).click(); 
		Thread.sleep(1000);
		 
		 
		 String myString =  Constant.Pilt3;
		 StringSelection stringSelection = new StringSelection (myString);
		 Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
		 clpbrd.setContents (stringSelection, null);
		 Thread.sleep(2000);
		 Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		 Assert.assertTrue(UserSettings.Eemaldapilt(driver).isDisplayed());
		  Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_ESCAPE);
		
		
		  UserSettings.SettingsSaveInformation(driver).click();
	
		Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());  

	
	
}
else {


	UserSettings.SettingsCloseInformation(driver).click();
	wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	driver.get(baseUrl+"testime13");
	wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	
	LoggedIn.DropdownMenu(driver).click();
	 LoggedIn.Seaded(driver).click();
	 wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
	
	UserSettings.Valipilt(driver).click(); 
	Thread.sleep(1000);
	 
	 
	 String myString =  Constant.Pilt3;

		 
		 
		
		 StringSelection stringSelection = new StringSelection (myString);
		 Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
		 clpbrd.setContents (stringSelection, null);
		 Thread.sleep(2000);
		 Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		 Assert.assertTrue(UserSettings.Eemaldapilt(driver).isDisplayed());
		  Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_ESCAPE);
		
		
		  UserSettings.SettingsSaveInformation(driver).click();
	
		Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());  

		
	
	
	
}
  
  if (brauser == "firefox" ) {
		
		
	
		
		System.out.println(brauser);
		UserSettings.SettingsCloseInformation(driver).click();
		 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
		driver.get(baseUrl+"testime13");
		 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	
		LoggedIn.DropdownMenu(driver).click();
		 LoggedIn.Seaded(driver).click();
		 wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
  
	  WebElement Fileinput = driver.findElement(By.name("account_image"));
		 Fileinput.click();
		
		 Fileinput.sendKeys("C:\\Users\\Madis\\Downloads\\2,7mb.jpg");
		
		 Assert.assertTrue(UserSettings.Eemaldapilt(driver).isDisplayed());
		  Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_ESCAPE);
		 	
			  UserSettings.SettingsSaveInformation(driver).click();
			 
			Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());  
				
  

	
}
else if (brauser == "chrome"){
	
	  

	UserSettings.SettingsCloseInformation(driver).click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	driver.get(baseUrl+"testime13");
	wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	
	LoggedIn.DropdownMenu(driver).click();
	 LoggedIn.Seaded(driver).click();
	 wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
	
	UserSettings.Valipilt(driver).click(); 
	Thread.sleep(1000);
	 
	 
	 String myString =  Constant.Pilt4;
		 
		 
		
		 StringSelection stringSelection = new StringSelection (myString);
		 Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
		 clpbrd.setContents (stringSelection, null);
		 Thread.sleep(2000);
		 Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		 Assert.assertTrue(UserSettings.Eemaldapilt(driver).isDisplayed());
		  Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_ESCAPE);
		
		
		  UserSettings.SettingsSaveInformation(driver).click();
	
		Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());  

	}
	
	
  		
  	else {


  		UserSettings.SettingsCloseInformation(driver).click();
		wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
		driver.get(baseUrl+"testime13");
		wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
		
		LoggedIn.DropdownMenu(driver).click();
		 LoggedIn.Seaded(driver).click();
		 wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
		
		UserSettings.Valipilt(driver).click(); 
		Thread.sleep(1000);
		 
		 
		 String myString =  Constant.Pilt4;
		 StringSelection stringSelection = new StringSelection (myString);
		 Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
		 clpbrd.setContents (stringSelection, null);
		 Thread.sleep(2000);
		 Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		 Assert.assertTrue(UserSettings.Eemaldapilt(driver).isDisplayed());
		  Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_ESCAPE);
		
		
		  UserSettings.SettingsSaveInformation(driver).click();
	
		Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());  

	
  }
}
}
