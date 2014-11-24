package Screenshot;

import java.io.File;

import Utils.Browser;
import Utils.Constant;

import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;

import PageObjects.Mailinator;
import Utils.ExcelUtils;

public class EmailInboxScreenshot extends Browser{
	

	
	
  @Test(dataProvider = "Emaillinking")
  public void TakeScreenshot(String Url1, String Url2, String Url3, String Parool, String Feedback1, String Feedback2, String Feedback3,String Answer, String Email, String Social, String jarjekord) throws IOException, InterruptedException {
	  
	  
	 
	  driver.get("http://mailinator.com");
	  Mailinator.MailinatorTextBox(driver).sendKeys(Email);
	  Mailinator.MailinatorButton(driver).click();
	  Thread.sleep(3000);
	  
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// Now you can do whatever you need to do with it, for example copy somewhere
	FileUtils.copyFile(scrFile, new File("c:\\tmp\\"+Url1+".png"));
  }
  
@DataProvider
  
  public Object[][] Emaillinking() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(Constant.ExceliAsukoht,"Sheet5");

       return (testObjArray);

      }
}
