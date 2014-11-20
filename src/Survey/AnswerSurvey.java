package Survey;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.K�sitlus;
import PageObjects.LoggedIn;
import PageObjects.Profile;
import Utils.*;

public class AnswerSurvey extends Browser{
	
	
	
  @Test(dataProvider = "AnsweringSurvey")
  public void TestSurveyAnswer(String Url, String Parool, String Pealkiri, String K�simus1,String K�simusVastus, String K�simus2, String K�simus2Valik1,String K�simus2Valik2, String K�simus2Valik3,String K�simus3,  String K�simus3Valik1, String K�simus3Valik2, String K�simus3Valik3) throws InterruptedException {
	  
	  driver.get(baseUrl+Url);
	 Profile.ProfileK�sitlused(driver).click();
	  driver.findElement(By.partialLinkText(Pealkiri)).click();
	  
	  K�sitlus.K�sitlusVastaTextbox(driver).sendKeys(K�simusVastus);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//label[contains(.,'"+K�simus2Valik1+"')]/input")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//label[contains(.,'"+K�simus3Valik1+"')]/input")).click();
	  driver.findElement(By.xpath("//label[contains(.,'"+K�simus3Valik2+"')]/input")).click();
	  
	  K�sitlus.K�sitlusVastusSalvesta(driver).click();
	  
	  
  }
  
  
  @DataProvider
  
  public Object[][] AnsweringSurvey() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet6");

       return (testObjArray);

      }
}
