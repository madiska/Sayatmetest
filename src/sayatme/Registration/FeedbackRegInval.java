package sayatme.Registration;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.Assert;





import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
   wait.until(ExpectedConditions.visibilityOf(ErrorMessages.Urleiolesaadaval(driver)));	
   
   
  Profile.ProfileFeedBackRegButton(driver).click();

  wait.until(ExpectedConditions.visibilityOf(ErrorMessages.FeedbackUrlonveotud(driver)));
  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    try {
      AssertJUnit.assertFalse(isElementPresent(By.linkText(Nimi)));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.get(baseUrl+Url);
Profile.TagasisideTextBox(driver).sendKeys(tagasiside);
Profile.TagasisideCheckBox(driver).click();
Profile.ProfileFeedbackRegNimi(driver).sendKeys(Nimi);
Profile.ProfileFeedbackRegPW(driver).sendKeys(Parool);
Profile.ProfileFeedbackRegConfirmPW(driver).sendKeys(Passmismatch);
Profile.ProfileFeedbackRegUrl(driver).sendKeys(Urlkorras);

Profile.ProfileFeedBackRegButton(driver).click();
wait.until(ExpectedConditions.visibilityOf(ErrorMessages.FeedbackPWmismatch(driver)));	







driver.get(baseUrl+Url);
Profile.TagasisideTextBox(driver).sendKeys(tagasiside);
Profile.TagasisideCheckBox(driver).click();
Profile.ProfileFeedbackRegNimi(driver).sendKeys(Nimi);
Profile.ProfileFeedbackRegPW(driver).sendKeys(passlyhike);
Profile.ProfileFeedbackRegConfirmPW(driver).sendKeys(passlyhike);
Profile.ProfileFeedbackRegUrl(driver).sendKeys(Urlkorras);

Profile.ProfileFeedBackRegButton(driver).click();
wait.until(ExpectedConditions.visibilityOf(ErrorMessages.FeedbackPWPikkus(driver)));	







driver.get(baseUrl+Url);
Profile.TagasisideTextBox(driver).sendKeys(tagasiside);
Profile.TagasisideCheckBox(driver).click();
Profile.ProfileFeedbackRegNimi(driver).sendKeys(Nimi);
Profile.ProfileFeedbackRegPW(driver).sendKeys(Parool);
Profile.ProfileFeedbackRegConfirmPW(driver).sendKeys(Parool);
Profile.ProfileFeedbackRegUrl(driver).sendKeys(ebasobilikurl);

Profile.ProfileFeedBackRegButton(driver).click();
wait.until(ExpectedConditions.visibilityOf(ErrorMessages.FeedbackUrleisobiclick(driver)));	




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
