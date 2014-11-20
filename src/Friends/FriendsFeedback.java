package Friends;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import Utils.Browser;
import Utils.Constant;
import Utils.ExcelUtils;

public class FriendsFeedback extends Browser{
	
	
	
  @Test(dataProvider = "FriendsFeedbackVal")
  public void TestFriendsFeedback(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2, String Feedback3, String Answer, String Email, String Social, String Number) throws InterruptedException {
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  Thread.sleep(1500);
	  LoggedIn.Friends(driver).click();
	  
	
		
		 Assert.assertTrue(driver.getPageSource().contains(Feedback3));

	 

}
@DataProvider
  
  public Object[][] FriendsFeedbackVal() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet5");

       return (testObjArray);

      }
}
