package webDriver.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {
	
	

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();	
		
		
		
		// 1. Navigate To Command
		
		driver.navigate().to("https://www.javatpoint.com/");
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement element = driver.findElement(By.xpath("//*[@class=\"ddsmoothmenu\"]/ul/li[3]"));
		element.click();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Back command
		
		driver.navigate().back();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		
		
		// Forward command
		
		driver.navigate().forward();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String title4 = driver.getTitle();
		System.out.println(title4);
		
		
		
		
		// Refresh command, this method refresh/reloads the current web page in the existing browser window.
		
		
		driver.navigate().refresh();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String title5 = driver.getTitle();
		System.out.println(title5);
		
		driver.quit();	
		
		
	}
	
	

}
