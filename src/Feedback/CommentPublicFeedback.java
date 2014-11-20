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
import PageObjects.Profile;
import Utils.Constant;
import Utils.ExcelUtils;
import Utils.Browser;
public class CommentPublicFeedback extends Browser{
	

	 
	  
  @Test(dataProvider = "CommentData")
  public void TestCommentPublicFeedback(String Url1, String Url2, String Parool, String PrivateAnswer, String PrivateComment, String publiccomment, String Feedback3) throws InterruptedException {
	  
	  driver.get("http://kask6iktundubkorras.sayat.me");
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  
	  driver.get("http://kask6iktundubkorras.sayat.me/"+Url2);
	  Profile.CommentFeedback(driver).click();
	  Profile.CommentFeedbackTextBox(driver).click();
	  Profile.CommentFeedbackTextBox(driver).sendKeys(publiccomment);
	  Profile.CommentFeedbackTextBoxButton(driver).click();
	  
	  Thread.sleep(3000);
	  
	  Assert.assertTrue(driver.getPageSource().contains(publiccomment));
	  
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  
	  driver.get("http://kask6iktundubkorras.sayat.me/"+Url2);
	  Assert.assertFalse(driver.getPageSource().contains(PrivateComment));
	  Assert.assertFalse(driver.getPageSource().contains(PrivateAnswer));
	  
	  

	  
	  
  }
  
  
@DataProvider
  
  public Object[][] CommentData() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet8");

       return (testObjArray);

      }
}
