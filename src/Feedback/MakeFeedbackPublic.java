package Feedback;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.Profile;
import Utils.*;




public class MakeFeedbackPublic extends Browser {

	


  @Test(dataProvider = "FeedbackPublic")
  public void MakingFeedbackPublic(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2, String Feedback3,String Answer, String Email, String Social, String Number) throws InterruptedException {
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url2);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.TeeAvalikuks(driver).click();
	  

	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.TeePrivaatseks(driver)));
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
	  
	  driver.get(baseUrl+Url2);
	  wait.until(ExpectedConditions.visibilityOf(Profile.TagasisideTextBox(driver)));
	  Assert.assertTrue(driver.getPageSource().contains(Feedback3));
  }
  
@DataProvider
  
  public Object[][] FeedbackPublic() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet5");

       return (testObjArray);

      }
  
  
}
