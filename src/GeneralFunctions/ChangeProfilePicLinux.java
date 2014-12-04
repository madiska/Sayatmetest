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
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.UserSettings;
import Utils.*;

public class ChangeProfilePicLinux extends Browser{
  @Test
  public void ChangingProfilePicLinux() throws InterruptedException, AWTException {
	  
	  
	  driver.get(baseUrl);		
		
 	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys("testime13");
	  Homepage.LoginPW(driver).sendKeys("testime11");
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  driver.findElement(By.linkText("Toivo Tavaline")).click();
	  LoggedIn.Seaded(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
	  
	  UserSettings.Seaded(driver).click();
	  
	  UserSettings.ValipiltChrome(driver).click();
		 
		 String myString = Constant.Pilt1;
		 StringSelection stringSelection = new StringSelection (myString);
		 Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
		 clpbrd.setContents (stringSelection, null);
	  
	  //Siin tuleb linuxi file upload aken lahti. Selleks, et faili uploadida on vaja teha aktiivseks linuxi yleslaadimis aknal location bar 
	  Thread.sleep(5000);
	  
	  Robot r = new Robot();
	  r.mouseMove(140, 295);
	  r.mousePress(InputEvent.BUTTON1_MASK);
	  r.mouseRelease(InputEvent.BUTTON1_MASK);
	  	r.delay(5);
	  	r.mouseMove(115, 150);
	  	r.mousePress(InputEvent.BUTTON1_MASK);
	  	r.mouseRelease(InputEvent.BUTTON1_MASK);
	  		r.delay(5);
	  		r.mouseMove(200, 190);
	  		r.mousePress(InputEvent.BUTTON1_MASK);
	  		r.mouseRelease(InputEvent.BUTTON1_MASK);
	  		r.delay(5);
	  			r.keyPress(KeyEvent.VK_CONTROL);
	  			r.keyPress(KeyEvent.VK_V);
	  			r.keyRelease(KeyEvent.VK_V);
	  			r.keyRelease(KeyEvent.VK_CONTROL);
	  			r.keyPress(KeyEvent.VK_ENTER);
	  			r.keyRelease(KeyEvent.VK_ENTER);
	    
	  
	  
	  
	  
	  
	
  }
}
