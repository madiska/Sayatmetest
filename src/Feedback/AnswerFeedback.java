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

public class AnswerFeedback extends Browser{
	
	

  @Test(dataProvider = "FeedbackAnswer")
  public void TestAnswerFeedback(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2, String Feedback3,String Vastus, String Email, String Social, String Number) throws InterruptedException {
	  
	  
	  driver.get("http://kask6iktundubkorras.sayat.me");
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.TagasiVasta(driver).click();
	  LoggedIn.TagasiVastaBox(driver).sendKeys(Vastus);
	  LoggedIn.TagasiVastaButton(driver).click();
	  Thread.sleep(3000);
	  
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
