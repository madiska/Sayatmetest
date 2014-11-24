package Survey;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.TagasiKysitlus(driver).click();
	  LoggedIn.KysitlusHalda(driver).click();
	  LoggedIn.UusKysitlusWhenExisting(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Kysitlus.KysitlusPealkiri(driver)));
	  Kysitlus.KysitlusPealkiri(driver).sendKeys(Pealkiri);
	  Kysitlus.KysitlusSalvesta(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Kysitlus.KysitlusKysimusPealkiri(driver)));
	  Kysitlus.KysitlusKysimusPealkiri(driver).sendKeys(Kysimus1);
	  Kysitlus.KysitlusKysimusSalvesta(driver).click();
	  
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  Kysitlus.KysitlusLisaUusKysimus(driver).click();
	  
	  wait.until(ExpectedConditions.elementToBeClickable(Kysitlus.KysitlusKysimusPealkiri(driver)));
	  Kysitlus.KysitlusKysimusPealkiri(driver).sendKeys(Kysimus2);
	  Kysitlus.Kysitlusyksvariant(driver).click();
	  Kysitlus.KysitlusyksVariantEsimeneBox(driver).sendKeys(Kysimus2Valik1);
	  Kysitlus.KysitlusyksVariantTeineBox(driver).click();
	  Kysitlus.KysitlusyksVariantTeineBox(driver).sendKeys(Kysimus2Valik2);
	
	  Kysitlus.KysitlusLisaValik(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Kysitlus.KysitlusyksVariantiKolmasBox(driver)));
	  Kysitlus.KysitlusyksVariantiKolmasBox(driver).click();
	  Kysitlus.KysitlusyksVariantiKolmasBox(driver).sendKeys(Kysimus2Valik3);
	  Kysitlus.KysitlusKysimusSalvesta(driver).click();
	  
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  Kysitlus.KysitlusLisaUusKysimus(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Kysitlus.KysitlusKysimusPealkiri(driver)));
	  
	  Kysitlus.KysitlusKysimusPealkiri(driver).sendKeys(Kysimus3);
	  Kysitlus.KysitlusMituVarianti(driver).click();
	  Kysitlus.KysitlusMituVariantiEsimeneBox(driver).sendKeys(Kysimus3Valik1);
	  Kysitlus.KysitlusMituVariantiTeineBox(driver).click();
	  Kysitlus.KysitlusMituVariantiTeineBox(driver).sendKeys(Kysimus3Valik2);
	  Kysitlus.KysitlusLisaValik(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Kysitlus.KysitlusMituVariantiKolmasBox(driver)));
	  Kysitlus.KysitlusMituVariantiKolmasBox(driver).click();
	  Kysitlus.KysitlusMituVariantiKolmasBox(driver).sendKeys(Kysimus3Valik3);
	  Kysitlus.KysitlusKysimusSalvesta(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	 Kysitlus.KysitlusAvalda(driver).click();
	 
	 Alert alert = driver.switchTo().alert();
	 alert.accept();
	 Thread.sleep(3000);
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