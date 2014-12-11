package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ErrorMessages {
	
	
	public static WebElement element = null;
	
		 public static WebElement Urleiolesaadaval(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("div.alert.alert-danger.red.check_url"));
			 
			    return element;
			 
			    }
		 
		 public static WebElement Urlonveotud(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("div.alert.alert-danger.form-alert.check_url"));
			 
			    return element;
			 
			    }
		 
		 public static WebElement Urleisobi(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("div.alert.alert-danger.form-alert.check_url"));
			 
			    return element;
			 
			    }
		 
		 public static WebElement UrleisobiProfile(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("div.alert.alert-danger.form-alert.check_url"));
			 
			    return element;
			 
			    }
		 
		 public static WebElement PWmismatch(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("div.alert.alert-danger.pw-match-alert.check_url"));
			 
			    return element;
			 
			    }
		 
		 public static WebElement PWmismatchProfile(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("div#signup_right div form div.alert.alert-danger.pw-match-alert.check_url"));
			 
			    return element;
			 
			    }
		 
		 public static WebElement PWlyhike(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("div.alert.alert-danger.pw-length-alert.check_url"));
			 
			    return element;
			   
			    }
		 
		 public static WebElement PWlyhikeProfile(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("div#signup_right div form div.alert.alert-danger.pw-length-alert.check_url"));
			 
			    return element;
			   
			    }

		 
		 public static WebElement FeedbackPWmismatch(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("div.alert.alert-danger.pw-match-alert.col-xs-12.check_url"));
			 
			    return element;
			 
			    }
		 
		 public static WebElement FeedbackPWPikkus(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("div.alert.alert-danger.pw-length-alert.col-xs-12.check_url"));
			 
			    return element;
			 
			    }
		 
		 
		 public static WebElement FeedbackUrlonveotud(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("div.alert.alert-danger.col-xs-12.form-alert.check_url"));
			 
			    return element;
			 
			    }
		 
		 public static WebElement FeedbackUrleisobiclick(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("div.alert.alert-danger.col-xs-12.form-alert.check_url"));
			 
			    return element;
			 
			    }
		
		 public static WebElement Uuendakysimust(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("p.alert.alert-danger.post_alert"));
			 
			    return element;
			 
			    }
		 
		 public static WebElement EmailKinnitus(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("html body div.container div.col-sm-8 p.alert.alert-danger"));
			 
			    return element;
			 
			    }
		 
		 public static WebElement KysitlusPealkiriError(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_new_survey.modal.fade.in div.modal-dialog div.modal-content div.modal-body form#form_new_survey.form-horizontal div.form-group.has-error div.controls.col-lg-6 span.help-block.survey_error_message"));
			 
			    return element;
			 
			    }
		 
		 
		 public static WebElement KysitlusKysimusError(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div.form-group.has-error div.col-sm-6.controls span.help-block.survey_error_message"));
			 
			    return element;
			 
			    }
		 
		 public static WebElement KysitlusValikError(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div#container_edit_question_options_group.form-group.has-error div.col-sm-6.controls span.help-block.survey_error_message.margin-top-5"));
			 
			    return element;
			 
			    }
		 
		 
		 public static WebElement ProfilePicLiigaSuur(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("div.modal-content.dialog-user-settings div.modal-body.picture-upload div.alert.alert-danger.file-size-alert"));
			 
			    return element;
			 
			    }
		 
		 
		 
		 public static WebElement Kysimuspiltliigasuur(WebDriver driver){
			 
			    element = driver.findElement(By.cssSelector("html body.modal-open div.container div.col-sm-8 div.question-update.picture-upload form div.full-width div.fileupload.fileupload-new div#picture_modal.modal.fade.in div.modal-dialog div.modal-content div.modal-body p.alert.alert-danger.file-size-alert.center"));
			 
			    return element;
			 
			    }
		 
		 
		 
		 
		 
		 



}
