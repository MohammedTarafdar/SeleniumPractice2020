package webDriver.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConceptTwo {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.navigate().to("https://www.target.com/");
		Thread.sleep(5000);
				
		// II. contains() function
				
		// 1.(//a[contains(@class,"Link-sc-1khjl8b-0 erY")])[1]
		// 2.//div[@id="viewport"]//div[contains(@class,'utility-navFill')]//ul/li
				
		driver.findElement(By.xpath("//div[@id=\"viewport\"]//div[contains(@class,'utility-navFill')]//ul/li")).click();
				
				
		// III. starts-with() function
				
		// (//li[@class="FilmstripItem-jx5f9b-0 kXXbHf filmstripItem"])[3]
		// (//li[starts-with(@class, 'FilmstripItem-jx5f9b-')])[3]
				
				
				
		// IV. ends-with()

				
				
		// V. position()
				
				
		//  . substring()

				
				
				
				
		//  . child::

				
				
				
				
		//  . parent::

				
				
				
		//  . parent::

				
				
		//  . preceding-sibling::

				
				
				
		//  . following-sibling::

				
				
				
		//  . ancestor::

				
				
				
		//  . following::

				
				
				
		// . 
				

				
				
				
		// 8. CSS Selector
		
		
	}

}
