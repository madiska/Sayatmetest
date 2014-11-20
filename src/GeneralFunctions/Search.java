package GeneralFunctions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import Utils.Constant;
import Utils.ExcelUtils;
import Utils.Browser;

public class Search extends Browser {
  @Test(dataProvider="Search")
  public void TestSearch(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2, String Feedback3,String Vastus, String Email, String Social) {
	  
	  driver.get(baseUrl);
		
	  Homepage.Search(driver).sendKeys(Url1);
	  Homepage.SearchButton(driver).click();
	  Assert.assertTrue(isElementPresent(By.linkText(Url1)));
	  
	  
	  Homepage.Search(driver).sendKeys("@1£1@$@@");
	  Homepage.SearchButton(driver).click();
	  Assert.assertTrue(isElementNotPresent(By.linkText("@1£1@$@@")));
	  
	  
	  
	  
	  
  }

private boolean isElementPresent(By linkText) {
	// TODO Auto-generated method stub
	return false;
}

private boolean isElementNotPresent(By linkText) {
	// TODO Auto-generated method stub
	return false;
}
@DataProvider

public Object[][] Search() throws Exception{

     Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet5");

     return (testObjArray);

    }
}
