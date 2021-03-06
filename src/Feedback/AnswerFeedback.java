package Feedback;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import Utils.*;

public class AnswerFeedback extends Browser{
	



  @Test(dataProvider = "FeedbackAnswer")
  public void AnswerPublicFeedback(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2, String Feedback3,String Vastus, String Email, String Social, String Number) throws InterruptedException {
	  
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.TagasiVasta(driver).click();
	  LoggedIn.TagasiVastaBox(driver).sendKeys(Vastus);
	  LoggedIn.TagasiVastaButton(driver).click();

	  // Stale Element Exceptioni lahti saamiseks, tuli element uuesti leida. 
	  driver.findElement(By.cssSelector("span.feed-item-form button.btn.btn-xs.btn-link.reply"));
	  
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
	  
  }
  
@DataProvider
  
  public Object[][] FeedbackAnswer() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet5");

       return (testObjArray);

      }
  
}
