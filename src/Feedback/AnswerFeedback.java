package Feedback;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import Utils.*;

public class AnswerFeedback extends Browser{
	



  @Test(dataProvider = "FeedbackAnswer")
  public void AnswerPublicFeedback(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2, String Feedback3,String Vastus, String Email, String Social, String Number) throws InterruptedException {
	  
	  
	  driver.get("http://kask6iktundubkorras.sayat.me");
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.TagasiVasta(driver).click();
	  LoggedIn.TagasiVastaBox(driver).sendKeys(Vastus);
	  LoggedIn.TagasiVastaButton(driver).click();

	  
	  driver.findElement(By.cssSelector("div.comment:nth-child(4) > div:nth-child(1)"));
	  
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  
  }
  
@DataProvider
  
  public Object[][] FeedbackAnswer() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet5");

       return (testObjArray);

      }
  
}
