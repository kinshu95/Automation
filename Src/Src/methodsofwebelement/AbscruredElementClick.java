package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbscruredElementClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		//Handle the obscured element before performing action to the target element
		//Region selection(Country Specification)
		//ElementClickInterceptedException ---------- Exception if Obscured Element is not Handle
		driver.findElement(By.xpath("//div/span[contains(.,\"Don't Change\")]")).click();
		Thread.sleep(2000);
		
		//Target Element of Web Page------ Amazon
		driver.findElement(By.linkText("Customer Service")).click();
		Thread.sleep(4000);
		driver.quit();
		
	}

}
