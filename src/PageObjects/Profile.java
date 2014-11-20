package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Profile {
	
	public static WebElement element = null;
	
	
	

	 public static WebElement TagasisideTextBox(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("textarea[name='write']"));
		 
		    return element;
		 
		    }
	
	
	
	 public static WebElement TagasisideButton(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("input.btn.btn-primary.btn-block"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement TagasisideCheckBox(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("#enable_reply"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement ProfileRegNimi(WebDriver driver){
		 
		    element = driver.findElement(By.id("fn_r"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement ProfileRegFacebook(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.col-sm-4 div#signup_right p a.col-xs-4.sn-icon-dark i.fa.fa-facebook.fa-2x"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement ProfileRegTwitter(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.col-sm-4 div#signup_right p a.col-xs-4.sn-icon-dark i.fa.fa-twitter.fa-2x"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement ProfileRegVK(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.col-sm-4 div#signup_right p a.col-xs-4.sn-icon-dark i.fa.fa-vk.fa-2x"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement ProfileRegPW(WebDriver driver){
		 
		    element = driver.findElement(By.id("passwd"));
		 
		    return element;
		 
		    }
	 public static WebElement ProfileRegConfirmPW(WebDriver driver){
		 
		    element = driver.findElement(By.id("passwd_c"));
		 
		    return element;
		 
		    }
	 public static WebElement ProfileRegUrl(WebDriver driver){
		 
		    element = driver.findElement(By.id("feedback_url"));
		 
		    return element;
		 
		    }
	 public static WebElement ProfileRegButton(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("#signup_right div form input.btn.btn-primary.btn-block"));
		 
		    return element;
		 
		    }
	 
	 
	 
	 
	 public static WebElement ProfileFeedbackRegNimi(WebDriver driver){
		 
		    element = driver.findElement(By.id("full_name_r"));
		 
		    return element;
		 
		    }
	 public static WebElement ProfileFeedbackRegPW(WebDriver driver){
		 
		    element = driver.findElement(By.id("passwd2"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement ProfileFeedbackRegConfirmPW(WebDriver driver){
		 
		    element = driver.findElement(By.id("passwd_c_2"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement ProfileFeedbackRegUrl(WebDriver driver){
		 
		    element = driver.findElement(By.id("feedback_url2"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement ProfileFeedBackRegButton(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("input.btn.btn-primary.btn-block"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement ProfileKüsitlused(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.col-sm-8 table#user-tabs.feed-published-navs.no-outline.feed-settings-navs.feed-navs tbody tr td.settings-tab.settings-tab-surveys a.survey-tab"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement CommentFeedback(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("button.reply.btn.btn-xs.btn-link"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement CommentFeedbackTextBox(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.col-sm-8 div.feed-items.feedback-article div.comment-form textarea.textarea-autogrow.form-control"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement CommentFeedbackTextBoxButton(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.col-sm-8 div.feed-items.feedback-article div.comment-form button.btn.btn-sm.btn-primary"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement CommentSignup(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("p.signup-to-comment"));
		 
		    return element;
		 
		    }
	 

}
