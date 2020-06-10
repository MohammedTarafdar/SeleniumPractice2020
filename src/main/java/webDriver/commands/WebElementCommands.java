package webDriver.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementCommands {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		
		/*WebElement element = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		element.sendKeys("hi");
		
		try {
		Thread.sleep(5000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		// 1. clear() command
	
		element.clear();
		
		WebElement element1 = driver.findElement(By.name("firstname"));
		
		
		 // 2. sendkeys() command
		element1.sendKeys("Mohammed");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 3. click() command we will use latter on
		
		
		
		// 4. isDisplayed() command
		
		boolean status = element1.isDisplayed();
		System.out.println(status);
		
		*/
		// 5. isEnabled() command
		
		WebElement element2 = driver.findElement(By.name("lastname"));
		boolean status1 = element2.isEnabled();
		if(status1) {
			element2.sendKeys("Tarafdar");
		}
		else {
			System.out.println("Sorry this element is not enable");
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 6. isSelected() command, this command only applies to input elements such as Checkboxes, Select Options, and Radio Buttons.
		
		
		WebElement element7 = driver.findElement(By.id("u_0_7"));
		boolean status5 = element7.isSelected();
		if(!status5) {
			element7.click();
		}
		else {
			System.out.println("This button already selected");
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 7. submit() command, we will use latter on
		
		
		
		
		// 8. getText() command, This method will fetch the visible innerText of the element.
		
		WebElement link = driver.findElement(By.xpath("(//a)[4]"));
		String text = link.getText();
		System.out.println(text);
		
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// getTagName() command
		
		WebElement element10 = driver.findElement(By.name("firstname"));
		String tagName = element10.getTagName();
		System.out.println(tagName);
		

	}

}
