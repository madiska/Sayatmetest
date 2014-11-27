package GeneralFunctions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.UserSettings;
import Utils.*;

public class ChangeProfilePic extends Browser{
	

	
	
  @Test(dataProvider ="Upload")
  public void ProfilePictureChange(String Case, String BrauserOs, String Esimenetulemus, String TeineTulemus, String KolmasTulemus) throws Exception {
	  
	  
	  
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
					
				
						  Thread.sleep(2000);
							Integer numbriks = Integer.valueOf(Case);
						
						System.out.println(brauser);
					  	if (numbriks == 1){
					  	  WebElement Fileinput = driver.findElement(By.name("account_image"));
							 Fileinput.click();
							
							 Fileinput.sendKeys(Constant.Pilt3);
							
							 Assert.assertTrue(UserSettings.Eemaldapilt(driver).isDisplayed());
							  Robot r = new Robot();
							  r.keyPress(KeyEvent.VK_ESCAPE);
							 	
								 long start = System.currentTimeMillis();
								  UserSettings.SettingsSaveInformation(driver).click();
								 
								Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());  
								 long finish = System.currentTimeMillis();
								 long totalTime = finish - start; 
								 Esimenetulemus = Long.toString(totalTime);
								 System.out.println("Total Time for page load - "+totalTime); 
									
									WriteToExcel.setExcelFile(Constant.ExceliAsukoht,"Sheet9");
									 WriteToExcel.setCellData(Esimenetulemus, numbriks ,2);
					  	}
					  	else
					  	{
					  		
					  	}
					
						
					}
					else if (brauser == "chrome"){
					
				
						  Thread.sleep(2000);
							Integer numbriks = Integer.valueOf(Case);
						
						System.out.println(brauser);
						if(numbriks == 2){
						
						
							
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
							
							
							  long start = System.currentTimeMillis();
							  UserSettings.SettingsSaveInformation(driver).click();
						
							wait.until(ExpectedConditions.visibilityOf(UserSettings.DataAdded(driver)));
					
							 long finish = System.currentTimeMillis();
							 long totalTime = finish - start; 
							 Esimenetulemus = Long.toString(totalTime);
							WriteToExcel.setExcelFile(Constant.ExceliAsukoht,"Sheet9");
							 WriteToExcel.setCellData(Esimenetulemus, numbriks ,2);
						}
						else{
					
						}
						
					}
					else {
					
					
						  Thread.sleep(2000);
							Integer numbriks = Integer.valueOf(Case);
						
						System.out.println(brauser);
						if(numbriks == 3){
						
						
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
							
							
							  long start = System.currentTimeMillis();
							  UserSettings.SettingsSaveInformation(driver).click();
						
							Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());  
					
							 long finish = System.currentTimeMillis();
							 long totalTime = finish - start; 
							 Esimenetulemus = Long.toString(totalTime);
							WriteToExcel.setExcelFile(Constant.ExceliAsukoht,"Sheet9");
							 WriteToExcel.setCellData(Esimenetulemus, numbriks ,2);
							
						}else
						{
						}
						
					}
				  
				  
				  
				  
				  if (brauser == "firefox" ) {
						
						
					  Thread.sleep(2000);
						Integer numbriks = Integer.valueOf(Case);
					
					System.out.println(brauser);
				  	if (numbriks == 1){
				  		
				  		
				  		UserSettings.SettingsCloseInformation(driver).click();
				  		 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
				  		LoggedIn.Friends(driver).click();
				  	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Saadetud(driver)));
				  		LoggedIn.DropdownMenu(driver).click();
				  		 LoggedIn.Seaded(driver).click();
				  		  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
					  WebElement Fileinput = driver.findElement(By.name("account_image"));
						 Fileinput.click();
						
						 Fileinput.sendKeys(Constant.Pilt3);
						
						 Assert.assertTrue(UserSettings.Eemaldapilt(driver).isDisplayed());
						  Robot r = new Robot();
						  r.keyPress(KeyEvent.VK_ESCAPE);
						 	
							 long start = System.currentTimeMillis();
							  UserSettings.SettingsSaveInformation(driver).click();
							 
							Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());  
							 long finish = System.currentTimeMillis();
							 long totalTime = finish - start; 
							 Esimenetulemus = Long.toString(totalTime);
							 System.out.println("Total Time for page load - "+totalTime); 
								
								WriteToExcel.setExcelFile(Constant.ExceliAsukoht,"Sheet9");
								 WriteToExcel.setCellData(Esimenetulemus, numbriks ,3);
				  	}
				  	else
				  	{
				  		
				  	}
				
					
				}
				else if (brauser == "chrome"){
				
			
					  Thread.sleep(2000);
						Integer numbriks = Integer.valueOf(Case);
					
					System.out.println(brauser);
					if(numbriks == 2){
						UserSettings.SettingsCloseInformation(driver).click();
						Thread.sleep(3000);
						 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
						LoggedIn.Friends(driver).click();
						  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Saadetud(driver)));
						LoggedIn.DropdownMenu(driver).click();
						 LoggedIn.Seaded(driver).click();
						  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
						
						UserSettings.Valipilt(driver).click(); 
						Thread.sleep(1000);
						 
						 
						 String myString = Constant.Pilt3;
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
				
					
						wait.until(ExpectedConditions.visibilityOf(UserSettings.Eemaldapilt(driver)));
						  Robot r = new Robot();
						  r.keyPress(KeyEvent.VK_ESCAPE);
						
						
						  long start = System.currentTimeMillis();
						  UserSettings.SettingsSaveInformation(driver).click();
						  
							wait.until(ExpectedConditions.visibilityOf(UserSettings.DataAdded(driver)));
				
						 long finish = System.currentTimeMillis();
						 long totalTime = finish - start; 
						 Esimenetulemus = Long.toString(totalTime);
						WriteToExcel.setExcelFile(Constant.ExceliAsukoht,"Sheet9");
						 WriteToExcel.setCellData(Esimenetulemus, numbriks ,3);
					}
					else{
				
					}
					
				}
				else {
				
				
					  Thread.sleep(2000);
						Integer numbriks = Integer.valueOf(Case);
					
					System.out.println(brauser);
					if(numbriks == 3){
						UserSettings.SettingsCloseInformation(driver).click();
						 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
					 LoggedIn.Friends(driver).click();
						 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Saadetud(driver)));
						
						LoggedIn.DropdownMenu(driver).click();
						 LoggedIn.Seaded(driver).click();
						 wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
						
						UserSettings.Valipilt(driver).click(); 
			
						 
						 
						 String myString = Constant.Pilt3;
						 StringSelection stringSelection = new StringSelection (myString);
						 Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
						 clpbrd.setContents (stringSelection, null);
						 Robot robot = new Robot();
						 Thread.sleep(2000);
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
						
						
						  long start = System.currentTimeMillis();
						  UserSettings.SettingsSaveInformation(driver).click();
					
						Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());  
				
						 long finish = System.currentTimeMillis();
						 long totalTime = finish - start; 
						 Esimenetulemus = Long.toString(totalTime);
						WriteToExcel.setExcelFile(Constant.ExceliAsukoht,"Sheet9");
						 WriteToExcel.setCellData(Esimenetulemus, numbriks ,3);
						
					}else
					{
					}
				
					
					
				}
				  
				  if (brauser == "firefox" ) {
						
						
					  Thread.sleep(2000);
						Integer numbriks = Integer.valueOf(Case);
					
					System.out.println(brauser);
				  	if (numbriks == 1){
				  		
						UserSettings.SettingsCloseInformation(driver).click();
						 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
						LoggedIn.Friends(driver).click();
						 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Saadetud(driver)));
					
						LoggedIn.DropdownMenu(driver).click();
						 LoggedIn.Seaded(driver).click();
						 wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
				 
					  WebElement Fileinput = driver.findElement(By.name("account_image"));
						 Fileinput.click();
						
						 Fileinput.sendKeys(Constant.Pilt4);
						
						 Assert.assertTrue(UserSettings.Eemaldapilt(driver).isDisplayed());
					
						  Robot r = new Robot();
						  r.keyPress(KeyEvent.VK_ESCAPE);
						 	
							 long start = System.currentTimeMillis();
							  UserSettings.SettingsSaveInformation(driver).click();
							 
							Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());  
							 long finish = System.currentTimeMillis();
							 long totalTime = finish - start; 
							 Esimenetulemus = Long.toString(totalTime);
							 System.out.println("Total Time for page load - "+totalTime); 
								
								WriteToExcel.setExcelFile(Constant.ExceliAsukoht,"Sheet9");
								 WriteToExcel.setCellData(Esimenetulemus, numbriks ,4);
				  	}
				  	else
				  	{
				  		
				  	}
				
					
				}
				else if (brauser == "chrome"){
					
					  
			
					  Thread.sleep(2000);
						Integer numbriks = Integer.valueOf(Case);
					
					System.out.println(brauser);
					if(numbriks == 2){
						
						
					
					UserSettings.SettingsCloseInformation(driver).click();
					Thread.sleep(3000);
					 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
					 LoggedIn.Friends(driver).click();
					 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Saadetud(driver)));
						LoggedIn.DropdownMenu(driver).click();
						 LoggedIn.Seaded(driver).click();
						 wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));		 Thread.sleep(2000);
						UserSettings.Valipilt(driver).click(); 
						Thread.sleep(1000);
			
						 
						 
						 String myString = Constant.Pilt4;
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
						
						
						  long start = System.currentTimeMillis();
						  UserSettings.SettingsSaveInformation(driver).click();
						 wait.until(ExpectedConditions.visibilityOf(UserSettings.DataAdded(driver)));
				
						 long finish = System.currentTimeMillis();
						 long totalTime = finish - start; 
						 Esimenetulemus = Long.toString(totalTime);
						WriteToExcel.setExcelFile(Constant.ExceliAsukoht,"Sheet9");
						 WriteToExcel.setCellData(Esimenetulemus, numbriks ,4);
					}
					else{
				
					}
					
				}
				else {
				
				
					  Thread.sleep(2000);
						Integer numbriks = Integer.valueOf(Case);
					
					System.out.println(brauser);
					if(numbriks == 3){
					
						UserSettings.SettingsCloseInformation(driver).click();
						 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
						LoggedIn.Friends(driver).click();
						 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Saadetud(driver)));
					
						LoggedIn.DropdownMenu(driver).click();
						 LoggedIn.Seaded(driver).click();
						 wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
						UserSettings.Valipilt(driver).click(); 
			
						 
						 
						 String myString = Constant.Pilt4;
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
						
						
						  long start = System.currentTimeMillis();
						  UserSettings.SettingsSaveInformation(driver).click();
					
						Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());  
				
						 long finish = System.currentTimeMillis();
						 long totalTime = finish - start; 
						 Esimenetulemus = Long.toString(totalTime);
						WriteToExcel.setExcelFile(Constant.ExceliAsukoht,"Sheet9");
						 WriteToExcel.setCellData(Esimenetulemus, numbriks ,4);
						
					}else
					{
					}
					
					
				}
				  UserSettings.SettingsCloseInformation(driver).click();
				  Thread.sleep(3000);
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
