package webDriver.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;





public class BrowserCommands {
	
	
	
	public static void main(String[] args) {
	
	
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();		
		
		// 1. Get Command
		
		driver.get("https://www.javatpoint.com/");

		
		// 2. Get Title command
		
		
		// System.out.println(driver.getTitle());
		
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		// 3. Get Current URL command 
	
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		
		// 4. Get Page Source command 
		
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		// 5. Close command 
		
		driver.close();
		
		// 6. quit command
		driver.quit();
	
	}
}
