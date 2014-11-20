package Survey;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.Kysitlus;
import PageObjects.LoggedIn;
import Utils.Constant;
import Utils.ExcelUtils;

public class ShareSurvey {
	  private WebDriver driver;
	  private String baseUrl;


	
	 @BeforeMethod public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://kask6iktundubkorras.sayat.me/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	  }
	
	
  @Test(dataProvider = "Share")
  public void TestShareSurvey(String Url, String Parool, String Pealkiri, String Kysimus1,String KysimusVastus, String Kysimus2, String Kysimus2Valik1,String Kysimus2Valik2, String Kysimus2Valik3,String Kysimus3,  String Kysimus3Valik1, String Kysimus3Valik2, String Kysimus3Valik3) {
	  
	  
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();
	  Homepage.LoginUrl(driver).sendKeys(Url);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.TagasiKysitlus(driver).click();
	  LoggedIn.KysitlusHalda(driver).click();
	  
	  
	  //window handling siia panna
	  Kysitlus.KysitlusJagaFacebook(driver).click();
	  
	  
  }
  
  
  @DataProvider
  
  public Object[][] Share() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet6");

       return (testObjArray);

      }
}
