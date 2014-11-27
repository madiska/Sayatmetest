package Basetest;

import org.testng.annotations.Test;

import Utils.Browser;
import PageObjects.*;

public class NewTest extends Browser{
  @Test
  public void f() {
	  driver.get(baseUrl);
	  Homepage.Login(driver).click();
	  Homepage.LoginUrl(driver).sendKeys();
  }
}
