package sayatme.Registration;

import org.testng.annotations.Test;

import PageObjects.SocialMedia;
import PageObjects.Homepage;

import Utils.Browser;

public class RegisterTwitter extends Browser{
  @Test
  public void TestRegisterTwitter() {
	  //Ei funka preagu
	  
	  driver.get(baseUrl);
	  Homepage.RegTwitter(driver).click();
	  SocialMedia.TwitterLoginEmail(driver).sendKeys();
	  SocialMedia.TwitterLoginPw(driver).sendKeys();
	  SocialMedia.TwitterLoginButton(driver).click();
	
	  
  }
}
