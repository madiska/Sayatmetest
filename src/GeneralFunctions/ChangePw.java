package GeneralFunctions;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.UserSettings;
import Utils.Browser;
import Utils.Constant;
import Utils.ExcelUtils;

public class ChangePw extends Browser{
	
	


	
  @Test (dataProvider="PWChange")
  public void TestChangePw(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2, String Feedback3,String Answer, String Email, String Social, String Number) throws InterruptedException {
	  
	  
	  driver.get(baseUrl);
		
	  Homepage.Login(driver).click();
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Seaded(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
	  UserSettings.Seaded(driver).click();
	  UserSettings.KontoVahetaPw(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.KontoVahetaPwUusPW(driver)));
	  UserSettings.KontoVahetaPwUusPW(driver).sendKeys("UusParool");
	  UserSettings.KontoVahetaPwUusPWConfirm(driver).sendKeys("UusParool");
	  Thread.sleep(1000);
	  UserSettings.SettingsSaveSeaded(driver).click();
	
	  Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());
	  UserSettings.SettingsCloseInformation(driver).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));

	  LoggedIn.DropdownMenu(driver).click();
	
	  LoggedIn.Logout(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
	  
	  //Vahetan Tagasi
	  
	  driver.get(baseUrl);
		
	  Homepage.Login(driver).click();
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys("UusParool");
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Seaded(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
	  UserSettings.Seaded(driver).click();
	  UserSettings.KontoVahetaPw(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.KontoVahetaPwUusPW(driver)));
	  UserSettings.KontoVahetaPwUusPW(driver).sendKeys(Parool);
	  UserSettings.KontoVahetaPwUusPWConfirm(driver).sendKeys(Parool);
	  Thread.sleep(1000);
	  UserSettings.SettingsSaveSeaded(driver).click();
	
	  Assert.assertTrue(UserSettings.DataAdded(driver).isDisplayed());
	  UserSettings.SettingsCloseInformation(driver).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	
	  LoggedIn.DropdownMenu(driver).click();
	
	  LoggedIn.Logout(driver).click();
	  
	  
	  
	  
	  
	  
	  
	  

  }
  
  @DataProvider

  public Object[][] PWChange() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet5");

       return (testObjArray);

      }
  
}
