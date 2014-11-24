package Friends;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import Utils.Browser;
import Utils.Constant;
import Utils.ExcelUtils;

public class UnfollowFriends extends Browser{
	

	
	
	
  @Test(dataProvider = "UnFollowFriends")
  public void StopFollowing(String Url1, String Nimi1, String Url2, String Nimi2, String Url3, String Nimi3,String Parool, String Feedback) throws InterruptedException {
	 
	  
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url1);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.FriendsSeeallOfthem(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.FriendsWhoFollowYou(driver)));
	  LoggedIn.FriendsWhoYouFollowStop(driver).click();
	 Thread.sleep(4000);
	 LoggedIn.FriendsWhoYouFollowStop(driver).click();
	 Thread.sleep(4000);
	
	  LoggedIn.FriendsClose(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.Friends(driver).click();

	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
	  
	  
	  
	  
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url2);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.FriendsSeeallOfthem(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.FriendsWhoFollowYou(driver)));
	  LoggedIn.FriendsWhoYouFollowStop(driver).click();
	 Thread.sleep(4000);
	 LoggedIn.FriendsWhoYouFollowStop(driver).click();
	 Thread.sleep(4000);
	
	  LoggedIn.FriendsClose(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.Friends(driver).click();

	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Homepage.Login(driver)));
	  
	  
	  
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();	
	  Homepage.LoginUrl(driver).sendKeys(Url3);
	  Homepage.LoginPW(driver).sendKeys(Parool);
	  Homepage.LoginButton(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
	  LoggedIn.FriendsSeeallOfthem(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.FriendsWhoFollowYou(driver)));
	  LoggedIn.FriendsWhoYouFollowStop(driver).click();
	 Thread.sleep(4000);
	 LoggedIn.FriendsWhoYouFollowStop(driver).click();
	 Thread.sleep(4000);

	  LoggedIn.FriendsClose(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
		  LoggedIn.Friends(driver).click();
	
	  LoggedIn.DropdownMenu(driver).click();
	  LoggedIn.Logout(driver).click();
	  
	  
  }
  
@DataProvider
  
  public Object[][] UnFollowFriends() throws Exception{

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
