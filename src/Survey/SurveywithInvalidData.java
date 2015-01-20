package Survey;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.Browser;
import Utils.Constant;
import Utils.ExcelUtils;
import PageObjects.*;


public class SurveywithInvalidData extends Browser{
	

	 
	  
	
  @Test(dataProvider = "Surveywithinvalid")
  public void SurveywithInvData(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2,String Answer, String Feedback3, String Email, String Social, String Number) throws InterruptedException {
	  
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.TagasiKysitlus(driver).click();
	  LoggedIn.UusKysitlus(driver).click();
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	 if (driver.findElements(By.cssSelector("html body div.container div.row div.col-md-8 div.row.survey-page-title div.col-xs-7 button.btn.btn-primary.pull-right")).size() == 1) {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 LoggedIn.UusKysitlusWhenExisting(driver).click();
		 }
	 else {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	  wait.until(ExpectedConditions.elementToBeClickable(Kysitlus.KysitlusPealkiri(driver)));
	  Kysitlus.KysitlusPealkiri(driver).sendKeys();
	  Kysitlus.KysitlusSalvesta(driver).click();
		  wait.until(ExpectedConditions.visibilityOf(ErrorMessages.KysitlusPealkiriError(driver)));
	  Kysitlus.KysitlusTyhista(driver).click();

	 
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.UusKysitlusFollowuppage(driver)));
	  LoggedIn.UusKysitlusFollowuppage(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Kysitlus.KysitlusPealkiri(driver)));
	  Kysitlus.KysitlusPealkiri(driver).sendKeys("Pealkiri");
	  Kysitlus.KysitlusSalvesta(driver).click();
	  
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(Kysitlus.Kysitlusyksvariant(driver)));
	  Kysitlus.Kysitlusyksvariant(driver).click();
	
	  Kysitlus.KysitlusyksVariantEsimeneBox(driver).sendKeys();
	  
	  Kysitlus.KysitlusKysimusSalvesta(driver).click();
	  wait.until(ExpectedConditions.visibilityOf(ErrorMessages.KysitlusKysimusError(driver)));
	  wait.until(ExpectedConditions.visibilityOf(ErrorMessages.KysitlusValikError(driver)));

	  
	  Kysitlus.KysitlusKysimusTyhista(driver).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  wait.until(ExpectedConditions.visibilityOf(Homepage.Login(driver)));
	  
  
	  
	
	  
	  
  }





  
@DataProvider
  
  public Object[][] Surveywithinvalid() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet5");

       return (testObjArray);

      }
  
}
