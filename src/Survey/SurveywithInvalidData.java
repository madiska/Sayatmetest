package Survey;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.Browser;
import Utils.Constant;
import Utils.ExcelUtils;
import PageObjects.*;

public class SurveywithInvalidData extends Browser{
	

	 
	  
	
  @Test(dataProvider = "Surveywithinvalid")
  public void TestSurveywithInvalid(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2,String Answer, String Feedback3, String Email, String Social, String Number) throws InterruptedException {
	  
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.TagasiKysitlus(driver).click();
	  LoggedIn.UusKysitlus(driver).click();
	  Thread.sleep(2000);
	  Kysitlus.KysitlusPealkiri(driver).sendKeys();
	  Kysitlus.KysitlusSalvesta(driver).click();
	  Thread.sleep(2000);
	  Assert.assertTrue(ErrorMessages.KysitlusPealkiriError(driver).isDisplayed());
	  Kysitlus.KysitlusTyhista(driver).click();
	  Thread.sleep(2000);
	  LoggedIn.UusKysitlusFollowuppage(driver).click();
	  Thread.sleep(2000);
	  Kysitlus.KysitlusPealkiri(driver).sendKeys("Pealkiri");
	  Kysitlus.KysitlusSalvesta(driver).click();
	  Kysitlus.Kysitlusyksvariant(driver).click();
	
	  Kysitlus.KysitlusyksVariantEsimeneBox(driver).sendKeys();
	  
	  Kysitlus.KysitlusKysimusSalvesta(driver).click();
	  Thread.sleep(2000);
	  Assert.assertTrue(ErrorMessages.KysitlusKysimusError(driver).isDisplayed());
	  Assert.assertTrue(ErrorMessages.KysitlusValikError(driver).isDisplayed());
	  Kysitlus.KysitlusKysimusTyhista(driver).click();
	  Thread.sleep(2000);
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  
	 
	
	  
	
	  
	  
  }





  
@DataProvider
  
  public Object[][] Surveywithinvalid() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet5");

       return (testObjArray);

      }
  
}
