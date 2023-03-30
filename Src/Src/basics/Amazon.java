package basics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi");
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(5000);

	
	List<WebElement>resultElements  =driver.findElements(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));

	for (WebElement result : resultElements) {
		String resultof5= result.getText();
		for(int i=0;;)
		{
			
			System.out.println(resultof5);
			i++;
			break;
		}
		
	}
	driver.quit();
	}
}
