package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingUuno {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeMethod
public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://lawtime-test.mooncascade.net/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testProovitest3() throws Exception {
    driver.get(baseUrl + "/LawTime.Web/#/login");
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | _blank | 30000]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | oauth2relay731566847 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | pmh273276943 | 30000]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
    driver.findElement(By.xpath("(//a[contains(text(),'activity1,')])[2]")).click();
    driver.findElement(By.id("textAreaComment")).clear();
    driver.findElement(By.id("textAreaComment")).sendKeys("activity1, test");
    driver.findElement(By.cssSelector("div.pull-right > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("div.headerUser.ng-binding")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
  }

  @AfterMethod
public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      Assert.fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
