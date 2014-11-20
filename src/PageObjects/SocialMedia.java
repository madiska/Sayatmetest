package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SocialMedia {

	
	
	public static WebElement element = null;
	
	
	
	public static WebElement FacebookLoginEmail(WebDriver driver){
		 
		 element = driver.findElement(By.id("email"));
		 
		 return element;
	 }

public static WebElement FacebookLoginPW(WebDriver driver){
	 
	 element = driver.findElement(By.id("pass"));
	 
	 return element;
}

public static WebElement FacebookLoginButton(WebDriver driver){
	 
	 element = driver.findElement(By.name("login"));
	 
	 return element;
}

public static WebElement FacebookLoginButtonFromWebsite(WebDriver driver){
	 
	 element = driver.findElement(By.id("loginbutton"));
	 
	 return element;
}

public static WebElement FacebookLoginPublish(WebDriver driver){
	 
	 element = driver.findElement(By.name("publish"));
	 
	 return element;
}



public static WebElement FacebookLoginAccept(WebDriver driver){
	 
	 element = driver.findElement(By.name("__CONFIRM__"));
	 
	 return element;
}


public static WebElement FacebookLoginCancel(WebDriver driver){
	 
	 element = driver.findElement(By.name("cancel"));
	 
	 return element;
}


public static WebElement TwitterLoginEmail(WebDriver driver){
	 
	 element = driver.findElement(By.id("username_or_email"));
	 
	 return element;
}


public static WebElement TwitterLoginPw(WebDriver driver){

element = driver.findElement(By.id("password"));

return element;
}



public static WebElement TwitterLoginButton(WebDriver driver){

element = driver.findElement(By.cssSelector("#update-form > div.ft > fieldset > input.button.selected.submit"));

return element;
}

public static WebElement TwitterAutohorise(WebDriver driver){

element = driver.findElement(By.id("allow"));

return element;
}


public static WebElement TwitterTweetButton(WebDriver driver){

element = driver.findElement(By.cssSelector("html body.tfw.en.logged-in.nofooter.noloki.js div#bd form#update-form div.ft fieldset.submit input.button.selected.submit"));

return element;
}

public static WebElement TumblrSwitchToLogin(WebDriver driver){
	 
	 element = driver.findElement(By.cssSelector("#account_actions_logged_out_dashboard > div.l-header-container.l-header-container--refresh.l-header-container--transparent > div > div.right > a.signup_link.login-button"));
	 
	 return element;
}


public static WebElement TumblrLoginFromwebsite(WebDriver driver){
	 
	 element = driver.findElement(By.id("signup_forms_submit"));
	 
	 return element;
}



public static WebElement TumblrLoginEmail(WebDriver driver){
	 
	 element = driver.findElement(By.id("signup_email"));
	 
	 return element;
}

public static WebElement TumblrLoginPW(WebDriver driver){
	 
	 element = driver.findElement(By.id("signup_password"));
	 
	 return element;
}

public static WebElement TumblrLoginButton(WebDriver driver){
	 
	 element = driver.findElement(By.id("signup_forms_submit"));
	 
	 return element;
}

public static WebElement TumblrCreatePost(WebDriver driver){

element = driver.findElement(By.cssSelector("html.default-context.en_US body#bookmarklet_index div#post_controls input"));

return element;
}



}
