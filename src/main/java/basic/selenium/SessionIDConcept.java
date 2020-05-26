package basic.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SessionIDConcept {
	
	// To debug press F6

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);			// Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
		
		driver.quit();
		
		//Can you explain session ID concept in selenium ?
		
		String pageTitle2 = driver.getTitle();
		System.out.println(pageTitle2);			// Exception in thread "main" org.openqa.selenium.NoSuchSessionException: 
												// Session ID is null. Using WebDriver after calling quit()?
		
		

	}

}
