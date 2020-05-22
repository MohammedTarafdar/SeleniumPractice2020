package basic.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasic {

	public static void main(String[] args) {
		

		//System.setProperty("webdriver.chrome.driver", "/Users/ashik/Downloads/chromedriver_83");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		// Launch the Chrome driver
		driver.manage().window().fullscreen(); 		// to make your screen full		// better
		// driver.manage().window().maximize(); 		// to maximize your window
		driver.manage().deleteAllCookies(); 		// to delete all cookies
		
		driver.get("http://www.google.com");	// enter url 
		
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
		
		// How to get page source
		//driver.getPageSource();
		
		//How to close browser
		driver.close();
		
		// how to quit browser
		driver.quit();
		
		
		

	}

}
