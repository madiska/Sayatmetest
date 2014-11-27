package Feedback;


import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Profile;
import Utils.*;

public class CommentPublicFeedbackNotLoggedin extends Browser {
	
	 
	
  @Test(dataProvider = "CommentData")
  public void TestCommentPublicFeedbackNotLoggedin(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2, String Feedback3, String Answer, String Email, String Social, String Number) throws InterruptedException {
	  
	  
	  
	  driver.get(baseUrl+Url1);
	  Profile.CommentFeedback(driver).click();

	  Assert.assertTrue(Profile.CommentSignup(driver).isDisplayed());

	  
  }
  
  
@DataProvider
  
  public Object[][] CommentData() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet5");

       return (testObjArray);

      }
}
