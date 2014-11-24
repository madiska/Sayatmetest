package Feedback;

import PageObjects.*;
import Utils.Browser;
import Utils.Constant;
import Utils.ExcelUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


@SuppressWarnings("unused")
public class feedbackinv extends Browser {
	
	

  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();



  @Test(dataProvider ="FeedbackInv")
  public void testfeedbackinv(String Url, String Parool, String tagasiside) throws Exception {
    driver.get(baseUrl);
 
    Homepage.Search(driver).sendKeys(Url);
 Homepage.SearchButton(driver).click();
    driver.findElement(By.linkText(Url)).click();
Profile.TagasisideButton(driver).click();
    for (int second = 0;; second++) {
    	if (second >= 15) Assert.fail("timeout");
    	try { if (isElementPresent(By.cssSelector("textarea.form-control.textarea-autogrow.form-error"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
      AssertJUnit.assertFalse(isElementPresent(By.cssSelector("div.well")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }


driver.get(baseUrl);
Homepage.Search(driver).sendKeys(Url);
Homepage.SearchButton(driver).click();
driver.findElement(By.linkText(Url)).click();
Profile.TagasisideTextBox(driver).click();
Profile.TagasisideTextBox(driver).sendKeys(tagasiside);
Profile.TagasisideCheckBox(driver).click();
for (int second = 0;; second++) {
	if (second >= 5) Assert.fail("timeout");
	try { if (isElementPresent(By.cssSelector("div.alert.alert-info.wrap-words"))) break; } catch (Exception e) {}
	Thread.sleep(1000);
}

Profile.TagasisideButton(driver).click();
for (int second = 0;; second++) {
	if (second >= 5) Assert.fail("timeout");
	try { if (!isElementPresent(By.cssSelector("div.well"))) break; } catch (Exception e) {}
	Thread.sleep(1000);
}


driver.get(baseUrl);
Homepage.Login(driver).click();

Homepage.LoginUrl(driver).sendKeys(Url);
Homepage.LoginPW(driver).sendKeys(Parool);
Homepage.LoginButton(driver).click();

Homepage.Search(driver).sendKeys("madiskangro");
Homepage.SearchButton(driver).click();
driver.findElement(By.linkText("madiskangro")).click();
Profile.TagasisideButton(driver).click();
for (int second = 0;; second++) {
	if (second >= 5) Assert.fail("timeout");
	try { if (isElementPresent(By.cssSelector("textarea.form-control.textarea-autogrow.form-error"))) break; } catch (Exception e) {}
	Thread.sleep(1000);
}

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
  
  public Object[][] FeedbackInv() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet3");

       return (testObjArray);

      }
}


