package Feedback;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.SocialMedia;
import Utils.Constant;
import Utils.ExcelUtils;
import Utils.Browser;

public class ShareOthersFeedback extends Browser {
	
	
	
	 
  @Test(dataProvider = "ShareOthersFeedbackdata")
  public void TestShareOthersFeedback(String Url1, String Url2, String Parool, String Facebook, String FBPw, String TwitterTMbl) throws InterruptedException {
	  driver.get("http://kask6iktundubkorras.sayat.me");
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	
	  driver.get("http://kask6iktundubkorras.sayat.me/"+Url2);
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
	  Thread.sleep(4000);
	  SocialMedia.FacebookLoginPublish(driver).click();
	 Thread.sleep(5000);
	  driver.switchTo().window(parentHandle);
	  
	  
	  
	  driver.get("http://kask6iktundubkorras.sayat.me/"+Url2);
	  LoggedIn.TagasiJaga(driver).click();
	  LoggedIn.TagasiJagatwitterKeegiTeine(driver).click();
	  Thread.sleep(2000);
	  for (String winHandle3 : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle3); // sVahetame fookust uuele avanenud aknale
		}
	  SocialMedia.TwitterLoginEmail(driver).sendKeys(TwitterTMbl);
	  SocialMedia.TwitterLoginPw(driver).sendKeys(Parool);
	  SocialMedia.TwitterLoginButton(driver).click();
	  SocialMedia.TwitterTweetButton(driver).click();
	  driver.switchTo().window(parentHandle);
	  driver.get("http://kask6iktundubkorras.sayat.me/"+Url2);
	  
	  
	  
	  LoggedIn.TagasiJaga(driver).click();
	  LoggedIn.TagasiJagaTumbler(driver).click();

	  Thread.sleep(4000);
	  for (String winHandle2 : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle2); // Vahetame Fookust uuele avanud aknale
		}

	  SocialMedia.TumblrLoginEmail(driver).sendKeys(TwitterTMbl);
	  SocialMedia.TumblrLoginPW(driver).sendKeys(Parool);
	  SocialMedia.TumblrLoginButton(driver).click();
	  SocialMedia.TumblrCreatePost(driver).click();
	  
	
	  
	  
	  driver.switchTo().window(parentHandle);
	  driver.get("http://kask6iktundubkorras.sayat.me");
	  
	  
	  
	   
	  
	  
	  
	   
	  
	  
  }
  
@DataProvider
  
  public Object[][] ShareOthersFeedbackdata() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet7");

       return (testObjArray);

      }
}
