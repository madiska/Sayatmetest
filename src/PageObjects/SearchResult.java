package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResult {

	public static WebElement element = null;
	
	
	

	 public static WebElement Jalgi(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-sm-8.search-results div.row div.col-xs-9.pull-right div.col-xs-5.row.pull-right div.search-follow.pull-right span.visible-lg.visible-md button.btn.btn-success"));
		 
		    return element;
		 
		    }
	 public static WebElement LopetaJalgimine(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("html body div.container div.row div.col-sm-8.search-results div.row div.col-xs-9.pull-right div.col-xs-5.row.pull-right div.search-follow.pull-right span.visible-lg.visible-md button.btn.btn-default"));
		 
		    return element;
		 
		    }
}
