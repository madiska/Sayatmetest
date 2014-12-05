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

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.UserSettings;
import Utils.*;

public class ChangeProfilePic2Linux extends Browser {
  @Test
  public void ChangeProfilePic2LinuxTest() throws InterruptedException, AWTException {
	  driver.get(baseUrl);
		
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys("testime13");
	  Homepage.LoginPW(driver).sendKeys("testime11");
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  driver.get(baseUrl+"testime13");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("html body div.container div.col-sm-8 table#user-tabs.feed-published-navs.no-outline.feed-settings-navs.feed-navs tbody tr td.settings-tab.settings-tab-surveys a.survey-tab")));

	  LoggedIn.DropdownMenu(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Seaded(driver)));
	  LoggedIn.Seaded(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
	  
		 String myString = Constant.Pilt1;
		 StringSelection stringSelection = new StringSelection (myString);
		 Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
		 clpbrd.setContents (stringSelection, null);
		 if (brauser == "firefox") {
			 Thread.sleep(3000);
			  WebElement Fileinput = driver.findElement(By.name("account_image"));
				 Fileinput.click();
		 }else {
			 					 
		 
		 UserSettings.Valipilt(driver).click();
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
		  			
		  			wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Eemaldapilt(driver)));
		  			UserSettings.SettingsSaveInformation(driver).click();
		  			wait.until(ExpectedConditions.visibilityOf(UserSettings.DataAdded(driver)));
		  			 UserSettings.SettingsCloseInformation(driver).click();
					 Thread.sleep(3000);
					driver.get(baseUrl+"testime13");
					wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("html body div.container div.col-sm-8 table#user-tabs.feed-published-navs.no-outline.feed-settings-navs.feed-navs tbody tr td.settings-tab.settings-tab-surveys a.survey-tab")));
				
				  LoggedIn.DropdownMenu(driver).click();
				  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Seaded(driver)));
				  LoggedIn.Seaded(driver).click();
				  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
				  
				  
				  
					 String myString2 = Constant.Pilt3;
					 StringSelection stringSelection2 = new StringSelection (myString2);
					 Clipboard clpbrd2 = Toolkit.getDefaultToolkit ().getSystemClipboard ();
					 clpbrd.setContents (stringSelection2, null);
					 if (brauser == "firefox") {
						 Thread.sleep(3000);
						  WebElement Fileinput = driver.findElement(By.name("account_image"));
							 Fileinput.click();
					 }else {
						 					 
					 
					 UserSettings.Valipilt(driver).click();
					 }
					  
					  
					  Thread.sleep(5000);
					  
				
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
			  			UserSettings.SettingsSaveInformation(driver).click();
			  			wait.until(ExpectedConditions.visibilityOf(UserSettings.DataAdded(driver)));
			  			 UserSettings.SettingsCloseInformation(driver).click();
						 Thread.sleep(3000);
						driver.get(baseUrl+"testime13");
						wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("html body div.container div.col-sm-8 table#user-tabs.feed-published-navs.no-outline.feed-settings-navs.feed-navs tbody tr td.settings-tab.settings-tab-surveys a.survey-tab")));
					
					  LoggedIn.DropdownMenu(driver).click();
					  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Seaded(driver)));
					  LoggedIn.Seaded(driver).click();
					  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
					  
						 String myString3 = Constant.Pilt4;
						 StringSelection stringSelection3 = new StringSelection (myString3);
						 Clipboard clpbrd3 = Toolkit.getDefaultToolkit ().getSystemClipboard ();
						 clpbrd.setContents (stringSelection3, null);
						
						 if (brauser == "firefox") {
							 Thread.sleep(3000);
							  WebElement Fileinput = driver.findElement(By.name("account_image"));
								 Fileinput.click();
						 }else {
							 					 
						 
						 UserSettings.Valipilt(driver).click();
						 }
						  
						  Thread.sleep(5000);
						  
					
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
				  			UserSettings.SettingsSaveInformation(driver).click();
				  			wait.until(ExpectedConditions.visibilityOf(UserSettings.DataAdded(driver)));
				  			 UserSettings.SettingsCloseInformation(driver).click();
							 Thread.sleep(3000);
							driver.get(baseUrl+"testime13");
							wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("html body div.container div.col-sm-8 table#user-tabs.feed-published-navs.no-outline.feed-settings-navs.feed-navs tbody tr td.settings-tab.settings-tab-surveys a.survey-tab")));
						LoggedIn.DropdownMenu(driver).click();
						LoggedIn.Logout(driver).click();
						wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
  }
  
  
}
