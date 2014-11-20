package sayatme.Registration;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.Assert;





import org.openqa.selenium.*;

import PageObjects.*;
import Utils.Constant;
import Utils.ExcelUtils;
import Utils.Browser;



public class FeedbackRegInval extends Browser {

 

  private StringBuffer verificationErrors = new StringBuffer();

 

  @Test (dataProvider = "FeedbackReg")
  public void testFeedbackRegInval(String Nimi, String Url, String Parool, String Passmismatch, String passlyhike, String Urlkorras, String ebasobilikurl, String tagasiside, String otsi  ) throws Exception {
  
	  driver.get(baseUrl+Url);
	
   Profile.TagasisideTextBox(driver).sendKeys(tagasiside);
   Profile.TagasisideCheckBox(driver).click();
   Profile.ProfileFeedbackRegNimi(driver).sendKeys(Nimi);
   Profile.ProfileFeedbackRegPW(driver).sendKeys(Parool);
   Profile.ProfileFeedbackRegConfirmPW(driver).sendKeys(Parool);
   Profile.ProfileFeedbackRegUrl(driver).sendKeys(Url);
  Thread.sleep(2000);
  	Assert.assertTrue(ErrorMessages.Urleiolesaadaval(driver).isDisplayed());
   
  Profile.ProfileFeedBackRegButton(driver).click();
  Assert.assertTrue(ErrorMessages.FeedbackUrlonveotud(driver).isDisplayed());
  Thread.sleep(2000);
    try {
      AssertJUnit.assertFalse(isElementPresent(By.linkText(Nimi)));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }


    driver.get(baseUrl+Url);
Profile.TagasisideTextBox(driver).sendKeys(tagasiside);
Profile.TagasisideCheckBox(driver).click();
Profile.ProfileFeedbackRegNimi(driver).sendKeys(Nimi);
Profile.ProfileFeedbackRegPW(driver).sendKeys(Parool);
Profile.ProfileFeedbackRegConfirmPW(driver).sendKeys(Passmismatch);
Profile.ProfileFeedbackRegUrl(driver).sendKeys(Urlkorras);
Thread.sleep(2000);
Profile.ProfileFeedBackRegButton(driver).click();
Thread.sleep(2000);
Assert.assertTrue(ErrorMessages.FeedbackPWmismatch(driver).isDisplayed());






driver.get(baseUrl+Url);
Profile.TagasisideTextBox(driver).sendKeys(tagasiside);
Profile.TagasisideCheckBox(driver).click();
Profile.ProfileFeedbackRegNimi(driver).sendKeys(Nimi);
Profile.ProfileFeedbackRegPW(driver).sendKeys(passlyhike);
Profile.ProfileFeedbackRegConfirmPW(driver).sendKeys(passlyhike);
Profile.ProfileFeedbackRegUrl(driver).sendKeys(Urlkorras);
Thread.sleep(2000);
Profile.ProfileFeedBackRegButton(driver).click();
Thread.sleep(2000);
Assert.assertTrue(ErrorMessages.FeedbackPWPikkus(driver).isDisplayed());






driver.get(baseUrl+Url);
Profile.TagasisideTextBox(driver).sendKeys(tagasiside);
Profile.TagasisideCheckBox(driver).click();
Profile.ProfileFeedbackRegNimi(driver).sendKeys(Nimi);
Profile.ProfileFeedbackRegPW(driver).sendKeys(Parool);
Profile.ProfileFeedbackRegConfirmPW(driver).sendKeys(Parool);
Profile.ProfileFeedbackRegUrl(driver).sendKeys(ebasobilikurl);
Thread.sleep(2000);
Profile.ProfileFeedBackRegButton(driver).click();
Thread.sleep(2000);
Assert.assertTrue(ErrorMessages.FeedbackUrleisobiclick(driver).isDisplayed());



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
  
  public Object[][] FeedbackReg() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Reg");

       return (testObjArray);

      }
}
