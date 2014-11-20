package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserSettings {
	
	public static WebElement element = null;
	

	 public static WebElement Information(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a.hide-overflow"));
		 
		    return element;
		 
		    }
	 
	 
		
		
		

	 public static WebElement Seaded(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a[href='#tab-settings']"));
		 
		    return element;
		 
		    }

	 public static WebElement KustutaKonto(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("div.col-sm-offset-9.col-sm-3 a.pull-right"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KustutaKontoKinnita(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div#settings.modal.fade.in div.modal-dialog div.modal-content.dialog-user-settings div.modal-body.picture-upload div.tab-content div#tab-settings.tab-pane.active div#delete-account.in form input.btn.btn-danger"));
		 
		    return element;
		 
		    }
		
	
	 public static WebElement KontoEmail(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("input#a_email.form-control.input-height"));
		 
		    return element;
		 
		    }

	 
	 
	 public static WebElement EmailTeavitusedVäljas(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a[href='/disable_email']"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement EmailTeavitusedSees(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a[href='/enable_email']"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KontoVahetaPw(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a[href='#account-password-box']"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KontoVahetaPwUusPW(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div#settings.modal.fade.in div.modal-dialog div.modal-content.dialog-user-settings div.modal-body.picture-upload div.tab-content div#tab-settings.tab-pane.active form div#account-password-box.in div.form-group input#a_passwd.form-control.input-height"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KontoVahetaPwUusPWConfirm(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div#settings.modal.fade.in div.modal-dialog div.modal-content.dialog-user-settings div.modal-body.picture-upload div.tab-content div#tab-settings.tab-pane.active form div#account-password-box.in div.form-group input#a_passwd_c.form-control.input-height"));
		 
		    return element;
		 
		    }


	 
	 public static WebElement SocialNetworks(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//div/div/div[2]/table/tbody/tr/td[3]/a"));
		 
		    return element;
		 
		    }
		
		
	 public static WebElement SocialNetworksFacebook(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//div[4]/div[2]/p/a[2]"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement SocialNetworksFacebookAuthorizebutton(WebDriver driver){
		 
		    element = driver.findElement(By.name("__CONFIRM__"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement SocialNetworksTwitter(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//p[2]/a[2]"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement SocialNetworksVK(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//p[3]/a[2]"));
		 
		    return element;
		 
		    }
	 
	 
	 
		

	 public static WebElement Tagasisidekast(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//td[4]/a"));
		 
		    return element;
		 
		    }
	
		
		
		

	 public static WebElement Valipilt(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div#settings.modal.fade.in div.modal-dialog div.modal-content.dialog-user-settings div.modal-body.picture-upload div.tab-content div#tab-information.tab-pane.active form div.fileupload.fileupload-new div.form-group span.btn.btn-file.btn-default"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement ValipiltChrome(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div#settings.modal.fade.in div.modal-dialog div.modal-content.dialog-user-settings div.modal-body.picture-upload div.tab-content div#tab-information.tab-pane.active form div.fileupload.fileupload-new div.form-group span.btn.btn-file.btn-default input"));
		 
		    
		    return element;
		    }
	 

	 public static WebElement Eemaldapilt(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div#settings.modal.fade.in div.modal-dialog div.modal-content.dialog-user-settings div.modal-body.picture-upload div.tab-content div#tab-information.tab-pane.active form div.fileupload.fileupload-exists div.form-group span.btn.btn-file.btn-default span.fileupload-exists"));
		 
		    return element;
		 
		    }

		
		

	 public static WebElement SettingJagaFacebook(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("span.input-group-addon.sn-icon-dark"));
		 
		    return element;
		 
		    }

		
		

	 public static WebElement SettingJagaTwitter(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a.tweet.tooltips > i.fa.fa-twitter"));
		 
		    return element;
		 
		    }

		
		
		

	 public static WebElement SettingJagaTumblr(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("span.input-group-addon.sn-icon-dark > a.tumblr-icon > i.fa.fa-tumblr"));
		 
		    return element;
		 
		    }
			

	 public static WebElement SettingsClose(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("div.modal-footer button.btn.btn-default"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement SettingsSaveSeaded(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div#settings.modal.fade.in div.modal-dialog div.modal-content.dialog-user-settings div.modal-body.picture-upload div.tab-content div#tab-settings.tab-pane.active form div.controls button.btn.btn-primary.btn-margin.pull-right"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement DataAdded(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div#settings.modal.fade.in div.modal-dialog div.modal-content.dialog-user-settings div.modal-body.picture-upload div.alert.alert-info"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement SettingsSaveInformation(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div#settings.modal.fade.in div.modal-dialog div.modal-content.dialog-user-settings div.modal-body.picture-upload div.tab-content div#tab-information.tab-pane.active form div.controls button.btn.btn-primary.btn-margin.pull-right.picture-upload-button"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement SettingsCloseInformation(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div#settings.modal.fade.in div.modal-dialog div.modal-content.dialog-user-settings div.modal-footer button.btn.btn-default"));
		 
		    return element;
		 
		    }
	 
	 
}
