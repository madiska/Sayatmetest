package Login;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.testng.AssertJUnit;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import Utils.Browser;
import Utils.Constant;
import Utils.ExcelUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;




@SuppressWarnings("unused")

public class LoginVal extends Browser {
	
	
	 
  private boolean acceptNextAlert = true;



  @Test(dataProvider = "Login")

  public void testLoginVal(String Url, String Parool, String Nimi, String ValePw)throws Exception {
    

	  driver.get(baseUrl);
Homepage.Login(driver).click();
Homepage.LoginUrl(driver).sendKeys(Url);
Homepage.LoginPW(driver).sendKeys(Parool);
Homepage.LoginButton(driver).click();

AssertJUnit.assertTrue(isElementPresent(By.linkText(Nimi)));
  



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
  
  public Object[][] Login() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet2");

       return (testObjArray);

      }
  
}
