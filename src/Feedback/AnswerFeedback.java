package Feedback;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import Utils.*;

public class AnswerFeedback extends Browser{
	
	

  @Test(dataProvider = "FeedbackAnswer")
  public void TestAnswerFeedback(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2, String Feedback3,String Vastus, String Email, String Social, String Number) throws InterruptedException {
	  
	  
	  driver.get("http://kask6iktundubkorras.sayat.me");
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.TagasiVasta(driver).click();
	  LoggedIn.TagasiVastaBox(driver).sendKeys(Vastus);
	  LoggedIn.TagasiVastaButton(driver).click();

	  
	  Assert.assertTrue(driver.getPageSource().contains(Vastus));
	  
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  
  }
  
@DataProvider
  
  public Object[][] FeedbackAnswer() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet5");

       return (testObjArray);

      }
  
}
