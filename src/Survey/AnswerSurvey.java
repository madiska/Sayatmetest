package Survey;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Kysitlus;
import PageObjects.Profile;
import Utils.*;

public class AnswerSurvey extends Browser{
	
	
	
  @Test(dataProvider = "AnsweringSurvey")
  public void TestSurveyAnswer(String Url, String Parool, String Pealkiri, String Kysimus1,String KysimusVastus, String Kysimus2, String Kysimus2Valik1,String Kysimus2Valik2, String Kysimus2Valik3,String Kysimus3,  String Kysimus3Valik1, String Kysimus3Valik2, String Kysimus3Valik3) throws InterruptedException {
	  
	  driver.get(baseUrl+Url);
	 Profile.ProfileKysitlused(driver).click();
	  driver.findElement(By.partialLinkText(Pealkiri)).click();
	  
	  Kysitlus.KysitlusVastaTextbox(driver).sendKeys(KysimusVastus);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//label[contains(.,'"+Kysimus2Valik1+"')]/input")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//label[contains(.,'"+Kysimus3Valik1+"')]/input")).click();
	  driver.findElement(By.xpath("//label[contains(.,'"+Kysimus3Valik2+"')]/input")).click();
	  
	  Kysitlus.KysitlusVastusSalvesta(driver).click();
	  
  }
  
  
  @DataProvider
  
  public Object[][] AnsweringSurvey() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet6");

       return (testObjArray);

      }
}
