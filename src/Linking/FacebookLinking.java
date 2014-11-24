package Linking;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.Browser;
import Utils.Constant;
import Utils.ExcelUtils;
import PageObjects.*;

public class FacebookLinking extends Browser{
	
	

	 
	
  @Test(dataProvider ="facebook")
  public void TestFacebookLinking(String Url1, String Url2, String Parool, String Facebook, String FBPw, String TwitterTMbl) throws InterruptedException {
	  

	  
	  driver.get(baseUrl);
		
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Seaded(driver).click();
	  UserSettings.SocialNetworks(driver).click();
	  UserSettings.SocialNetworksFacebook(driver).click();
	  Thread.sleep(2000);
	  SocialMedia.FacebookLoginEmail(driver).sendKeys(Facebook);
	  SocialMedia.FacebookLoginPW(driver).sendKeys(FBPw);
	  SocialMedia.FacebookLoginButton(driver).click();
	  Thread.sleep(3000);
	  SocialMedia.FacebookLoginAccept(driver).click();
	  Thread.sleep(3000);
	  
	  SocialMedia.FacebookLoginAccept(driver).click();
	 
	  
  }
@DataProvider
  
  public Object[][] facebook() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet7");

       return (testObjArray);

      }
}
