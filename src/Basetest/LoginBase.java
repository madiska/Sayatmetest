package Basetest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import Utils.*;


public class LoginBase {




	       public static void ExecuteLogin(WebDriver driver){
	 
	   Homepage.Login(driver).click(); 
	 
	   Homepage.LoginUrl(driver).sendKeys("testuser_1");
	 
	   Homepage.LoginPW(driver).sendKeys("Test@123");
	 
	   Homepage.LoginButton(driver).click();
	 
	   }
	 
}
