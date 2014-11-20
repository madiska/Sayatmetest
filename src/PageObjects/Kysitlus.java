package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Kysitlus {
	
	public static WebElement element = null;

	 public static WebElement KysitlusPealkiri(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("input#input_new_survey_title.form-control.input-height"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusKirjeldus(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("textarea#input_new_survey_description.textarea-3lines.form-control"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusPrivaatne(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("input#input_new_survey_private"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement KysitlusTyhista(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_new_survey.modal.fade.in div.modal-dialog div.modal-content div.modal-footer button.btn.btn-default"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement KysitlusSalvesta(WebDriver driver){
		 
		    element = driver.findElement(By.id("button_save_new_survey"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement KysitlusKysimus(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_new_survey.modal.fade.in div.modal-dialog div.modal-content div.modal-body button#button_save_new_survey.btn.btn-primary.btn-margin.pull-right"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusSelgitus(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_new_survey.modal.fade.in div.modal-dialog div.modal-content div.modal-body button#button_save_new_survey.btn.btn-primary.btn-margin.pull-right"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement KysitlusNoutud(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_new_survey.modal.fade.in div.modal-dialog div.modal-content div.modal-body button#button_save_new_survey.btn.btn-primary.btn-margin.pull-right"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement KysitlusTekstvastus(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_new_survey.modal.fade.in div.modal-dialog div.modal-content div.modal-body button#button_save_new_survey.btn.btn-primary.btn-margin.pull-right"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement Kysitlusyksvariant(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div.form-group div.col-sm-6.controls label.radio input#input_edit_question_type_single"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusyksVariantEsimeneBox(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div#container_edit_question_options_group.form-group div.col-sm-6.controls div#container_edit_question_options div#option_no_1.margin-bottom-5 div.input-group input.form-control.input-height.input_edit_option_text.option_new"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusyksVariantEsimeneBoxDelete(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div#container_edit_question_options_group.form-group div.col-sm-6.controls div#container_edit_question_options div#option_no_3.margin-bottom-5 div.input-group a.button_remove_option.btn.btn-xs.btn-default.input-group-addon"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusyksVariantTeineBox(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div#container_edit_question_options_group.form-group div.col-sm-6.controls div#container_edit_question_options div#option_no_2.margin-bottom-5 div.input-group input.form-control.input-height.input_edit_option_text.option_new"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusyksVariantTeineBoxDelete(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div#container_edit_question_options_group.form-group div.col-sm-6.controls div#container_edit_question_options div#option_no_4.margin-bottom-5 div.input-group a.button_remove_option.btn.btn-xs.btn-default.input-group-addon"));
		 
		    return element;
		 
		    }
	 
	
	 
	 public static WebElement KysitlusyksVariantiKolmasBox(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div#container_edit_question_options_group.form-group div.col-sm-6.controls div#container_edit_question_options div#option_no_3.margin-bottom-5 div.input-group input.form-control.input-height.input_edit_option_text.option_new"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusMituVarianti(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div.form-group div.col-sm-6.controls label.radio input#input_edit_question_type_multi"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusMituVariantiEsimeneBox(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div#container_edit_question_options_group.form-group div.col-sm-6.controls div#container_edit_question_options div#option_no_1.margin-bottom-5 div.input-group input.form-control.input-height.input_edit_option_text.option_new"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusMituVariantiEsimeneBoxDelete(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div#container_edit_question_options_group.form-group div.col-sm-6.controls div#container_edit_question_options div#option_no_3.margin-bottom-5 div.input-group a.button_remove_option.btn.btn-xs.btn-default.input-group-addon"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusMituVariantiTeineBox(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div#container_edit_question_options_group.form-group div.col-sm-6.controls div#container_edit_question_options div#option_no_2.margin-bottom-5 div.input-group input.form-control.input-height.input_edit_option_text.option_new"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusMituVariantiTeineBoxDelete(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div#container_edit_question_options_group.form-group div.col-sm-6.controls div#container_edit_question_options div#option_no_4.margin-bottom-5 div.input-group a.button_remove_option.btn.btn-xs.btn-default.input-group-addon"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusLisaValik(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div#container_edit_question_options_group.form-group div.col-sm-6.controls button#button_edit_question_add_option.btn.btn-default.btn-sm"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusMituVariantiKolmasBox(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div#container_edit_question_options_group.form-group div.col-sm-6.controls div#container_edit_question_options div#option_no_3.margin-bottom-5 div.input-group input.form-control.input-height.input_edit_option_text.option_new"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusMituVariantiKolmasBoxDelete(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div#container_edit_question_options_group.form-group div.col-sm-6.controls div#container_edit_question_options div#option_no_5.margin-bottom-5 div.input-group a.button_remove_option.btn.btn-xs.btn-default.input-group-addon"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusKysimusTyhista(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-footer button.btn.btn-default"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusAvalda(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-md-8 div.well a#button_publish_survey.btn.btn-primary.tooltips.margin-bottom"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement KysitlusMuuda(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-md-8 div.well div.margin-top a.btn.btn-default.tooltips"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusLisaUusKysimus(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-md-8 div.well div.margin-top a.btn.btn-default.button_new_question.tooltips"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusKysimusPealkiri(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body.modal-open div.container div#container_edit_question.modal.fade.in div.modal-dialog div.modal-content div.modal-body.form-horizontal div.form-group div.col-sm-6.controls input#input_edit_question_title.form-control.input-height"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusKysimusSalvesta(WebDriver driver){
		 
		    element = driver.findElement(By.id("button_save_new_question"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusKustuta(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-md-8 div.well a#button_delete_survey.btn.btn-default.btn-xs.pull-right.tooltips"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusKysimusKustuta(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a.btn.btn-default.btn-xs.pull-right.button_delete_question"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement KysitlusDetailVaade(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("a.btn.btn-default.btn-xs.pull-right.button_delete_question"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement KysitlusTulemused(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-md-8 div.navbar.navbar-default.survey-menu div#survey-menu-collapse.collapse.navbar-collapse ul.nav.navbar-nav li.dropdown a.dropdown-toggle i.fa.fa-tasks"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusTulemusedylevaade(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-md-8 div.navbar.navbar-default.survey-menu div#survey-menu-collapse.collapse.navbar-collapse ul.nav.navbar-nav li.dropdown ul.dropdown-menu li a i.fa.fa-signal"));
		 
		    return element;
		 
		    }
	 public static WebElement KysitlusTulemusedLaeAllaDropdown(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-md-8 div.navbar.navbar-default.survey-menu div#survey-menu-collapse.collapse.navbar-collapse ul.nav.navbar-nav li.dropdown ul.dropdown-menu li a i.fa.fa-download"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusTulemusedLaeAlla(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-md-8.hide-overflow div.pull-right.col-lg-9.row a.btn.btn-primary.col-xs-4 i.fa.fa-download"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusEelvaade(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-md-8 div.navbar.navbar-default.survey-menu div#survey-menu-collapse.collapse.navbar-collapse ul.nav.navbar-nav li a i.fa.fa-question-circle"));
		 
		    return element;
		 
		    }
	 
	 
	 
	 public static WebElement KysitlusVastaTextbox(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-sm-8 form div.question-margin div textarea.textarea-3lines.form-control"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusVastayksVastus(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-sm-8 form div.question-margin div textarea.textarea-3lines.form-control"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusVastaMituVastust(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-sm-8 form div.question-margin div textarea.textarea-3lines.form-control"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusVastusSalvesta(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-sm-8 form div.question-margin button.btn.btn-primary"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusJagaFacebook(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("div.input-group span.input-group-addon a.fb_send_survey.tooltips.sn-icon-dark i.fa.fa-facebook"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusJagaTwitter(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("div.input-group span.input-group-addon a.tweet.tooltips.sn-icon-dark i.fa.fa-twitter"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement KysitlusJagaTumblr(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("div.input-group span.input-group-addon a.tumblr-icon.tooltips.sn-icon-dark i.fa.fa-tumblr"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement Avaldatud(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("div.col-md-8 > div.well > p.container_survey_published.collapse"));
		 
		    return element;
		 
		    }
	 
	 
	 
	 
	 

}
