package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDoodleTest {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/doodles");
		
		driver.findElement(By.id("searchinput")).sendKeys("Mothers day");
		driver.findElement(By.id("searchbtn")).click();
		Thread.sleep(7000);
		driver.quit();
	}

}

//NoSuchElementException
