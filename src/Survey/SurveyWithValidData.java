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
import PageObjects.Küsitlus;
import PageObjects.LoggedIn;
import Utils.Browser;
import Utils.Constant;
import Utils.ExcelUtils;

public class SurveyWithValidData extends Browser {
	
	
	
  @Test(dataProvider = "SurveywithValid")
  public void TestSurveywithvalidData(String Url, String Parool, String Pealkiri, String Küsimus1,String KüsimusVastus, String Küsimus2, String Küsimus2Valik1,String Küsimus2Valik2, String Küsimus2Valik3,String Küsimus3,  String Küsimus3Valik1, String Küsimus3Valik2, String Küsimus3Valik3) throws InterruptedException {
	  
	  
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();
	  Homepage.LoginUrl(driver).sendKeys(Url);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.TagasiKysitlus(driver).click();
	  LoggedIn.KysitlusHalda(driver).click();
	  LoggedIn.UusKysitlusWhenExisting(driver).click();
	  Thread.sleep(2000);
	  Küsitlus.KüsitlusPealkiri(driver).sendKeys(Pealkiri);
	  Küsitlus.KüsitlusSalvesta(driver).click();
	  Thread.sleep(2000);
	  Küsitlus.KüsitlusKüsimusPealkiri(driver).sendKeys(Küsimus1);
	  Küsitlus.KüsitlusKüsimusSalvesta(driver).click();
	  
	  Thread.sleep(2000);
	  Küsitlus.KüsitlusLisaUusKüsimus(driver).click();
	  
	  Thread.sleep(2000);
	  Küsitlus.KüsitlusKüsimusPealkiri(driver).sendKeys(Küsimus2);
	  Küsitlus.KüsitlusÜksvariant(driver).click();
	  Küsitlus.KüsitlusÜksVariantEsimeneBox(driver).sendKeys(Küsimus2Valik1);
	  Küsitlus.KüsitlusÜksVariantTeineBox(driver).click();
	  Küsitlus.KüsitlusÜksVariantTeineBox(driver).sendKeys(Küsimus2Valik2);
	
	  Küsitlus.KüsitlusLisaValik(driver).click();
	  Thread.sleep(1000);
	  Küsitlus.KüsitlusÜksVariantiKolmasBox(driver).click();
	  Küsitlus.KüsitlusÜksVariantiKolmasBox(driver).sendKeys(Küsimus2Valik3);
	  Küsitlus.KüsitlusKüsimusSalvesta(driver).click();
	  
	  Thread.sleep(2000);
 Küsitlus.KüsitlusLisaUusKüsimus(driver).click();
 Thread.sleep(2000);
	  
	  Küsitlus.KüsitlusKüsimusPealkiri(driver).sendKeys(Küsimus3);
	  Küsitlus.KüsitlusMituVarianti(driver).click();
	  Küsitlus.KüsitlusMituVariantiEsimeneBox(driver).sendKeys(Küsimus3Valik1);
	  Küsitlus.KüsitlusMituVariantiTeineBox(driver).click();
	  Küsitlus.KüsitlusMituVariantiTeineBox(driver).sendKeys(Küsimus3Valik2);
	  Küsitlus.KüsitlusLisaValik(driver).click();
	  Thread.sleep(1000);
	  Küsitlus.KüsitlusMituVariantiKolmasBox(driver).click();
	  Küsitlus.KüsitlusMituVariantiKolmasBox(driver).sendKeys(Küsimus3Valik3);
	  Küsitlus.KüsitlusKüsimusSalvesta(driver).click();
	  Thread.sleep(2000);
	 Küsitlus.KüsitlusAvalda(driver).click();
	 
	 Alert alert = driver.switchTo().alert();
	 alert.accept();
	 Thread.sleep(2000);
	 Assert.assertTrue(Küsitlus.Avaldatud(driver).isDisplayed());
	 LoggedIn.DropdownMenu(driver).click();
	 LoggedIn.Logout(driver).click();
  }
	  
	 
	  
	  
	  
	  @DataProvider
	  
	  public Object[][] SurveywithValid() throws Exception{

	       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet6");

	       return (testObjArray);

	      }
	  
	  
	  
  
}