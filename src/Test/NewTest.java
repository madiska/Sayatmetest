
package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import Utils.*;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.*;

public class NewTest  {

	  private WebDriver driver;
	  private String baseUrl;


	
	 @BeforeMethod public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://kask6iktundubkorras.sayat.me/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	 }
  @Test(dataProvider = "Annamejuurdeyhe")
  public void testTextreplace(String Url1, String Nimi1, String Url2, String Nimi2, String Url3, String Nimi3,String Parool, String Feedback ) throws Exception {
	
	

	  driver.get("http://mailinator.com");

	  Mailinator.MailinatorTextBox(driver).sendKeys("selentest1");
	  Mailinator.MailinatorButton(driver).click();
	  Mailinator.MailinatorEmail(driver).click();
	  Thread.sleep(1000);
	  driver.switchTo().frame("rendermail");
String Emailconfirmationlink = driver.findElement(By.partialLinkText("sayat.me/claim")).getText();
	   String uuslink = "http://kask6iktundubkorras.sayat.me"+Emailconfirmationlink.substring(15);
	   System.out.println(uuslink);

	    }
	  
		
	
	  
      
	  
  
  
  
  
  

 
@DataProvider
  
  public Object[][] Annamejuurdeyhe() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\Madis\\workspace\\testautomation\\src\\testdata\\reg.xlsx","Sheet4");

       return (testObjArray);

      }
}



 
