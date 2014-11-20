package Feedback;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import Utils.Constant;
import Utils.ExcelUtils;
import Utils.Browser;
public class CommentPrivateFeedback extends Browser{
	

	
	
  @Test(dataProvider = "CommentData")
  public void Test(String Url1, String Url2, String Parool,  String PrivateAnswer, String PrivateComment, String publiccomment, String Feedback3) throws InterruptedException {
 
	  driver.get("http://kask6iktundubkorras.sayat.me");
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.Saadetud(driver).click();
	  LoggedIn.TagasiVasta(driver).click();
	  Thread.sleep(5600);
	  LoggedIn.TagasiVastaBox(driver).sendKeys(PrivateComment);
	  Thread.sleep(2000);
	  LoggedIn.TagasiVastaButton(driver).click();
	  Thread.sleep(4000);
	  Assert.assertTrue(driver.getPageSource().contains(PrivateComment));
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url2);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  Thread.sleep(1000);
	  Assert.assertTrue(driver.getPageSource().contains(PrivateComment));
	  
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  
  
  
  
  }
  
  
  
  
@DataProvider
  
  public Object[][] CommentData() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet8");

       return (testObjArray);

      }
}

