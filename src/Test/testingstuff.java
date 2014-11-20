package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Basetest.LoginBase;
import Login.LoginVal;
import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.Mailinator;
import Utils.*;


public class testingstuff {
	  private WebDriver driver;
	  private String baseUrl;


	
	 @BeforeMethod public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://kask6iktundubkorras.sayat.me/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	 }
  @Test(dataProvider = "Annamejuurdeyhe")
  public void f(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2, String Feedback3,String Answer, String Email, String Social, String Number) throws InterruptedException {
	
	  
		 driver.get(baseUrl);
			LoginBase.ExecuteLogin(driver);
		
		  LoggedIn.Epost(driver).sendKeys(Email);
		  LoggedIn.Epostkinnitus(driver).click();
		  Thread.sleep(10000);
		  driver.get("http://mailinator.com");
		  Mailinator.MailinatorTextBox(driver).sendKeys(Email);
		  Mailinator.MailinatorButton(driver).click();
		  Thread.sleep(3000);
		  Mailinator.MailinatorEmail(driver).click();
		  driver.switchTo().frame("rendermail");
		  String Emailconfirmationlink = driver.findElement(By.partialLinkText("sayat.me/claim")).getText();
		   String uuslink = baseUrl+Emailconfirmationlink.substring(16);
		
		   driver.get(uuslink);
		Assert.assertTrue(Mailinator.Emailkinnitusõnnestus(driver).isDisplayed());
		
		LoggedIn.DropdownMenu(driver).click();
		LoggedIn.Logout(driver).click();
	  
  }
  @DataProvider

  public Object[][] Annamejuurdeyhe() throws Exception{

   Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\Madis\\workspace\\testautomation\\src\\testdata\\Testin.xlsx","Sheet5");

   return (testObjArray);

  }
}
