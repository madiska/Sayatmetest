package Kysimus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.SocialMedia;
import Utils.*;

public class Kysimused extends Browser {
	
	  
	 
	  
  @Test
  public void TestKysimused() throws InterruptedException, AWTException, IOException {
	  
	  String kyssa = "Vaatame, et ta loikaks selle korralikult muidu probleem";
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();
	  Homepage.LoginUrl(driver).sendKeys("testime13");
	  Homepage.LoginPW(driver).sendKeys("testime11");
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  driver.get("http://Facebook.com");
	  SocialMedia.FacebookLoginEmail(driver).sendKeys("lqxelkw_chaisen_1415285502@tfbnw.net");
	  SocialMedia.FacebookLoginPW(driver).sendKeys("madis");
	  SocialMedia.FacebookLoginButtonFromWebsite(driver).click();
	
	
	
	  

	  driver.get(baseUrl);
	  
	  


Select oSelection = new Select(LoggedIn.QuestionDropdown(driver));
 
List<WebElement> oSize = oSelection.getOptions();
 
int iListSize = oSize.size();

System.out.print(iListSize);

for (int i = 0; i <iListSize; i++) {
	String UusKysimus = null;
	String Olemasolev = null;
	String OlemasolevMuudetud = null;
	driver.get(baseUrl);

	if(i==0){
			if (kyssa.length() <= 34){
		
				LoggedIn.KysimusBox(driver).click();
				LoggedIn.KysimusBox(driver).sendKeys(kyssa);
			
				Thread.sleep(5000);
			}
			else {
				String Uus = kyssa.substring(0, 31)+"...";
				UusKysimus = Uus;
				LoggedIn.KysimusBox(driver).click();
				LoggedIn.KysimusBox(driver).sendKeys(kyssa);
				System.out.print(UusKysimus);
			}
			}
	else{
		LoggedIn.QuestionDropdown(driver).click();

		Select UusSelection = new Select(LoggedIn.QuestionDropdown(driver));
 
		List<WebElement> UusSize = UusSelection.getOptions();
		UusSelection.selectByIndex(i);
		if (brauser == "firefox"){
			 Robot robot = new Robot();
			  robot.keyPress(KeyEvent.VK_ENTER);
			
			
			
		}
		else {
			
		}
		
		String Kyssa = UusSize.get(i).getText();
			if(Kyssa.length() > 34) {
			String Uus = Kyssa.substring(0, 31)+"...";
			OlemasolevMuudetud = Uus;
			System.out.print(Uus);
			
		}
			else {
				System.out.print(Kyssa);
	
				Olemasolev = Kyssa;
		}
	}
	Thread.sleep(2000);
	LoggedIn.Kysimusbutton(driver).click();
	wait.until(ExpectedConditions.visibilityOf(LoggedIn.SuccessKyssauuendus(driver)));
String parenthandle =	driver.getWindowHandle();
driver.get(baseUrl);
LoggedIn.JagaUrlFacebook(driver).click();


		//	for (String winHandle : driver.getWindowHandles()) {
		//		System.out.print(driver.getWindowHandles().size());
			//		driver.switchTo().window(winHandle); // sVahetame fookust uuele avanenud aknale
					driver.switchTo().frame(driver.findElement(By.className("FB_UI_Dialog")));
			//	}
					if(i==0){
						Thread.sleep(1000);
						Assert.assertTrue(driver.getPageSource().contains(UusKysimus));
		
		
					}
					else{
						
						if (Olemasolev != null) {
							Thread.sleep(1000);
						Assert.assertTrue(driver.getPageSource().contains(Olemasolev));
						}
						else {
							Thread.sleep(1000);
							Assert.assertTrue(driver.getPageSource().contains(OlemasolevMuudetud));
						}
		
					}
					
					SocialMedia.FacebookLoginCancel(driver).click();
					
					driver.switchTo().defaultContent();
				//	driver.switchTo().defaultContent();
			//		driver.switchTo().window(parenthandle);
					
Thread.sleep(1000);		
driver.get(baseUrl);
LoggedIn.JagaUrlTwitter(driver).click();

	//for (String winHandle : driver.getWindowHandles()) {
		//	driver.switchTo().window(winHandle); // sVahetame fookust uuele avanenud aknale
		//}

			if(i==0){
	
				Assert.assertTrue(driver.getPageSource().contains(UusKysimus));
	
	
					}
			else{
					if (Olemasolev != null) {
					Thread.sleep(1000);
					Assert.assertTrue(driver.getPageSource().contains(Olemasolev));
				}
					else {
						Thread.sleep(1000);
						Assert.assertTrue(driver.getPageSource().contains(OlemasolevMuudetud));
				}
	
				}


			driver.get(baseUrl);
Thread.sleep(1000);		
LoggedIn.JagaUrlTumblr(driver).click();

for (int o = 0; o < 20; o++) {

	if(driver.getWindowHandles().size()==2)
		break;
	else {
		System.out.print("Aken pole veel lahti");
	}
	
} 


for (String winHandle2 : driver.getWindowHandles()) {
	
    driver.switchTo().window(winHandle2); // Vahetame Fookust uuele avanud aknale
}

				if(i==0){
					SocialMedia.TumblrLoginEmail(driver).sendKeys("selentest@hotmail.com");
					 SocialMedia.TumblrLoginPW(driver).sendKeys("testime11");
					 SocialMedia.TumblrLoginButton(driver).click();
					 Thread.sleep(3000);
					Assert.assertTrue(driver.getPageSource().contains(UusKysimus));
	
	
				}
				
				else {
				if (Olemasolev != null) {
					Thread.sleep(1000);
				Assert.assertTrue(driver.getPageSource().contains(Olemasolev));
				}
				else {
					Thread.sleep(1000);
					Assert.assertTrue(driver.getPageSource().contains(OlemasolevMuudetud));
				}
			}
				
				Thread.sleep(1000);
				if(brauser == "IE") {
					driver.findElement(By.id("link_post_one")).clear();
				}
				else {}
				
				
				
				
				while (driver.getWindowHandles().size() == 2) {
					driver.close();
					Thread.sleep(3000);
					
					driver.switchTo().window(parenthandle);
					break;
				}
			
	}

	LoggedIn.DropdownMenu(driver).click();
	LoggedIn.Logout(driver).click();
	wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));


}
}


	
	
	
	
	

	  
	 // 	if(kyssa.length() <= 34) {
	  		
	  	//	Assert.assertTrue(driver.getPageSource().contains(kyssa));
	  		
	  	//}
	  //	else {
	  		
	  	//	String Uus = kyssa.substring(0, 30)+"...";
	  	//	Assert.assertTrue(driver.getPageSource().contains(Uus));
	  		
	  		
	  		
	 // 	}
	  
	  
	  
	  
	  
  

