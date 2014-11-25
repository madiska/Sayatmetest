package Feedback;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import Utils.Constant;
import Utils.ExcelUtils;
import Utils.Browser;
public class CommentPrivateFeedback extends Browser{
	

	
	
  @Test(dataProvider = "CommentData")
  public void CommentAPrivateFeedback(String Url1, String Url2, String Parool,  String PrivateAnswer, String PrivateComment, String publiccomment, String Feedback3) throws InterruptedException {
 
	  driver.get("http://kask6iktundubkorras.sayat.me");
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.Saadetud(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.TagasiVasta(driver)));
	  LoggedIn.TagasiVasta(driver).click();

	

	  LoggedIn.TagasiVastaBox(driver).sendKeys(PrivateComment);

	  LoggedIn.TagasiVastaButton(driver).click();
	  driver.findElement(By.cssSelector("div.comment:nth-child(3) > div:nth-child(1)"));
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
	  
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url2);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	
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

