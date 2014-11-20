package Kysimus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.SocialMedia;
import Utils.*;

public class Kysimused extends Browser {
	
	  
	 
	  
  @Test
  public void TestK�simused() throws InterruptedException {
	  
	  String k�ssa = "Vaatame, et ta l�ikaks selle korralikult muidu probleem";
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();
	  Homepage.LoginUrl(driver).sendKeys("testime13");
	  Homepage.LoginPW(driver).sendKeys("testime11");
	  Homepage.LoginButton(driver).click();
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
	String UusK�simus = null;
	String Olemasolev = null;
	String OlemasolevMuudetud = null;
	driver.get(baseUrl);

	if(i==0){
			if (k�ssa.length() <= 34){
		
				LoggedIn.K�simusBox(driver).click();
				LoggedIn.K�simusBox(driver).sendKeys(k�ssa);
			
				Thread.sleep(5000);
			}
			else {
				String Uus = k�ssa.substring(0, 31)+"...";
				UusK�simus = Uus;
				LoggedIn.K�simusBox(driver).click();
				LoggedIn.K�simusBox(driver).sendKeys(k�ssa);
				System.out.print(UusK�simus);
			}
			}
	else{
		LoggedIn.QuestionDropdown(driver).click();

		Select UusSelection = new Select(LoggedIn.QuestionDropdown(driver));
 
		List<WebElement> UusSize = UusSelection.getOptions();
		UusSelection.selectByIndex(i);
		String K�ssa = UusSize.get(i).getText();
			if(K�ssa.length() > 34) {
			String Uus = K�ssa.substring(0, 31)+"...";
			OlemasolevMuudetud = Uus;
			System.out.print(Uus);
			
		}
			else {
				System.out.print(K�ssa);
	
				Olemasolev = K�ssa;
		}
	}
	LoggedIn.K�simusbutton(driver).click();
	Thread.sleep(1000);
String parenthandle =	driver.getWindowHandle();
driver.get(baseUrl);
LoggedIn.JagaUrlFacebook(driver).click();
	
			for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle); // sVahetame fookust uuele avanenud aknale
					driver.switchTo().frame(driver.findElement(By.className("FB_UI_Dialog")));
				}
					if(i==0){
						Thread.sleep(1500);
						Assert.assertTrue(driver.getPageSource().contains(UusK�simus));
		
		
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

	for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle); // sVahetame fookust uuele avanenud aknale
		}

			if(i==0){
	
				Assert.assertTrue(driver.getPageSource().contains(UusK�simus));
	
	
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
Thread.sleep(1000);
for (String winHandle2 : driver.getWindowHandles()) {
    driver.switchTo().window(winHandle2); // Vahetame Fookust uuele avanud aknale
}

				if(i==0){
					SocialMedia.TumblrLoginEmail(driver).sendKeys("selentest@hotmail.com");
					 SocialMedia.TumblrLoginPW(driver).sendKeys("testime11");
					 SocialMedia.TumblrLoginButton(driver).click();
					 Thread.sleep(1000);
					Assert.assertTrue(driver.getPageSource().contains(UusK�simus));
	
	
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
				
				Thread.sleep(1500);
				driver.close();
				
				driver.switchTo().window(parenthandle);
	}




}
}


	
	
	
	
	

	  
	 // 	if(k�ssa.length() <= 34) {
	  		
	  	//	Assert.assertTrue(driver.getPageSource().contains(k�ssa));
	  		
	  	//}
	  //	else {
	  		
	  	//	String Uus = k�ssa.substring(0, 30)+"...";
	  	//	Assert.assertTrue(driver.getPageSource().contains(Uus));
	  		
	  		
	  		
	 // 	}
	  
	  
	  
	  
	  
  

