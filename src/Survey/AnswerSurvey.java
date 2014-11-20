package Survey;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Küsitlus;
import PageObjects.LoggedIn;
import PageObjects.Profile;
import Utils.*;

public class AnswerSurvey extends Browser{
	
	
	
  @Test(dataProvider = "AnsweringSurvey")
  public void TestSurveyAnswer(String Url, String Parool, String Pealkiri, String Küsimus1,String KüsimusVastus, String Küsimus2, String Küsimus2Valik1,String Küsimus2Valik2, String Küsimus2Valik3,String Küsimus3,  String Küsimus3Valik1, String Küsimus3Valik2, String Küsimus3Valik3) throws InterruptedException {
	  
	  driver.get(baseUrl+Url);
	 Profile.ProfileKüsitlused(driver).click();
	  driver.findElement(By.partialLinkText(Pealkiri)).click();
	  
	  Küsitlus.KüsitlusVastaTextbox(driver).sendKeys(KüsimusVastus);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//label[contains(.,'"+Küsimus2Valik1+"')]/input")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//label[contains(.,'"+Küsimus3Valik1+"')]/input")).click();
	  driver.findElement(By.xpath("//label[contains(.,'"+Küsimus3Valik2+"')]/input")).click();
	  
	  Küsitlus.KüsitlusVastusSalvesta(driver).click();
	  
	  
  }
  
  
  @DataProvider
  
  public Object[][] AnsweringSurvey() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet6");

       return (testObjArray);

      }
}
