package Login;


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
  
    AssertJUnit.assertFalse(isElementPresent(By.linkText(Nimi)));
    
    
    
    driver.get(baseUrl);
    Homepage.Login(driver).click();
   
     

     Homepage.LoginUrl(driver).sendKeys(Url);
     Homepage.LoginButton(driver).click();
    
      AssertJUnit.assertFalse(isElementPresent(By.linkText(Nimi)));


  

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
