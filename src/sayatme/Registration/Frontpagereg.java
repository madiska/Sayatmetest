package sayatme.Registration;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.Assert;




import org.testng.AssertJUnit;
import org.openqa.selenium.*;
import org.testng.annotations.DataProvider;

import PageObjects.ErrorMessages;
import PageObjects.Homepage;
import Utils.Constant;
import Utils.ExcelUtils;
import Utils.Browser;

 


public class Frontpagereg extends Browser  {
	
	



  @Test(dataProvider = "Regamine")
  public void testFrontpagereg(String Nimi, String Url, String Parool, String Passmismatch, String passlyhike, String Urlkorras, String ebasobilikurl, String tagasiside, String otsi ) throws Exception {
  
 driver.get(baseUrl);
  Homepage.RegNimi(driver).sendKeys(Nimi);
 
Homepage.RegPassword(driver).sendKeys(Parool);
 Homepage.RegCPassword(driver).sendKeys(Parool);
   Homepage.RegUrl(driver).sendKeys(Url);
   Thread.sleep(2000);
  Assert.assertTrue(ErrorMessages.Urleiolesaadaval(driver).isDisplayed());


Homepage.RegButton(driver).click();
Thread.sleep(2000);
Assert.assertTrue(ErrorMessages.Urlonveotud(driver).isDisplayed());
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


Assert.assertFalse(isElementPresent(By.linkText(Nimi)));

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    
    
driver.get(baseUrl);
    
    
   Homepage.RegNimi(driver).sendKeys(Nimi);

  Homepage.RegPassword(driver).sendKeys(Passmismatch);
    
   Homepage.RegCPassword(driver).sendKeys(Parool);
 
   Homepage.RegUrl(driver).sendKeys(Urlkorras);
   Thread.sleep(2000);
   Homepage.RegButton(driver).click();
   Thread.sleep(2000);
   
   Assert.assertTrue(ErrorMessages.PWmismatch(driver).isDisplayed());

   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
   

   Assert.assertFalse(isElementPresent(By.linkText(Nimi)));

   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   
   driver.get(baseUrl);
  
   
   Homepage.RegNimi(driver).sendKeys(Nimi);

   Homepage.RegPassword(driver).sendKeys(passlyhike);

  Homepage.RegCPassword(driver).sendKeys(passlyhike);

 Homepage.RegUrl(driver).sendKeys(Urlkorras);
 Thread.sleep(2000);
  Homepage.RegButton(driver).click();
  Thread.sleep(2000);
 
  Assert.assertTrue(ErrorMessages.PWlyhike(driver).isDisplayed());
 
  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  

  Assert.assertFalse(isElementPresent(By.linkText(Nimi)));

  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    
    
    
    
    
    
  driver.get(baseUrl);
Homepage.RegNimi(driver).sendKeys(Nimi);
Homepage.RegPassword(driver).sendKeys(Parool);
Homepage.RegCPassword(driver).sendKeys(Parool);
Homepage.RegUrl(driver).sendKeys(ebasobilikurl);
Thread.sleep(2000);
Homepage.RegButton(driver).click();
Thread.sleep(2000);

Assert.assertTrue(ErrorMessages.Urleisobi(driver).isDisplayed());


driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
 

Assert.assertFalse(isElementPresent(By.linkText(Nimi)));

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
  
  public Object[][] Regamine() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Reg");

       return (testObjArray);

      }
  
}
