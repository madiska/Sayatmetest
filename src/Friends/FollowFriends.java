package Friends;



import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
  public void SopradeJalgimine(String Url1, String Nimi1, String Url2, String Nimi2, String Url3, String Nimi3,String Parool, String Feedback) throws InterruptedException {
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	LoggedIn.Friends(driver).click();
	  Homepage.Search(driver).sendKeys(Url2);
	   Homepage.SearchButton(driver).click();
	   wait.until(ExpectedConditions.elementToBeClickable(SearchResult.Jalgi(driver)));
	   SearchResult.Jalgi(driver).click();
		  wait.until(ExpectedConditions.elementToBeClickable(SearchResult.LopetaJalgimine(driver)));
	   driver.get(baseUrl);
	   Homepage.Search(driver).clear();
	  Homepage.Search(driver).sendKeys(Url3);
	  Homepage.SearchButton(driver).click();
	  
	  SearchResult.Jalgi(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(SearchResult.LopetaJalgimine(driver)));
	  LoggedIn.Friends(driver).click();
	  LoggedIn.FriendsSeeallOfthem(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.FriendsWhoYouFollow(driver)));
	  Assert.assertTrue(isElementPresent(By.linkText(Nimi2)));
	  Assert.assertTrue(isElementPresent(By.linkText(Nimi3)));
	
	  LoggedIn.FriendsClose(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.DropdownMenu(driver)));
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
	  
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url2);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	LoggedIn.Friends(driver).click();
	  Homepage.Search(driver).sendKeys(Url1);
	   Homepage.SearchButton(driver).click();
	   wait.until(ExpectedConditions.elementToBeClickable(SearchResult.Jalgi(driver)));
	   SearchResult.Jalgi(driver).click();
	   wait.until(ExpectedConditions.elementToBeClickable(SearchResult.LopetaJalgimine(driver)));
	   driver.get(baseUrl);
	   Homepage.Search(driver).clear();
	  Homepage.Search(driver).sendKeys(Url3);
	  Homepage.SearchButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(SearchResult.Jalgi(driver)));
	  SearchResult.Jalgi(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(SearchResult.LopetaJalgimine(driver)));
	  LoggedIn.Friends(driver).click();
	  LoggedIn.FriendsSeeallOfthem(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.FriendsWhoFollowYou(driver)));
	  Assert.assertTrue(isElementPresent(By.linkText(Nimi1)));
	  Assert.assertTrue(isElementPresent(By.linkText(Nimi3)));
	  LoggedIn.FriendsClose(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));

	
	
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url3);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	LoggedIn.Friends(driver).click();
	  Homepage.Search(driver).sendKeys(Url2);
	   Homepage.SearchButton(driver).click();
	   wait.until(ExpectedConditions.elementToBeClickable(SearchResult.Jalgi(driver)));
	   SearchResult.Jalgi(driver).click();
	   wait.until(ExpectedConditions.elementToBeClickable(SearchResult.LopetaJalgimine(driver)));
	   driver.get(baseUrl);
	   Homepage.Search(driver).clear();
	  Homepage.Search(driver).sendKeys(Url1);
	  Homepage.SearchButton(driver).click();
	  
	  wait.until(ExpectedConditions.elementToBeClickable(SearchResult.Jalgi(driver)));
	  SearchResult.Jalgi(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(SearchResult.LopetaJalgimine(driver)));
	  LoggedIn.Friends(driver).click();
	  LoggedIn.FriendsSeeallOfthem(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.FriendsWhoFollowYou(driver)));
	  Assert.assertTrue(isElementPresent(By.linkText(Nimi2)));
	  Assert.assertTrue(isElementPresent(By.linkText(Nimi1)));
	
	  LoggedIn.FriendsClose(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
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
