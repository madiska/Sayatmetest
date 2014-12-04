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
import Utils.*;
import PageObjects.ErrorMessages;

public class ChangeProfileInvalid extends Browser {
  @Test
  public void ChangeProfileInvalidSize() throws InterruptedException, AWTException {
	  
	  
	  driver.get(baseUrl);		
	
 	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys("testime13");
	  Homepage.LoginPW(driver).sendKeys("testime11");
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  
	  driver.findElement(By.linkText("Toivo Tavaline")).click();
	  LoggedIn.Seaded(driver).click();
	 wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
	  
	  if (brauser == "firefox" ) {
			
			
		  
			
		
	 
		  WebElement Fileinput = driver.findElement(By.name("account_image"));
			 Fileinput.click();
			
			 Fileinput.sendKeys(Constant.Pilt5);
			
			 Thread.sleep(2000);
			  Robot r = new Robot();
			  r.keyPress(KeyEvent.VK_ESCAPE);
			  r.keyRelease(KeyEvent.VK_ESCAPE);
			  Thread.sleep(2000);
			  Assert.assertTrue(ErrorMessages.ProfilePicLiigaSuur(driver).isDisplayed());
			  
			
			
	
	  	
			  UserSettings.SettingsClose(driver).click();
			  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
		
	
		
	  	
	
		
	}
	else if (brauser == "chrome"){

			
			UserSettings.Valipilt(driver).click(); 

			 
			 
			 String myString = Constant.Pilt5;
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
	
			Thread.sleep(3000);
			
			  
			  
			
			
			  Assert.assertTrue(ErrorMessages.ProfilePicLiigaSuur(driver).isDisplayed());
			  UserSettings.SettingsCloseInformation(driver).click();
		
			  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
				
	
		
		
	}
	else {
	
	
		 
	
		
		System.out.println(brauser);
		
		
		
			UserSettings.Valipilt(driver).click(); 

			 
			 
			 String myString = Constant.Pilt5;
			 StringSelection stringSelection = new StringSelection (myString);
			 Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
			 clpbrd.setContents (stringSelection, null);
			 Thread.sleep(2000);
			 Robot robot = new Robot();
			  robot.keyPress(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_V);
			    robot.keyRelease(KeyEvent.VK_V);
			    robot.keyRelease(KeyEvent.VK_CONTROL);
			    Thread.sleep(1000);
			    robot.keyPress(KeyEvent.VK_ENTER);
			    robot.keyRelease(KeyEvent.VK_ENTER);
	
			
			 
			 
			  Thread.sleep(1000);
			  Assert.assertTrue(ErrorMessages.ProfilePicLiigaSuur(driver).isDisplayed());
			
			
			
			  UserSettings.SettingsCloseInformation(driver).click();
			  
		
			
	
		
  }
	  Thread.sleep(3000);
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
}
}