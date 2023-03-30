package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInJobsClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/home");
		
		//Click on Jobs Path
		driver.findElement(By.xpath("//a[contains(@href,'jobs/jobs-in-bengaluru')]")).click();
		Thread.sleep(5000);
		driver.quit();
				
	}

}
