package PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class Homepage {
	
	public static WebElement element = null;
 //otsing box
	 public static WebElement Search(WebDriver driver){
		 
		    element = driver.findElement(By.name("q"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement SearchButton(WebDriver driver)
	 {
		 
		 element = driver.findElement(By.cssSelector("button.btn.btn-default"));
		 
		 return element;
	 }
	 
	 //language toggle ning keeled
	 public static WebElement Languagetoggle(WebDriver driver){
		 
		 element = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[1]/ul[2]/li[1]/a"));
		 
		 return element;
		 
	 }
	 public static WebElement LanguageAr(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a[href='/?lang=ar']"));
		 
		    return element;
		 
		    }
	 public static WebElement LanguageDe(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("a[href='/?lang=de']"));
		 
		    return element;
		 
		    }
	 public static WebElement LanguageEt(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("a[href='/?lang=et']"));
		 
		    return element;
		 
		    }
	 public static WebElement LanguageEn(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("a[href='/?lang=en']"));
		 
		    return element;
		 
		    }
	 public static WebElement LanguageEs(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("a[href='/?lang=es']"));
		 
		    return element;
		 
		    }
	 public static WebElement LanguageEs_la(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("a[href='/?lang=es_la']"));
		 
		    return element;
		 
		    }
	 public static WebElement LanguageFr(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("a[href='/?lang=fr']"));
		 
		    return element;
		 
		    }
	 public static WebElement LanguageNl(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("/a[href='/?lang=nl']"));
		 
		    return element;
		 
		    }
	 public static WebElement LanguageRu(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("a[href='/?lang=ru']"));
		 
		    return element;
		 
		    }
	 public static WebElement LanguageTr(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("a[href='/?lang=tr']"));
		 
		    return element;
		 
		    }

	 //login
	 public static WebElement Login(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("html body div.navbar.navbar-inverse.main-navbar.navbar-alt-color div.container div.collapse.navbar-collapse.main-navbar-collapse div.hidden-xs ul.nav.navbar-nav.pull-right li.login a.toggle"));
		 
		 return element;
		 
		 
	 }
	 
	 
 public static WebElement LoginWithFaceBook(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("html body div.front-splash.hidden-xs div.container div.col-sm-4.front-login-signup form.front-login-form.login p a.col-xs-4.fa-2x.sn-icon-light"));
		 
		 return element;
		 
		 
	 }
 
 
public static WebElement LoginWithFaceBookEmail(WebDriver driver){
	 
	 element = driver.findElement(By.id("email"));
	 
	 return element;
	 
	 
 }



public static WebElement LoginWithFaceBookPassword(WebDriver driver){
	 
	 element = driver.findElement(By.id("pass"));
	 
	 return element;
	 
	 
}

public static WebElement LoginWithFaceBookButton(WebDriver driver){
	 
	 element = driver.findElement(By.name("login"));
	 
	 return element;
	 
	 
}


public static WebElement LoginWithTwitter(WebDriver driver){
	 
	 element = driver.findElement(By.cssSelector("html body div.front-splash.hidden-xs div.container div.col-sm-4.front-login-signup form.front-login-form.login p a.col-xs-4.fa-2x.sn-icon-light i.fa.fa-twitter"));
	 
	 return element;
	 
	 
}

public static WebElement LoginWithTwitterUsername(WebDriver driver){
	 
	 element = driver.findElement(By.cssSelector("html body.oauth.write.tfw.en.logged-out.noloki.js div#bd div.auth form#oauth_form fieldset.sign-in div.row.user input#username_or_email.text"));
	 
	 return element;
	 
	 
}

public static WebElement LoginWithTwitterPassword(WebDriver driver){
	 
	 element = driver.findElement(By.cssSelector("html body.oauth.write.tfw.en.logged-out.noloki.js div#bd div.auth form#oauth_form fieldset.sign-in div.row.password input#password.password.text"));
	 
	 return element;
	 
	 
}

public static WebElement LoginWithTwitterAuthorizeButton(WebDriver driver){
	 
	 element = driver.findElement(By.id("allow"));
	 
	 return element;
	 
	 
}

public static WebElement LoginWithVK(WebDriver driver){
	 
	 element = driver.findElement(By.cssSelector("html body div.front-splash.hidden-xs div.container div.col-sm-4.front-login-signup form.front-signup-form.login p a.col-xs-4.fa-2x.sn-icon-light"));
	 
	 return element;
	 
	 
}


public static WebElement LoginWithVKEmail(WebDriver driver){
	 
	 element = driver.findElement(By.name("email"));
	 
	 return element;
	 
	 
}

public static WebElement LoginWithVKPassword(WebDriver driver){
	 
	 element = driver.findElement(By.name("pass"));
	 
	 return element;
	 
	 
}
	 
public static WebElement LoginWithVKButton(WebDriver driver){
	 
	 element = driver.findElement(By.cssSelector("html body.VK1.oauth_page div#sub_cont form#login_submit table#container.container tbody tr td div#box_cont div#box.box.box_login div.info div.popup_login_btn button#install_allow.flat_button.popup_login_btn.button_big"));
	 
	 return element;
	 
	 
}
	 //url for login
	 
	 public static WebElement LoginUrl(WebDriver driver)
	 {
		 
		 element = driver.findElement(By.id("fburl_d"));
		 
		 return element;
	 }
	 
	 //login password
	 public static WebElement LoginPW(WebDriver driver)
	 {
		 
		 element = driver.findElement(By.id("login_passwd_d"));
		 
		 return element;
	 }
	 
	 //login button
	 
	 public static WebElement LoginButton(WebDriver driver)
	 {
		 
		 element = driver.findElement(By.cssSelector("button.btn.btn-primary.btn-block"));
		 
		 return element;
	 }
	 
	 //registration
	 
	 //nimi
	 public static WebElement RegNimi(WebDriver driver)
	 {
		 
		 element = driver.findElement(By.id("full_name_d"));
		 
		 return element;
	 }
	 
	 //password
	 public static WebElement RegPassword(WebDriver driver)
	 {
		 
		 element = driver.findElement(By.id("passwd_d"));
		 
		 return element;
	 }
	 
	 //confirm password
	 public static WebElement RegCPassword(WebDriver driver)
	 {
		 
		 element = driver.findElement(By.id("passwd_c_d"));
		 
		 return element;
	 }
	 
	 
	 //registration url
	 public static WebElement RegUrl(WebDriver driver)
	 {
		 
		 element = driver.findElement(By.id("feedback_url_d"));
		 
		 return element;
	 }
	 
	 
	 //registration button
	 
	 public static WebElement RegButton(WebDriver driver)
	 {
		 
		 element = driver.findElement(By.cssSelector("input.btn.btn-primary.btn-block"));
		 
		 return element;
	 }
	 
	 public static WebElement RegFacebook(WebDriver driver)
	 {
		 		 
		 element = driver.findElement(By.cssSelector("i.fa.fa-facebook"));
		 
		 return element; 
		 
	 }
	 
	 public static WebElement RegFacebookUrl(WebDriver driver)
	 {
		 		 
		 element = driver.findElement(By.id("feedback_url"));
		 
		 return element; 
		 
	 }
	 
	 
	 public static WebElement RegFacebookButton(WebDriver driver)
	 {
		 		 
		 element = driver.findElement(By.cssSelector("html body div.container div.row div.col-sm-6 div form.sn-signup-form.login p input.btn.btn-primary"));
		 
		 return element; 
		 
	 }
	 
	 public static WebElement RegTwitter(WebDriver driver)
	 {
		 		 
		 element = driver.findElement(By.cssSelector("i.fa.fa-twitter"));
		 
		 return element; 
		 
	 }
	 
	 public static WebElement RegVK(WebDriver driver)
	 {
		 		 
		 element = driver.findElement(By.cssSelector("i.fa.fa-vk"));
		 
		 return element; 
		 
	 }
}
