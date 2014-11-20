package Friends;



import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.Constant;
import Utils.ExcelUtils;
import Utils.Browser;
import PageObjects.Homepage;
import PageObjects.LoggedIn;
import PageObjects.SearchResult;



public class FollowFriends extends Browser {
	
	
	
  @Test(dataProvider = "FollowFriendsValues")
  public void SõpradeJälgimine(String Url1, String Nimi1, String Url2, String Nimi2, String Url3, String Nimi3,String Parool, String Feedback) throws InterruptedException {
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	LoggedIn.Friends(driver).click();
	  Homepage.Search(driver).sendKeys(Url2);
	   Homepage.SearchButton(driver).click();
	   SearchResult.Jälgi(driver).click();
	   Thread.sleep(3000);
	   driver.get(baseUrl+Url1);
	   Homepage.Search(driver).clear();
	  Homepage.Search(driver).sendKeys(Url3);
	  Homepage.SearchButton(driver).click();
	  
	  SearchResult.Jälgi(driver).click();
	  Thread.sleep(3000);
	  LoggedIn.Friends(driver).click();
	  LoggedIn.FriendsSeeallOfthem(driver).click();
	   Thread.sleep(3000);
	  Assert.assertTrue(isElementPresent(By.linkText(Nimi2)));
	  Assert.assertTrue(isElementPresent(By.linkText(Nimi3)));
	
	  LoggedIn.FriendsClose(driver).click();
	   Thread.sleep(3000);
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  
	  
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url2);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	LoggedIn.Friends(driver).click();
	  Homepage.Search(driver).sendKeys(Url1);
	   Homepage.SearchButton(driver).click();
	   Thread.sleep(3000);
	   SearchResult.Jälgi(driver).click();
	   Thread.sleep(3000);
	   driver.get(baseUrl+Url1);
	   Homepage.Search(driver).clear();
	  Homepage.Search(driver).sendKeys(Url3);
	  Homepage.SearchButton(driver).click();
	   Thread.sleep(3000);
	  SearchResult.Jälgi(driver).click();
	  Thread.sleep(3000);
	  LoggedIn.Friends(driver).click();
	  LoggedIn.FriendsSeeallOfthem(driver).click();
	   Thread.sleep(3000);
	  Assert.assertTrue(isElementPresent(By.linkText(Nimi1)));
	  Assert.assertTrue(isElementPresent(By.linkText(Nimi3)));
	  LoggedIn.FriendsClose(driver).click();
	   Thread.sleep(3000);
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();

	
	
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url3);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	LoggedIn.Friends(driver).click();
	  Homepage.Search(driver).sendKeys(Url2);
	   Homepage.SearchButton(driver).click();
	   Thread.sleep(3000);
	   SearchResult.Jälgi(driver).click();
	   Thread.sleep(3000);
	   driver.get(baseUrl+Url1);
	   Homepage.Search(driver).clear();
	  Homepage.Search(driver).sendKeys(Url1);
	  Homepage.SearchButton(driver).click();
	  
	  Thread.sleep(3000);
	  SearchResult.Jälgi(driver).click();
	  Thread.sleep(3000);
	  LoggedIn.Friends(driver).click();
	  LoggedIn.FriendsSeeallOfthem(driver).click();
	   Thread.sleep(3000);
	  Assert.assertTrue(isElementPresent(By.linkText(Nimi2)));
	  Assert.assertTrue(isElementPresent(By.linkText(Nimi1)));
	
	  LoggedIn.FriendsClose(driver).click();
	   Thread.sleep(3000);
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  
	  
  }

@DataProvider
  
  public Object[][] FollowFriendsValues() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet4");

       return (testObjArray);

      }
private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
}
