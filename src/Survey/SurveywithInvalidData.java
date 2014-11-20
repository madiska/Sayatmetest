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
	  K�sitlus.K�sitlusPealkiri(driver).sendKeys();
	  K�sitlus.K�sitlusSalvesta(driver).click();
	  Thread.sleep(2000);
	  Assert.assertTrue(ErrorMessages.K�sitlusPealkiriError(driver).isDisplayed());
	  K�sitlus.K�sitlusT�hista(driver).click();
	  Thread.sleep(2000);
	  LoggedIn.UusKysitlusFollowuppage(driver).click();
	  Thread.sleep(2000);
	  K�sitlus.K�sitlusPealkiri(driver).sendKeys("Pealkiri");
	  K�sitlus.K�sitlusSalvesta(driver).click();
	  K�sitlus.K�sitlus�ksvariant(driver).click();
	
	  K�sitlus.K�sitlus�ksVariantEsimeneBox(driver).sendKeys();
	  
	  K�sitlus.K�sitlusK�simusSalvesta(driver).click();
	  Thread.sleep(2000);
	  Assert.assertTrue(ErrorMessages.K�sitlusK�simusError(driver).isDisplayed());
	  Assert.assertTrue(ErrorMessages.K�sitlusValikError(driver).isDisplayed());
	  K�sitlus.K�sitlusK�simusT�hista(driver).click();
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
