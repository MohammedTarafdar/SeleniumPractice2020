package webDriver.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {
	
	

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();		
		
		// 1. Navigate To Command
		
		
		//driver.navigate().to("www.javatpoint.com");
		
		driver.navigate().to("http://javatpoint.com");
		
		
		//driver.navigate().to("https://www.javatpoint.com/");
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}
