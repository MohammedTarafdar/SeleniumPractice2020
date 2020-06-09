package basic.selenium;

import org.openqa.selenium.WebDriver;

public class LocatorsConcepts {

	public static void main(String[] args) {

		
		
		CrossBrowser obj = new CrossBrowser();
		WebDriver driver = obj.initDriver("chrome");
		driver.get("https://www.bestbuy.com/");
		
		
		

	}

}
