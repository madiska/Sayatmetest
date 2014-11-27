package Feedback;


import org.testng.annotations.Test;
import org.testng.Assert;






import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.Profile;
import Utils.Constant;
import Utils.ExcelUtils;
import Utils.Browser;



public class FeedbackVal extends Browser{



	


  @Test (dataProvider ="Feedbackval")
  public void GiveValidFeedback(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2, String Feedback3,String Answer, String Email, String Social, String Number) throws Exception {
  
	  driver.get(baseUrl+Url2);


 
   Profile.TagasisideTextBox(driver).sendKeys(Feedback1);
   Profile.TagasisideButton(driver).click();
 

   driver.get(baseUrl);
   Homepage.Login(driver).click();

   Homepage.LoginUrl(driver).sendKeys(Url1);

   Homepage.LoginPW(driver).sendKeys(Parool);
   Homepage.LoginButton(driver).click();

  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
   driver.get(baseUrl+Url2);


   	Profile.TagasisideTextBox(driver).sendKeys(Feedback2);
   	Profile.TagasisideCheckBox(driver).click();
   	Profile.TagasisideButton(driver).click();
   	Assert.assertTrue(LoggedIn.SuccessFeedback(driver).isDisplayed());
   	driver.get(baseUrl+Url2);





   		Profile.TagasisideTextBox(driver).sendKeys(Feedback3);
   		Profile.TagasisideButton(driver).click();
   		
   		wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.KysimusLisaPilt(driver)));
   	 



LoggedIn.Saadetud(driver).click();

Assert.assertTrue(LoggedIn.SaadetudFeedItem(driver).isDisplayed());

Assert.assertTrue(driver.getPageSource().contains(Feedback3));


LoggedIn.DropdownMenu(driver).click();
LoggedIn.Logout(driver).click();






}

 











private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  
  
  
@DataProvider
  
  public Object[][] Feedbackval() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet5");

       return (testObjArray);

      }
}


