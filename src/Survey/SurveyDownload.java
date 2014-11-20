package Survey;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.Küsitlus;
import PageObjects.LoggedIn;
import Utils.*;

public class SurveyDownload extends Browser {
	

	
	
  @Test(dataProvider = "SurveyDownloadData")
  public void TestSurveyDownload(String Url, String Parool, String Pealkiri, String Küsimus1,String KüsimusVastus, String Küsimus2, String Küsimus2Valik1,String Küsimus2Valik2, String Küsimus2Valik3,String Küsimus3,  String Küsimus3Valik1, String Küsimus3Valik2, String Küsimus3Valik3) throws InterruptedException {
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();
	  Homepage.LoginUrl(driver).sendKeys(Url);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.TagasiKysitlus(driver).click();
	  driver.findElement(By.linkText(Pealkiri)).click();
	  Küsitlus.KüsitlusTulemusedLaeAlla(driver).click();
	  Thread.sleep(20000);
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
  }
  
  
  @DataProvider
  
  public Object[][] SurveyDownloadData() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet6");

       return (testObjArray);

      }
}
