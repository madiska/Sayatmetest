package Feedback;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoggedIn;
import Utils.Constant;
import Utils.ExcelUtils;
import Utils.Browser;

public class AnswerPrivateFeedback extends Browser{
	
	 
	  
	  
	

		  @Test(dataProvider = "CommentData")
		  public void GivePrivateFeedbackanswer(String Url1, String Url2,String Parool, String PrivateAnswer, String PrivateComment, String publiccomment, String Feedback3) throws InterruptedException {
		 
		  
			  driver.get(baseUrl);
			  Homepage.Login(driver).click();	
			  Homepage.LoginUrl(driver).sendKeys(Url2);
			  Homepage.LoginPW(driver).sendKeys(Parool);
			  Homepage.LoginButton(driver).click();
			  wait.until(ExpectedConditions.elementToBeClickable(LoggedIn.Friends(driver)));
			  LoggedIn.TagasiVasta(driver).click();
			  LoggedIn.TagasiVastaBox(driver).sendKeys(PrivateAnswer);
			  LoggedIn.TagasiVastaButton(driver).click();
			
			  Assert.assertEquals(PrivateAnswer, driver.findElement(By.cssSelector("div.comment.col-xs-offset-1 div")).getText());
			
				 Assert.assertTrue(driver.getPageSource().contains(Feedback3));  
			  LoggedIn.DropdownMenu(driver).click();
			  LoggedIn.Logout(driver).click();
			  wait.until(ExpectedConditions.elementToBeClickable(Homepage.RegButton(driver)));
			  
			  driver.get(baseUrl+Url2);
			  
			  Assert.assertFalse(driver.getPageSource().contains(PrivateAnswer));
		  }
		  
		  
		  
		  
		  
		  
		  
		@DataProvider
		  
		  public Object[][] CommentData() throws Exception{

		       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet8");

		       return (testObjArray);

		      }
		}
