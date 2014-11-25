package GeneralFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.UserSettings;
import Utils.Constant;
import Utils.ExcelUtils;
import Utils.Browser;

public class DeleteUser extends Browser {

	
  @Test(dataProvider = "Delete")
  public void TestDeleteUser(String Url,String  Parool, String Nimi, String valePw) throws InterruptedException {
	  
	  
	  driver.get(baseUrl);
		
	  Homepage.Login(driver).click();
	 Homepage.LoginUrl(driver).sendKeys(Url);
	 Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	 wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.DropdownMenu(driver)));
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Seaded(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(UserSettings.Seaded(driver)));
	 UserSettings.Seaded(driver).click();
	 UserSettings.KustutaKonto(driver).click();
	 UserSettings.KustutaKontoKinnita(driver).click();
	  
	  Homepage.Search(driver).sendKeys(Url);
	 Homepage.SearchButton(driver).click();
	 Assert.assertFalse(isElementPresent(By.linkText(Url)));
	  
	  
	  
	

	  
  }
private boolean isElementPresent(By linkText) {
	// TODO Auto-generated method stub
	return false;
}


@DataProvider
  
  public Object[][] Delete() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet2");

       return (testObjArray);

      }
}
