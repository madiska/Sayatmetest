package Survey;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.Kysitlus;
import PageObjects.LoggedIn;
import Utils.*;

public class SurveyDownload extends Browser {
	

	
	
  @Test(dataProvider = "SurveyDownloadData")
  public void TestSurveyDownload(String Url, String Parool, String Pealkiri, String Kysimus1,String KysimusVastus, String Kysimus2, String Kysimus2Valik1,String Kysimus2Valik2, String Kysimus2Valik3,String Kysimus3,  String Kysimus3Valik1, String Kysimus3Valik2, String Kysimus3Valik3) throws InterruptedException {
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();
	  Homepage.LoginUrl(driver).sendKeys(Url);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.TagasiKysitlus(driver).click();
	  driver.findElement(By.linkText(Pealkiri)).click();
	  Kysitlus.KysitlusTulemusedLaeAlla(driver).click();
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
