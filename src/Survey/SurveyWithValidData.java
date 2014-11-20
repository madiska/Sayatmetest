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
import PageObjects.K�sitlus;
import PageObjects.LoggedIn;
import Utils.Browser;
import Utils.Constant;
import Utils.ExcelUtils;

public class SurveyWithValidData extends Browser {
	
	
	
  @Test(dataProvider = "SurveywithValid")
  public void TestSurveywithvalidData(String Url, String Parool, String Pealkiri, String K�simus1,String K�simusVastus, String K�simus2, String K�simus2Valik1,String K�simus2Valik2, String K�simus2Valik3,String K�simus3,  String K�simus3Valik1, String K�simus3Valik2, String K�simus3Valik3) throws InterruptedException {
	  
	  
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();
	  Homepage.LoginUrl(driver).sendKeys(Url);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.TagasiKysitlus(driver).click();
	  LoggedIn.KysitlusHalda(driver).click();
	  LoggedIn.UusKysitlusWhenExisting(driver).click();
	  Thread.sleep(2000);
	  K�sitlus.K�sitlusPealkiri(driver).sendKeys(Pealkiri);
	  K�sitlus.K�sitlusSalvesta(driver).click();
	  Thread.sleep(2000);
	  K�sitlus.K�sitlusK�simusPealkiri(driver).sendKeys(K�simus1);
	  K�sitlus.K�sitlusK�simusSalvesta(driver).click();
	  
	  Thread.sleep(2000);
	  K�sitlus.K�sitlusLisaUusK�simus(driver).click();
	  
	  Thread.sleep(2000);
	  K�sitlus.K�sitlusK�simusPealkiri(driver).sendKeys(K�simus2);
	  K�sitlus.K�sitlus�ksvariant(driver).click();
	  K�sitlus.K�sitlus�ksVariantEsimeneBox(driver).sendKeys(K�simus2Valik1);
	  K�sitlus.K�sitlus�ksVariantTeineBox(driver).click();
	  K�sitlus.K�sitlus�ksVariantTeineBox(driver).sendKeys(K�simus2Valik2);
	
	  K�sitlus.K�sitlusLisaValik(driver).click();
	  Thread.sleep(1000);
	  K�sitlus.K�sitlus�ksVariantiKolmasBox(driver).click();
	  K�sitlus.K�sitlus�ksVariantiKolmasBox(driver).sendKeys(K�simus2Valik3);
	  K�sitlus.K�sitlusK�simusSalvesta(driver).click();
	  
	  Thread.sleep(2000);
 K�sitlus.K�sitlusLisaUusK�simus(driver).click();
 Thread.sleep(2000);
	  
	  K�sitlus.K�sitlusK�simusPealkiri(driver).sendKeys(K�simus3);
	  K�sitlus.K�sitlusMituVarianti(driver).click();
	  K�sitlus.K�sitlusMituVariantiEsimeneBox(driver).sendKeys(K�simus3Valik1);
	  K�sitlus.K�sitlusMituVariantiTeineBox(driver).click();
	  K�sitlus.K�sitlusMituVariantiTeineBox(driver).sendKeys(K�simus3Valik2);
	  K�sitlus.K�sitlusLisaValik(driver).click();
	  Thread.sleep(1000);
	  K�sitlus.K�sitlusMituVariantiKolmasBox(driver).click();
	  K�sitlus.K�sitlusMituVariantiKolmasBox(driver).sendKeys(K�simus3Valik3);
	  K�sitlus.K�sitlusK�simusSalvesta(driver).click();
	  Thread.sleep(2000);
	 K�sitlus.K�sitlusAvalda(driver).click();
	 
	 Alert alert = driver.switchTo().alert();
	 alert.accept();
	 Thread.sleep(2000);
	 Assert.assertTrue(K�sitlus.Avaldatud(driver).isDisplayed());
	 LoggedIn.DropdownMenu(driver).click();
	 LoggedIn.Logout(driver).click();
  }
	  
	 
	  
	  
	  
	  @DataProvider
	  
	  public Object[][] SurveywithValid() throws Exception{

	       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet6");

	       return (testObjArray);

	      }
	  
	  
	  
  
}