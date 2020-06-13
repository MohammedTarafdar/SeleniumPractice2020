package webDriver.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	
	/* # What is locator?
	 * => Locators are defined as an address that identifies a web element uniquely within the webpage.
	 * 
	 * # Types of Locators in Selenium
	 * => There are 8 locators defined in selenium API
	 * 1. ID, 2. Name, 3. Tag Name, 4. Class Name, 5. link Text, 6. Partial Link Text 7. XPath, 8. CSS Selectors
	 * 
	 * # What is XPath?
	 * 
	 * # Type of XPath
	 * 
	 * # What DOM?
	 */
	

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		//driver.navigate().to("https://www.javatpoint.com/");
		
		Thread.sleep(5000);
		
		
		// 1. ID
		
		WebElement element =driver.findElement(By.id("u_0_m"));
		element.sendKeys("Shift");
		Thread.sleep(1000);
		element.clear();
		
		// 2. Name
		
		WebElement element2 = driver.findElement(By.name("lastname"));
		element2.sendKeys("Vision");
		Thread.sleep(1000);
		element2.clear();
		
		
		// 3. Tag Name
		
		// 4. class Name
		
		// 5. Link Text
		
		//WebElement element3 = driver.findElement(By.linkText("Forgot account?"));
		//element3.clear();
		//Thread.sleep(5000);
		
		//What is InvalidElementStateException?
		
		
		
		// 6. Partial Link Text
		
		
		//WebElement element4 = driver.findElement(By.partialLinkText("Forgot account"));
		//element4.clear();
		//Thread.sleep(5000);
		
		//# What is InvalidElementStateException?
		
		
		// 7. XPath
		
		// 7.1 Basic Relative XPATH Syntax : XPath expression select nodes or list of nodes on the basis of attributes like ID , Name, Classname
		
		//Using single attribute  =>//tagname[@attribute='Value']

		
		WebElement element5 = driver.findElement(By.xpath("//input[@id=\"u_0_r\"]"));
		element5.sendKeys("ashik_mart@yahoo.com");
		Thread.sleep(1000);
		element5.clear();
		
		
		WebElement element6 =driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		element6.sendKeys("Shift");
		Thread.sleep(1000);
		element6.clear();
		
		
		// Using multiple attribute  =>//tagname[@attribute='Value' and @attribute='Value']
		 
		// Using multiple attribute  =>//tagname[@attribute='Value' or @attribute='Value']
		
		WebElement element7 =driver.findElement(By.xpath("//input[@name=\"lastname\" and @id=\"u_0_o\"]"));
		element7.sendKeys("Vision");
		Thread.sleep(1000);
		element7.clear();
		
		driver.close();
		driver.quit();
		
					
		
		/*
		// ********* for https://www.javatpoint.com/
		
		// 7.2 XPATH functions
		
		// I. text() function
		
		// //div[@id="link"]/div/ul/li[3]
		// (//*[text()="Java"])[1]
		
		driver.findElement(By.xpath("//div[@id=\"link\"]/div/ul/li[3]")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[text()=\"Java\"])[1]")).click();
		Thread.sleep(2000);
		*/
		
		
		
		
		
		
		
		

	}

}
