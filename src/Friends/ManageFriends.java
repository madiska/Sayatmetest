package Friends;

import org.testng.annotations.Test;

import PageObjects.Homepage;
import Utils.Browser;

public class ManageFriends extends Browser {
  @Test
  public void TestFriendManagment() {
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys();
	  Homepage.LoginPW(driver).sendKeys();
	  Homepage.LoginButton(driver).click();
	  
	  
  }
}
