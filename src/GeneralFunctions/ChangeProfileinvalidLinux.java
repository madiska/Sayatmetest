package GeneralFunctions;

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
import PageObjects.UserSettings;
import Utils.Browser;
import Utils.Constant;


public class ChangeProfileinvalidLinux extends Browser {
  @Test
  public void ChangeProfileInvalidLinuxtest() throws AWTException, InterruptedException {
	  
	  
	  driver.get(baseUrl);
		
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys("testime13");
	  Homepage.LoginPW(driver).sendKeys("testime11");
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  
	  driver.findElement(By.linkText("Toivo Tavaline")).click();
	  LoggedIn.Seaded(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));

		 String myString = Constant.Pilt5;
		 StringSelection stringSelection = new StringSelection (myString);
		 Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
		 clpbrd.setContents (stringSelection, null);
	
		
	  
		 if (brauser == "firefox") {

			  WebElement Fileinput = driver.findElement(By.cssSelector("html body.modal-open div#settings.modal.fade.in div.modal-dialog div.modal-content.dialog-user-settings div.modal-body.picture-upload div.tab-content div#tab-information.tab-pane.active form div.fileupload.fileupload-new div.form-group span.btn.btn-file.btn-default"));
				 Fileinput.click();
		 }else {
			 					 
		 
		 UserSettings.Valipilt(driver).click();
		 }
	
	  
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
	  
	  wait.until(ExpectedConditions.visibilityOf(ErrorMessages.ProfilePicLiigaSuur(driver)));
	  UserSettings.SettingsCloseInformation(driver).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.DropdownMenu(driver)));
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
	  
	  
	  
  }
}
