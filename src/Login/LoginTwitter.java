package Login;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import Utils.Constant;
import Utils.ExcelUtils;
import Utils.Browser;

public class LoginTwitter extends Browser {
	
	
	
  @Test(dataProvider ="twitter")
  public void TestTwitterLogin(String Url1, String Url2, String Parool, String Facebook, String FBPw, String TwitterTMbl) {
	  

	  driver.get(baseUrl);
	  Homepage.Login(driver).click();
	 
	 Homepage.LoginWithTwitter(driver).click();
	 Homepage.LoginWithTwitterUsername(driver).sendKeys(TwitterTMbl);
	 Homepage.LoginWithTwitterPassword(driver).sendKeys(Parool);
	 Homepage.LoginWithTwitterAuthorizeButton(driver).click();

	  
	   
		 Assert.assertTrue(LoggedIn.Saadud(driver).isDisplayed());
		 Assert.assertTrue(LoggedIn.Saadetud(driver).isDisplayed());
		 
	  
  }
@DataProvider
  
  public Object[][] twitter() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet7");

       return (testObjArray);

      }
}
