package basic.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	public WebDriver driver;
	
	

	public static void main(String[] args) {

		CrossBrowser obj = new CrossBrowser();
		WebDriver driver = obj.initDriver("chrome");
		//driver.get("http://www.google.com");
		
		obj.launchURL("http://www.google.com");
		String title =obj.getPageTitle();
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("expected title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		obj.quitBrowser();
		

	} 
	
	
	public WebDriver initDriver(String browser) {
		
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Browser "+browser+" is not found");
			
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		
		
		
		return driver;
			
	}

	
	public void launchURL(String url) {
		driver.get(url);
	}
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	
}
