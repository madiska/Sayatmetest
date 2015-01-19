package sayatme.Registration;

import org.testng.Assert;
import org.testng.AssertJUnit;

import java.util.regex.Pattern;

import PageObjects.ErrorMessages;
import PageObjects.Homepage;
import PageObjects.Profile;
import Utils.Browser;
import Utils.Constant;
import Utils.ExcelUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;



@SuppressWarnings("unused")
public class ProfileRegInv extends Browser {
 
	
	
   private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

 


  @Test (dataProvider = "ProfRegamine")
  public void testProfileRegInv (String Nimi, String Url, String Parool, String Passmismatch, String passlyhike, String Urlkorras, String ebasobilikurl, String tagasiside, String otsi) throws Exception {
 
	  driver.get(baseUrl+Url);
Profile.ProfileRegNimi(driver).sendKeys(Nimi);
   
Profile.ProfileRegPW(driver).sendKeys(Parool);
  
Profile.ProfileRegConfirmPW(driver).sendKeys(Parool);
 
Profile.ProfileRegUrl(driver).sendKeys(Url);
Thread.sleep(3000);

Profile.ProfileRegButton(driver).click();


    wait.until(ExpectedConditions.visibilityOf(ErrorMessages.Urlonveotud(driver)));
  driver.get(baseUrl);
  wait.until(ExpectedConditions.visibilityOf(Homepage.Login(driver)));

  

driver.get(baseUrl+Url);


Profile.ProfileRegNimi(driver).sendKeys(Nimi);

Profile.ProfileRegPW(driver).sendKeys(Passmismatch);
Profile.ProfileRegConfirmPW(driver).sendKeys(Parool);
Profile.ProfileRegUrl(driver).sendKeys(Urlkorras);
Thread.sleep(2000);
Profile.ProfileRegButton(driver).click();
Thread.sleep(2000);
Assert.assertTrue(ErrorMessages.PWmismatchProfile(driver).isDisplayed());

wait.until(ExpectedConditions.visibilityOf(ErrorMessages.PWmismatchProfile(driver)));


driver.get(baseUrl);
wait.until(ExpectedConditions.visibilityOf(Homepage.Login(driver)));




driver.get(baseUrl+Url);

Profile.ProfileRegNimi(driver).sendKeys(Nimi);

Profile.ProfileRegPW(driver).sendKeys(passlyhike);

Profile.ProfileRegConfirmPW(driver).sendKeys(passlyhike);

Profile.ProfileRegUrl(driver).sendKeys(Urlkorras);
Thread.sleep(2000);
Profile.ProfileRegButton(driver).click();
Thread.sleep(2000);

wait.until(ExpectedConditions.visibilityOf(ErrorMessages.PWlyhikeProfile(driver)));


driver.get(baseUrl);
wait.until(ExpectedConditions.visibilityOf(Homepage.Login(driver)));

driver.get(baseUrl+Url);

Profile.ProfileRegNimi(driver).sendKeys(Nimi);

Profile.ProfileRegPW(driver).sendKeys(Parool);

Profile.ProfileRegConfirmPW(driver).sendKeys(Parool);

Profile.ProfileRegUrl(driver).sendKeys(ebasobilikurl);
Thread.sleep(2000);
Profile.ProfileRegButton(driver).click();
Thread.sleep(2000);
wait.until(ExpectedConditions.visibilityOf(ErrorMessages.UrleisobiProfile(driver)));
}


  

 
  

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
@DataProvider
  
  public Object[][] ProfRegamine() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Reg");

       return (testObjArray);

      }
  
}


