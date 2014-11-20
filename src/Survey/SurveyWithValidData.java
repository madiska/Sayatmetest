package Survey;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.ErrorMessages;
import PageObjects.Homepage;
import PageObjects.Kysitlus;
import PageObjects.LoggedIn;
import Utils.Browser;
import Utils.Constant;
import Utils.ExcelUtils;

public class SurveyWithValidData extends Browser {
	
	
	
  @Test(dataProvider = "SurveywithValid")
  public void TestSurveywithvalidData(String Url, String Parool, String Pealkiri, String Kysimus1,String KysimusVastus, String Kysimus2, String Kysimus2Valik1,String Kysimus2Valik2, String Kysimus2Valik3,String Kysimus3,  String Kysimus3Valik1, String Kysimus3Valik2, String Kysimus3Valik3) throws InterruptedException {
	  
	  
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();
	  Homepage.LoginUrl(driver).sendKeys(Url);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.TagasiKysitlus(driver).click();
	  LoggedIn.KysitlusHalda(driver).click();
	  LoggedIn.UusKysitlusWhenExisting(driver).click();
	  Thread.sleep(2000);
	  Kysitlus.KysitlusPealkiri(driver).sendKeys(Pealkiri);
	  Kysitlus.KysitlusSalvesta(driver).click();
	  Thread.sleep(2000);
	  Kysitlus.KysitlusKysimusPealkiri(driver).sendKeys(Kysimus1);
	  Kysitlus.KysitlusKysimusSalvesta(driver).click();
	  
	  Thread.sleep(2000);
	  Kysitlus.KysitlusLisaUusKysimus(driver).click();
	  
	  Thread.sleep(2000);
	  Kysitlus.KysitlusKysimusPealkiri(driver).sendKeys(Kysimus2);
	  Kysitlus.Kysitlusyksvariant(driver).click();
	  Kysitlus.KysitlusyksVariantEsimeneBox(driver).sendKeys(Kysimus2Valik1);
	  Kysitlus.KysitlusyksVariantTeineBox(driver).click();
	  Kysitlus.KysitlusyksVariantTeineBox(driver).sendKeys(Kysimus2Valik2);
	
	  Kysitlus.KysitlusLisaValik(driver).click();
	  Thread.sleep(1000);
	  Kysitlus.KysitlusyksVariantiKolmasBox(driver).click();
	  Kysitlus.KysitlusyksVariantiKolmasBox(driver).sendKeys(Kysimus2Valik3);
	  Kysitlus.KysitlusKysimusSalvesta(driver).click();
	  
	  Thread.sleep(2000);
 Kysitlus.KysitlusLisaUusKysimus(driver).click();
 Thread.sleep(2000);
	  
	  Kysitlus.KysitlusKysimusPealkiri(driver).sendKeys(Kysimus3);
	  Kysitlus.KysitlusMituVarianti(driver).click();
	  Kysitlus.KysitlusMituVariantiEsimeneBox(driver).sendKeys(Kysimus3Valik1);
	  Kysitlus.KysitlusMituVariantiTeineBox(driver).click();
	  Kysitlus.KysitlusMituVariantiTeineBox(driver).sendKeys(Kysimus3Valik2);
	  Kysitlus.KysitlusLisaValik(driver).click();
	  Thread.sleep(1000);
	  Kysitlus.KysitlusMituVariantiKolmasBox(driver).click();
	  Kysitlus.KysitlusMituVariantiKolmasBox(driver).sendKeys(Kysimus3Valik3);
	  Kysitlus.KysitlusKysimusSalvesta(driver).click();
	  Thread.sleep(2000);
	 Kysitlus.KysitlusAvalda(driver).click();
	 
	 Alert alert = driver.switchTo().alert();
	 alert.accept();
	 Thread.sleep(2000);
	 Assert.assertTrue(Kysitlus.Avaldatud(driver).isDisplayed());
	 LoggedIn.DropdownMenu(driver).click();
	 LoggedIn.Logout(driver).click();
  }
	  
	 
	  
	  
	  
	  @DataProvider
	  
	  public Object[][] SurveywithValid() throws Exception{

	       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet6");

	       return (testObjArray);

	      }
	  
	  
	  
  
}