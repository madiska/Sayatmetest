package GeneralFunctions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.UserSettings;
import Utils.*;
import PageObjects.ErrorMessages;

public class ChangeProfileInvalid extends Browser {
  @Test
  public void f() throws InterruptedException, AWTException {
	  
	  
	  driver.get(baseUrl);		
	
 	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys("testime13");
	  Homepage.LoginPW(driver).sendKeys("testime11");
	  Homepage.LoginButton(driver).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Toivo Tavaline")).click();
	  LoggedIn.Seaded(driver).click();
	  Thread.sleep(3000);
	  
	  if (brauser == "firefox" ) {
			
			
		  Thread.sleep(2000);
			
		
	 
		  WebElement Fileinput = driver.findElement(By.name("account_image"));
			 Fileinput.click();
			
			 Fileinput.sendKeys("C:\\Users\\Madis\\Downloads\\test2.jpg");
			
			 
			  Robot r = new Robot();
			  r.keyPress(KeyEvent.VK_ESCAPE);
			  Assert.assertTrue(ErrorMessages.ProfilePicLiigaSuur(driver).isDisplayed());
			  Thread.sleep(1000);
			
			
	
	  	
			  UserSettings.SettingsClose(driver).click();
			 
		
	
		
	  	
	
		
	}
	else if (brauser == "chrome"){

			
			UserSettings.Valipilt(driver).click(); 

			 
			 
			 String myString = "C:\\Users\\Madis\\Downloads\\test2.jpg";
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
			
			  
			  
			
			
			 
			  UserSettings.SettingsCloseInformation(driver).click();
		
			
	
		
		
	}
	else {
	
	
		  Thread.sleep(2000);
	
		
		System.out.println(brauser);
		
		
		
			UserSettings.Valipilt(driver).click(); 

			 
			 
			 String myString = "C:\\Users\\Madis\\Downloads\\test2.jpg";
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
			 
			 
			  
			  Assert.assertTrue(ErrorMessages.ProfilePicLiigaSuur(driver).isDisplayed());
			
			
			
			  UserSettings.SettingsCloseInformation(driver).click();
		
			
	
		
  }
}
}