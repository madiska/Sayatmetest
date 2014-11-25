
package Utils;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;










import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeMethod;

public class Browser {

protected  WebDriver driver;
protected String baseUrl;
protected String  brauser;
protected WebDriverWait wait;



@BeforeMethod   

@Parameters("browser")
public void beforeTest(String browser) {
       if (browser.equalsIgnoreCase("firefoxkorras")) {
              driver = new FirefoxDriver();
              baseUrl = "http://kask6iktundubkorras.sayat.me/";
              driver.get(baseUrl);
              driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
              driver.manage().timeouts().setScriptTimeout(120, TimeUnit.SECONDS);
           
                 driver.manage().window().setPosition(new Point(0,0));
              driver.manage().window().setSize(new Dimension(1600,1000));
              wait = new WebDriverWait(driver, 25, 100);
         
                brauser = "firefox";
       

}
else if(browser.equalsIgnoreCase("firefoxbeta")) {
    driver = new FirefoxDriver();
    baseUrl = "http://betastaging.sayat.me/";
    driver.get(baseUrl);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().timeouts().setScriptTimeout(120, TimeUnit.SECONDS);
 
       driver.manage().window().setPosition(new Point(0,0));
    driver.manage().window().setSize(new Dimension(1600,1000));
    wait = new WebDriverWait(driver, 25);
      brauser = "firefox";
      
}
 else if (browser.equalsIgnoreCase("firefoxlive")) {
          driver = new FirefoxDriver();
          baseUrl = "http://sayat.me/";
          driver.get(baseUrl);
          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          driver.manage().timeouts().setScriptTimeout(120, TimeUnit.SECONDS);
       
             driver.manage().window().setPosition(new Point(0,0));
          driver.manage().window().setSize(new Dimension(1600,1000));
          wait = new WebDriverWait(driver, 25);
            brauser = "firefox";
   

 }

 else if (browser.equalsIgnoreCase("chromekorras")) 
{
	 
	 System.setProperty("webdriver.chrome.driver",
	            Constant.ChromeDriver);
	driver = new ChromeDriver();
	baseUrl = "http://kask6iktundubkorras.sayat.me/";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().setScriptTimeout(120, TimeUnit.SECONDS);
	driver.manage().window().setPosition(new Point(0,0));
	driver.manage().window().setSize(new Dimension(1600,1000));
	  wait = new WebDriverWait(driver, 25, 1000);
	brauser = "chrome";
	 
}
       
 else if (browser.equalsIgnoreCase("chromebeta")) {
	 
    System.setProperty("webdriver.chrome.driver",
            Constant.ChromeDriver);
driver = new ChromeDriver();
baseUrl = "http://betastaging.sayat.me/";
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().timeouts().setScriptTimeout(120, TimeUnit.SECONDS);
driver.manage().window().setPosition(new Point(0,0));
driver.manage().window().setSize(new Dimension(1600,1000));
wait = new WebDriverWait(driver, 25);
brauser = "chrome";

}
 else if (browser.equalsIgnoreCase("chromelive")) {
	 
	    System.setProperty("webdriver.chrome.driver",
	            Constant.ChromeDriver);
	driver = new ChromeDriver();
	baseUrl ="http://sayat.me/" ;
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().setScriptTimeout(120, TimeUnit.SECONDS);
	driver.manage().window().setPosition(new Point(0,0));
	driver.manage().window().setSize(new Dimension(1600,1000));
	wait = new WebDriverWait(driver, 25);
	brauser = "chrome";

	}
       
 else if (browser.equalsIgnoreCase("IEkorras")) {
	 
	    System.setProperty("webdriver.ie.driver",
	            Constant.IEDriver);
		 DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
	
	
		 caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
	driver = new InternetExplorerDriver(caps);
	baseUrl ="http://kask6iktundubkorras.sayat.me/";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().setScriptTimeout(120, TimeUnit.SECONDS);
	wait = new WebDriverWait(driver, 25);

	brauser = "IE";

	}
       
 else if (browser.equalsIgnoreCase("IEBeta")) {
	 
	    System.setProperty("webdriver.ie.driver",
	            Constant.IEDriver);
		 DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		 caps.setCapability("ignoreZoomSetting", true);
	driver = new InternetExplorerDriver(caps);
	baseUrl ="http://betastaging.sayat.me/";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().setScriptTimeout(120, TimeUnit.SECONDS);
	wait = new WebDriverWait(driver, 25);

	brauser = "IE";

	}
       
 else if (browser.equalsIgnoreCase("IELive")) {

	    System.setProperty("webdriver.ie.driver",
	            Constant.IEDriver);
		 DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		 caps.setCapability("ignoreZoomSetting", true);
	driver = new InternetExplorerDriver(caps);
	baseUrl = "http://sayat.me/";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().setScriptTimeout(120, TimeUnit.SECONDS);
	wait = new WebDriverWait(driver, 25);

	brauser = "IE";

	}
       
       
}
@AfterMethod 

public void closeBrowser()
{try{
driver.wait(15000);
}
catch(Exception e){}
driver.close();
driver.quit();
}
}