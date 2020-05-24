package basic.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxDriver {

	public static void main(String[] args) {

		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); 	
		driver.manage().window().fullscreen(); 		
		driver.manage().deleteAllCookies(); 		
		
		driver.get("http://www.google.com");	
		
		String title = driver.getTitle();	// get the title
		System.out.println("Page title is : "+ title);
		
		// verification or checkpoint
		if(title.equals("Google")) {
			System.out.println("expected title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		// how to get current url ?
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
		//How to close browser
		driver.close();
		
		
	}

}
