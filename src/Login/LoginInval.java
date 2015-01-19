package Login;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.*;
import org.testng.annotations.DataProvider;

import PageObjects.Homepage;
import Utils.Browser;
import Utils.Constant;
import Utils.ExcelUtils;


public class LoginInval extends Browser {

 
  
  
 

 

  @Test(dataProvider = "LoginInvalid")
  public void testLoginInval(String Url, String Password, String Nimi, String ValePW) throws Exception {

	  driver.get(baseUrl);
  Homepage.Login(driver).click();
 
 

   Homepage.LoginUrl(driver).sendKeys(Url);

   Homepage.LoginPW(driver).sendKeys(ValePW);
   Homepage.LoginButton(driver).click();
  
   
   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    AssertJUnit.assertFalse(isElementPresent(By.linkText(Nimi)));
    
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    driver.get(baseUrl);
    Homepage.Login(driver).click();
   
     

     Homepage.LoginUrl(driver).sendKeys(Url);
     Homepage.LoginButton(driver).click();
     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
      AssertJUnit.assertFalse(isElementPresent(By.linkText(Nimi)));
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
  
  public Object[][] LoginInvalid() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet2");

       return (testObjArray);

      }
}
