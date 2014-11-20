package Feedback;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import Utils.*;




public class MakeFeedbackPublic extends Browser {

	


  @Test(dataProvider = "FeedbackPublic")
  public void TestFeedbackPublic(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2, String Feedback3,String Answer, String Email, String Social, String Number) throws InterruptedException {
	  
	  driver.get("http://kask6iktundubkorras.sayat.me");
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url2);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.TeeAvalikuks(driver).click();
	  
	  Thread.sleep(2000);
	  Assert.assertTrue(LoggedIn.TeePrivaatseks(driver).isDisplayed());
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  
	  driver.get("http://kask6iktundubkorras.sayat.me/"+Url2);

	  
  }
  
@DataProvider
  
  public Object[][] FeedbackPublic() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet5");

       return (testObjArray);

      }
  
  
}
