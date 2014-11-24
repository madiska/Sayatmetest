package Survey;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
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
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.TagasiKysitlus(driver).click();
	  LoggedIn.UusKysitlus(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Kysitlus.KysitlusPealkiri(driver)));
	  Kysitlus.KysitlusPealkiri(driver).sendKeys();
	  Kysitlus.KysitlusSalvesta(driver).click();
	  Thread.sleep(2000);
	  Assert.assertTrue(ErrorMessages.KysitlusPealkiriError(driver).isDisplayed());
	  Kysitlus.KysitlusTyhista(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.UusKysitlusFollowuppage(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Kysitlus.KysitlusPealkiri(driver)));
	  Kysitlus.KysitlusPealkiri(driver).sendKeys("Pealkiri");
	  Kysitlus.KysitlusSalvesta(driver).click();
	  
	  wait.until(ExpectedConditions.elementToBeClickable(Kysitlus.Kysitlusyksvariant(driver)));
	  Kysitlus.Kysitlusyksvariant(driver).click();
	
	  Kysitlus.KysitlusyksVariantEsimeneBox(driver).sendKeys();
	  
	  Kysitlus.KysitlusKysimusSalvesta(driver).click();
	  Thread.sleep(2000);
	  Assert.assertTrue(ErrorMessages.KysitlusKysimusError(driver).isDisplayed());
	  Assert.assertTrue(ErrorMessages.KysitlusValikError(driver).isDisplayed());
	  Kysitlus.KysitlusKysimusTyhista(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  
	 
	
	  
	
	  
	  
  }





  
@DataProvider
  
  public Object[][] Surveywithinvalid() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet5");

       return (testObjArray);

      }
  
}
