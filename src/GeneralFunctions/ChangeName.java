package GeneralFunctions;


import org.openqa.selenium.By;
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

public class ChangeName extends Browser{
	
	


	
  @Test (dataProvider="Namechange")
  public void TestChangePw(String Url, String Password, String Nimi, String ValePW) throws InterruptedException {
	  
	  
	  driver.get(baseUrl);
		
	  Homepage.Login(driver).click();
	  Homepage.LoginUrl(driver).sendKeys(Url);
	  Homepage.LoginPW(driver).sendKeys(Password);
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Seaded(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
	  UserSettings.KontoNimi(driver).clear();
	  UserSettings.KontoNimi(driver).sendKeys("Konto Testi");
	 
	  UserSettings.SettingsSaveInformation(driver).click();
	  if(brauser == "chrome") {Thread.sleep(3000);}
	  else {}
	  wait.until(ExpectedConditions.visibilityOf(UserSettings.DataAdded(driver)));
	  UserSettings.SettingsCloseInformation(driver).click();
	
	  Thread.sleep(3000);

	  Assert.assertTrue(driver.findElement(By.linkText("Konto Testi")).isDisplayed());
	  
	  LoggedIn.DropdownMenu(driver).click();
	
	  LoggedIn.Seaded(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
	  UserSettings.KontoNimi(driver).clear();
	  UserSettings.KontoNimi(driver).sendKeys(Nimi);
	  UserSettings.SettingsSaveInformation(driver).click();
	  if(brauser == "chrome") {Thread.sleep(3000);}
	  else {}
	  wait.until(ExpectedConditions.visibilityOf(UserSettings.DataAdded(driver)));
	  UserSettings.SettingsCloseInformation(driver).click();
	
	  Thread.sleep(3000);
	  Assert.assertTrue(driver.findElement(By.linkText(Nimi)).isDisplayed());
	  
	  LoggedIn.DropdownMenu(driver).click();
		
	  LoggedIn.Logout(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

  }
  
  @DataProvider

  public Object[][] Namechange() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet2");

       return (testObjArray);

      }
  
}
