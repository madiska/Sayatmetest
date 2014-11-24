package Login;

import Utils.Browser;
import Utils.Constant;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import Utils.ExcelUtils;

public class LoginFacebook extends Browser{
	


	
  @Test(dataProvider = "facebook")
  public void TestFacebookLogin(String Url1, String Url2, String Parool, String Facebook, String FBPw, String TwitterTMbl) {
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();
	  Homepage.LoginWithFaceBook(driver).click();
	  Homepage.LoginWithFaceBookEmail(driver).sendKeys(Facebook);
	  Homepage.LoginWithFaceBookPassword(driver).sendKeys(FBPw);
	  Homepage.LoginWithFaceBookButton(driver).click();
	  
	 Assert.assertTrue(LoggedIn.Saadud(driver).isDisplayed());
	 Assert.assertTrue(LoggedIn.Saadetud(driver).isDisplayed());
	 
  }
@DataProvider
  
  public Object[][] facebook() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet7");

       return (testObjArray);

      }
}
