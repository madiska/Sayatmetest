package Linking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.SocialMedia;
import PageObjects.UserSettings;
import Utils.*;



public class TwitterLinking extends Browser{
	
	
	
  @Test(dataProvider = "twitter")
  public void TestTwitterLinking(String Url1, String Url2, String Parool, String Facebook, String FBPw, String TwitterTMbl) throws InterruptedException {
	  
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Seaded(driver).click();
	  Thread.sleep(1000);
	  UserSettings.SocialNetworks(driver).click();
	  UserSettings.SocialNetworksTwitter(driver).click();
	  SocialMedia.TwitterLoginEmail(driver).sendKeys(TwitterTMbl);
	  SocialMedia.TwitterLoginPw(driver).sendKeys(Parool);
	  SocialMedia.TwitterAutohorise(driver).click();

  }
  
@DataProvider
  
  public Object[][] twitter() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet7");

       return (testObjArray);

      }
}
