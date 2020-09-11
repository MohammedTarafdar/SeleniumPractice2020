package seleniumBasic.naveen;

// This package with Naveen 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasic {
	
	public static void main(String [] args) {
		
		
		// to launch chrome
		/*
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		*/
		
		// to launch firefox
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); 
		
		// to maximize your window
		//driver.manage().window().fullscreen(); // .fullscreen() method is not working in mac
		driver.manage().window().maximize();
		
		// to delete all cookies
		driver.manage().deleteAllCookies();
		
		
		//enter url
		driver.get("http://www.google.com");
		
		//get the title
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		//varification point
		if (pageTitle.equals("Google")) {
			System.out.println("Page title is correct");
		}
		else {
			System.out.println("Page title is incorrect");
		}
		
		// to check current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		// to get page source code
		//driver.getPageSource();
		
		
		// to close the browser
		driver.quit();
	}

}
