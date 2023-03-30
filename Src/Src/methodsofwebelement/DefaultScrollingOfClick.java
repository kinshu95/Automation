package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultScrollingOfClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Main URL of web application
		driver.get("https://en-gb.facebook.com/");
		
		//Click on Messenger 
		//Element is not present in View port area
		//Click() has the default scrolling ability
		driver.findElement(By.linkText("Messenger")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
