package Kysimus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import PageObjects.ErrorMessages;
import PageObjects.Homepage;
import PageObjects.LoggedIn;
import Utils.*;

public class PicUploadInvalid extends Browser{
  @Test
  public void UploadinvalidPic() throws InterruptedException, AWTException {
	  
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys("testime13");
	  Homepage.LoginPW(driver).sendKeys("testime11");
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  
	  
		 String myString = Constant.Pilt8;
		 StringSelection stringSelection = new StringSelection (myString);
		 Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
		 clpbrd.setContents (stringSelection, null);
		 
		  LoggedIn.KysimusLisaPilt(driver).click();
		  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.KysimusValiPilt(driver)));
		 
		
		 if (brauser == "firefox") {
			 Thread.sleep(3000);
			 WebElement Fileinput = driver.findElement(By.id("new_post_image"));
			 Fileinput.click();
		 }else {
			 					 
			 Thread.sleep(3000);
			 LoggedIn.KysimusValiPilt(driver).click();
		 }
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
		  
		 wait.until(ExpectedConditions.visibilityOf(ErrorMessages.Kysimuspiltliigasuur(driver)));
		  LoggedIn.KysimusValiPiltsalvestawithoutchanges(driver).click();
		  
		  Thread.sleep(3000);
		  
		  LoggedIn.DropdownMenu(driver).click();
		  LoggedIn.Logout(driver).click();
		  
		  wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
	  
  }
}
