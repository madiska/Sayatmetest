package sayatme.Registration;

import org.testng.annotations.Test;
import Utils.*;
import PageObjects.*;

public class RegisterFacebook extends Browser  {
  @Test
  public void TestRegisterwithFacebook() {
	  // Seda korraga ainult ühes brauseris lasta. Kuna preagu hakkavad testid paraleelselt tööle ning 
	  driver.get(baseUrl);
	  Homepage.RegFacebookButton(driver).click();
	  SocialMedia.FacebookLoginEmail(driver).click();
	  SocialMedia.FacebookLoginPW(driver).click();
	  SocialMedia.FacebookLoginButton(driver).click();
	  Homepage.RegFacebookUrl(driver).sendKeys();
	  Homepage.RegFacebookButton(driver).click();
	  
	  
	  
  }
}
