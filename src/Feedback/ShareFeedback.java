package Feedback;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.SocialMedia;
import Utils.*;

public class ShareFeedback extends Browser {
	

	 
	
	
  @Test(dataProvider = "ShareFeedback1")
  public void TestShareFeedback(String Url1, String Url2, String Parool, String Facebook, String FBPw, String TwitterTMbl) throws InterruptedException {
	  
	  
	  driver.get("http://kask6iktundubkorras.sayat.me");
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  String parentHandle = driver.getWindowHandle(); 
	  LoggedIn.TagasiJaga(driver).click();
	  LoggedIn.TagasiJagaFacebook(driver).click();
	  Thread.sleep(1000);
	  for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // sVahetame fookust uuele avanenud aknale
		}

	  SocialMedia.FacebookLoginEmail(driver).sendKeys(Facebook);
	  SocialMedia.FacebookLoginPW(driver).sendKeys(FBPw);
	  SocialMedia.FacebookLoginButton(driver).click();
	  Thread.sleep(2000);
	  SocialMedia.FacebookLoginPublish(driver).click();
	 Thread.sleep(5000);
	  driver.switchTo().window(parentHandle);
	  driver.get("http://kask6iktundubkorras.sayat.me");
	  LoggedIn.TagasiJaga(driver).click();
	  LoggedIn.TagasiJagatwitter(driver).click();
	  SocialMedia.TwitterLoginEmail(driver).sendKeys(TwitterTMbl);
	  SocialMedia.TwitterLoginPw(driver).sendKeys(Parool);
	  SocialMedia.TwitterLoginButton(driver).click();
	  SocialMedia.TwitterTweetButton(driver).click();
	  driver.get("http://kask6iktundubkorras.sayat.me");
	  
	  
	  
	  LoggedIn.TagasiJaga(driver).click();
	  LoggedIn.TagasiJagaTumbler(driver).click();
 
	  Thread.sleep(2000);
	  for (String winHandle2 : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle2); // sVahetame fookust uuele avanenud aknale
		}

	  SocialMedia.TumblrLoginEmail(driver).sendKeys(TwitterTMbl);
	  SocialMedia.TumblrLoginPW(driver).sendKeys(Parool);
	  SocialMedia.TumblrLoginButton(driver).click();
	  SocialMedia.TumblrCreatePost(driver).click();
	  
	
	  
	  
	  driver.switchTo().window(parentHandle);
	  driver.get("http://kask6iktundubkorras.sayat.me");
	  
	  
	  
	   
	  
	  
  }
  
@DataProvider
  
  public Object[][] ShareFeedback1() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet7");

       return (testObjArray);

      }
}
