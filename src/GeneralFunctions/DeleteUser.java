package GeneralFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.UserSettings;
import Utils.Constant;
import Utils.ExcelUtils;
import Utils.Browser;

public class DeleteUser {
	  private WebDriver driver;
	  private String baseUrl;


	
	 @BeforeMethod public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://kask6iktundubkorras.sayat.me/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	  }
	
	
  @Test(dataProvider = "Delete")
  public void TestDeleteUser(String Url,String  Parool, String Nimi, String valePw) throws InterruptedException {
	  
	  
	  driver.get(baseUrl);
		
	  Homepage.Login(driver).click();
	 Homepage.LoginUrl(driver).sendKeys(Url);
	 Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  LoggedIn.DropdownMenu(driver).click();
	  Thread.sleep(5000);
	  LoggedIn.Seaded(driver).click();
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

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet4");

       return (testObjArray);

      }
}
