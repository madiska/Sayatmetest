package GeneralFunctions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.UserSettings;
import Utils.*;

public class ChangeProfilePic extends Browser{
	

	
	
  @Test(dataProvider ="Upload")
  public void TestProfilePic(String Case, String BrauserOs, String Esimenetulemus, String TeineTulemus, String KolmasTulemus) throws Exception {
	  
	  
	  
	  driver.get(baseUrl);		
	
 	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys("testime13");
	  Homepage.LoginPW(driver).sendKeys("testime11");
	  Homepage.LoginButton(driver).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Toivo Tavaline")).click();
	  LoggedIn.Seaded(driver).click();
	  Thread.sleep(2000);
	
	 
				  if (brauser == "firefox" ) {
					
				
						  Thread.sleep(2000);
							Integer numbriks = Integer.valueOf(Case);
						
						System.out.println(brauser);
					  	if (numbriks == 1){
					 
						  WebElement Fileinput = driver.findElement(By.name("account_image"));
							 Fileinput.click();
							
							 Fileinput.sendKeys("C:\\Users\\Madis\\Downloads\\test1.png");
							
							 Assert.assertTrue(UserSettings.Eemaldapilt(driver).isDisplayed());
							  Robot r = new Robot();
							  r.keyPress(KeyEvent.VK_ESCAPE);
							  Thread.sleep(1000);
							
							
					
					  	
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
				
							 
							 
							 String myString = "C:\\Users\\Madis\\Downloads\\test1.png";
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
				
							 
							 
							 String myString = "C:\\Users\\Madis\\Downloads\\test1.png";
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
				 
					  WebElement Fileinput = driver.findElement(By.name("account_image"));
						 Fileinput.click();
						
						 Fileinput.sendKeys("C:\\Users\\Madis\\Downloads\\2mb.jpg");
						
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
						driver.get(baseUrl+"testime13");
						Thread.sleep(2000);
						LoggedIn.DropdownMenu(driver).click();
						 LoggedIn.Seaded(driver).click();
						  Thread.sleep(2000);
						
						UserSettings.Valipilt(driver).click(); 
						Thread.sleep(1000);
						 
						 
						 String myString = "C:\\Users\\Madis\\Downloads\\2mb.jpg";
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
						driver.get(baseUrl+"testime13");
						Thread.sleep(2000);
						LoggedIn.DropdownMenu(driver).click();
						 LoggedIn.Seaded(driver).click();
						  Thread.sleep(2000);
						
						UserSettings.Valipilt(driver).click(); 
			
						 
						 
						 String myString = "C:\\Users\\Madis\\Downloads\\2mb.jpg";
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
						driver.get(baseUrl+"testime13");
						Thread.sleep(2000);
						LoggedIn.DropdownMenu(driver).click();
						 LoggedIn.Seaded(driver).click();
						  Thread.sleep(2000);
				 
					  WebElement Fileinput = driver.findElement(By.name("account_image"));
						 Fileinput.click();
						
						 Fileinput.sendKeys("C:\\Users\\Madis\\Downloads\\2,7mb.jpg");
						
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
					Thread.sleep(2000);
						LoggedIn.DropdownMenu(driver).click();
						 LoggedIn.Seaded(driver).click();
						 Thread.sleep(2000);
						UserSettings.Valipilt(driver).click(); 
						Thread.sleep(1000);
			
						 
						 
						 String myString = "C:\\Users\\Madis\\Downloads\\2,7mb.jpg";
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
						driver.get(baseUrl+"testime13");
						Thread.sleep(2000);
						LoggedIn.DropdownMenu(driver).click();
						 LoggedIn.Seaded(driver).click();
						  Thread.sleep(2000);
						UserSettings.Valipilt(driver).click(); 
			
						 
						 
						 String myString = "C:\\Users\\Madis\\Downloads\\2,7mb.jpg";
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
  }
  @DataProvider
  
  

  public Object[][] Upload() throws Exception{

   Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet9");

   return (testObjArray);

  }
  
}
