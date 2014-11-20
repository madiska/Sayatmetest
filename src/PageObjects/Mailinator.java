package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mailinator {

	
	public static WebElement element = null;
	

	 public static WebElement MailinatorTextBox(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.full-height div.landing div.clouds div.container div.row div.span7 div.well.mainlead div.input-append input#inboxfield.span3"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement MailinatorButton(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.full-height div.landing div.clouds div.container div.row div.span7 div.well.mainlead div.input-append btn.btn.btn-success"));
		 
		    return element;
		 
		    }
	 public static WebElement MailinatorEmail(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html#ng-app.ng-app.ng-scope body div.full-height div.app-content div.container div.content.inbox div.row-fluid div.span9 div#maildirpane div.row-fluid div.inbox-content div#InboxCtrl.mail-list.ng-scope ul#mailcontainer.unstyled li.row-fluid.message.ng-scope a"));
		 
		    return element;
		 
		    }
	 public static WebElement MailinatorEmailDelete(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html#ng-app.ng-app.ng-scope body div.full-height div.app-content div.container div.content.inbox div.row-fluid div.span9 div#showmailpane div.row-fluid div.inbox-content div#mailshowdivhead div.mail-list div.header div.row-fluid.controls div.btn-group button.btn"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement Emailkinnitusonnestus(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container p.alert.alert-info"));
		 
		    return element;
		 
		    }
	 
}
