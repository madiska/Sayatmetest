package Feedback;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
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
  public void CommentPublicFeedbackTest (String Url1, String Url2, String Parool, String PrivateAnswer, String PrivateComment, String publiccomment, String Feedback3) throws InterruptedException {
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();

	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));

	  
	  driver.get(baseUrl+Url2);
	  Profile.CommentFeedback(driver).click();
	  Profile.CommentFeedbackTextBox(driver).click();
	  Profile.CommentFeedbackTextBox(driver).sendKeys(publiccomment);
	  Profile.CommentFeedbackTextBoxButton(driver).click();
	  
	
	  
	  Assert.assertTrue(driver.getPageSource().contains(publiccomment));
	  
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Homepage.RegButton(driver)));
	  
	  driver.get(baseUrl+Url2);
	  Assert.assertFalse(driver.getPageSource().contains(PrivateComment));
	  Assert.assertFalse(driver.getPageSource().contains(PrivateAnswer));
	  
	  

	  
	  
  }
  
  
@DataProvider
  
  public Object[][] CommentData() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet8");

       return (testObjArray);

      }
}
