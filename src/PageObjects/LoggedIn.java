package PageObjects;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class LoggedIn {
	
	public static WebElement element = null;
	
	//Saadud feedback ja kysitlused
	 public static WebElement Saadud(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a[href='/']"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement Epost(WebDriver driver){
		 
		    element = driver.findElement(By.name("email"));
		 
		    return element;
		 
		    }

	 public static WebElement Epostkinnitus(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysimusBox (WebDriver driver){
		 
		    element = driver.findElement(By.id("new_post_question"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement Kysimusbutton(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("button.btn.btn-primary.pull-right.post-button"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement TagasiKoik(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//div[2]/table/tbody/tr/td/a"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement TagasiTagasi(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a[href='/testimonials_feed']"));
		 
		    return element;
		 
		    }
	
	 
	 public static WebElement TeeAvalikuks(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("button.btn.btn-xs.btn-link.public-private.hide-when-public "));
		 
		    return element;
		 
		    }
	 
	 public static WebElement TeePrivaatseks(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("button.btn.btn-xs.btn-link.public-private.show-when-public "));
		 
		    return element;
		 
		    }
	 
	 
	 //Tagasiside jagamine
	 public static WebElement TagasiJaga(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a.btn.btn-xs.btn-link.share-dropdown"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement TagasiJagaFacebook(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a.btn.btn-xs.btn-link.fb_send_published"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement TagasiJagatwitter(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a.btn.btn-xs.btn-link.tweet"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement TagasiJagatwitterKeegiTeine(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.col-sm-8 div.tab-content div#feedback.tab-pane.active div.feed-items.feedback-article div.dropdown.inline-block ul.dropdown-menu.share-dropdown-list li a.btn.btn-xs.btn-link i.fa.fa-twitter.fa-fw"));
		 
		    return element;
		 
		    }
	 public static WebElement TagasiJagaTumbler(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a.btn.btn-xs.btn-link.tumblr-icon"));
		 
		    return element;
		 
		    }
	 public static WebElement TagasiJagaVK(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a.vk-share-button"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement TagasiDelete(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a.btn.btn-default.btn-xs.pull-right.remove_item"));
		 
		    return element;
		 
		    }
	 
	 
	 
	 
	 public static WebElement TagasiVasta(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("button.btn.btn-xs.btn-link.reply"));
		 
		    return element;
		 
		    }
	 public static WebElement TagasiVastaBox(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("div.comment-form > textarea.textarea-autogrow.form-control"));
		 
		    return element;
		 
		    }
	 public static WebElement TagasiVastaButton(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("button.btn.btn-sm.btn-primary"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement TagasiKysitlus(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a[href='/surveys_feed']"));
		 
		    return element;
		 
		    }

	 public static WebElement UusKysitlus(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a[href='/surveys']"));
		 
		    return element;
		 
		    }
	 public static WebElement UusKysitlusWhenExisting(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-md-8 div.row.survey-page-title div.col-xs-7 button.btn.btn-primary.pull-right"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement UusKysitlusFollowuppage(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-md-8 div.jumbotron.toggle-survey-modal button.btn.btn-primary"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusHalda(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("a[href='/surveys']"));
		 
		 return element;
	 }
	 
	 
	 
	 
	 public static WebElement JagaUrlFacebook(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("a.fb_send_icon.sn-icon-light"));
		 
		 return element;
	 }
	 
 
 
	 
	 
	 public static WebElement JagaUrlTwitter(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("a.tweet.sn-icon-light"));
		 
		 return element;
	 }
	 
	 
 

	 public static WebElement JagaUrlTumblr(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("div.row div.col-sm-3 a.tumblr-icon.sn-icon-light"));
		 
		 return element;
	 }
	
	 public static WebElement JagaUrlVK(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("a.vk-share-button.sn-icon-light"));
		 
		 return element;
	 }
	 
	 public static WebElement Saadetud(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("a[href='/sent']"));
		 
		 return element;
	 }
	 
	 
 public static WebElement SaadetudFeedItem(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("p.feed-item"));
		 
		 return element;
	 }
	 
	 public static WebElement Friends(WebDriver driver){		 
		 element = driver.findElement(By.cssSelector("a[href='/friends']"));
		 
		 return element;
	 }
	 
	 public static WebElement FriendsNone(WebDriver driver){		 
		 element = driver.findElement(By.cssSelector("body > div.container > div.col-sm-8 > p:nth-child(4)"));
		 
		 return element;
	 }
	 
	 
	 public static WebElement FriendsClose(WebDriver driver){		 
		 element = driver.findElement(By.cssSelector("div#contacts.modal.fade.in div.modal-dialog div.modal-content div.modal-footer button.btn.btn-default"));
		 
		 return element;
	 }
	 
	 
	 public static WebElement FriendsSeeallOfthem(WebDriver driver){		 
		 element = driver.findElement(By.cssSelector("a[href='#contacts']"));
		 
		 return element;
	 }
	 
	 public static WebElement FriendsWhoYouFollow(WebDriver driver){		 
		 element = driver.findElement(By.cssSelector("a[href='#f1']"));
		 
		 return element;
	 }
	 
	 
	 public static WebElement FriendsWhoYouFollowStop(WebDriver driver){		 
		 element = driver.findElement(By.cssSelector("html body.modal-open div.container div.col-sm-4 div div#contacts.modal.fade.in div.modal-dialog div.modal-content div.modal-body div.tab-content div#f1.tab-pane.row.active div.modal-follows.wrap-words div.col-xs-2.col-md-4 span.visible-lg.visible-md button.btn.btn-default.pull-right"));
		 
		 return element;
	 }
	 
	 
	 public static WebElement FriendsWhoFollowYouStop(WebDriver driver){		 
		 element = driver.findElement(By.cssSelector("html body.modal-open div.container div.col-sm-4 div div#contacts.modal.fade.in div.modal-dialog div.modal-content div.modal-body div.tab-content div#f2.tab-pane.row.active div.wrap-words div.search-follow.col-xs-2.col-md-4 span.visible-lg.visible-md button.btn.btn-default.pull-right"));
		 
		 return element;
	 }
	 
	 public static WebElement FriendsWhoFollowYouStart(WebDriver driver){		 
		 element = driver.findElement(By.cssSelector("html body.modal-open div.container div.col-sm-4 div div#contacts.modal.fade.in div.modal-dialog div.modal-content div.modal-body div.tab-content div#f2.tab-pane.row.active div.wrap-words div.search-follow.col-xs-2.col-md-4 span.visible-lg.visible-md button.btn.btn-success.pull-right"));
		 
		 return element;
	 }
	 
	 
	 public static WebElement FriendsWhoFollowYou(WebDriver driver){		 
		 element = driver.findElement(By.cssSelector("a[href='#f2']"));
		 
		 return element;
	 }
	 
	 public static WebElement FriendsFeedback(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("div.row div.col-md-11.col-xs-10.friends-feed-text p.feed-item"));
		 
		 return element;
	 }
	 
	 public static WebElement DropdownMenu(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("html body div.navbar.navbar-inverse.main-navbar div.container div.collapse.navbar-collapse.main-navbar-collapse div.hidden-xs ul.nav.navbar-nav.pull-right li.dropdown a.dropdown-toggle"));
		 
		 return element;
	 }
	 
	 public static WebElement AvalikProfiil(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("html body div.navbar.navbar-inverse.main-navbar div.container div.collapse.navbar-collapse.main-navbar-collapse div.hidden-xs ul.nav.navbar-nav.pull-right li.dropdown.open ul.dropdown-menu li"));
		 
		 return element;
	 }
	 
	 public static WebElement MenuKeel(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("a[href='#language-model']"));
		 
		 return element;
	 }
	 
	 
	 
	 

	public static WebElement Seaded(WebDriver driver){
	 
	 element = driver.findElement(By.cssSelector("a[href='#settings']"));
	 
	 return element;
	 
}
		public static WebElement Logout(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("a[href='/logout']"));
		 
		 return element;
	 }
		public static WebElement KysimusLisaPilt(WebDriver driver){
			 
			 element = driver.findElement(By.cssSelector("div.fileupload.fileupload-new a.picture-modal span.fileupload-new.upload-thumbnail.tooltips i.fa.fa-4x.fa-picture-o"));
			 
			 return element;
		 }
		public static WebElement KysimusPreagune(WebDriver driver){
			 
			 element = driver.findElement(By.cssSelector("div.question-update.picture-upload table.col-xs-12 tbody tr td.current-question table tbody tr td.wrap-words strong"));
			 
			 return element;
		 }
		
		public static WebElement KysimusValiPilt(WebDriver driver){
			 
			 element = driver.findElement(By.cssSelector("html body.modal-open div.container div.col-sm-8 div.question-update.picture-upload form div.full-width div.fileupload.fileupload-new div#picture_modal.modal.fade.in div.modal-dialog div.modal-content div.modal-body div.form-group span.btn.btn-file.btn-default.btn-block"));
			 
			 return element;
		 }
		
		public static WebElement KysimusValiPiltFF(WebDriver driver){
			 
			 element = driver.findElement(By.id("new_post_image"));
			 
			 return element;
		 }
		
		public static WebElement QuestionDropdown(WebDriver driver){
			 
			 element = driver.findElement(By.cssSelector("div select.form-control.select-question"));
			 
			 return element;
		 }
		
		public static WebElement QuestionOption1(WebDriver driver){
			 
			 element = driver.findElement(By.cssSelector("div select.form-control.select-question option:nth-of-type(3)"));
			 
			 return element;
		 }
		public static WebElement QuestionOption2Pic(WebDriver driver){
			 
			 element = driver.findElement(By.cssSelector("div select.form-control.select-question option:nth-of-type(3)"));
			 
			 return element;
		 }
		public static WebElement QuestionOption3(WebDriver driver){
			 
			 element = driver.findElement(By.cssSelector("div select.form-control.select-question option:nth-of-type(3)"));
			 
			 return element;
		 }
		public static WebElement QuestionOption4(WebDriver driver){
			 
			 element = driver.findElement(By.cssSelector("div select.form-control.select-question option:nth-of-type(4)"));
			 
			 return element;
		 }
		
		public static WebElement QuestionOption5(WebDriver driver){
			 
			 element = driver.findElement(By.cssSelector("div select.form-control.select-question option:nth-of-type(5)"));
			 
			 return element;
		 }
		
		public static WebElement QuestionOption6(WebDriver driver){
			 
			 element = driver.findElement(By.cssSelector("div select.form-control.select-question option:nth-of-type(6)"));
			 
			 return element;
		 }
		public static WebElement QuestionOption7(WebDriver driver){
			 
			 element = driver.findElement(By.cssSelector("div select.form-control.select-question option:nth-of-type(7)"));
			 
			 return element;
		 }
		public static WebElement QuestionOption8(WebDriver driver){
			 
			 element = driver.findElement(By.cssSelector("div select.form-control.select-question option:nth-of-type(8)"));
			 
			 return element;
		 }
		public static WebElement QuestionOption9(WebDriver driver){
			 
			 element = driver.findElement(By.cssSelector("div select.form-control.select-question option:nth-of-type(9)"));
			 
			 return element;
		 }
		public static WebElement SuccessFeedback(WebDriver driver){
			 
			 element = driver.findElement(By.cssSelector("body > div.container > div.well"));
			 
			 return element;
		 }
		public static WebElement SuccessKyssauuendus(WebDriver driver){
			 
			 element = driver.findElement(By.cssSelector("body > div.container > div.col-sm-8 > div.question-update.picture-upload > p.alert.alert-success.post_alert"));
			 
			 return element;
		 }
}
