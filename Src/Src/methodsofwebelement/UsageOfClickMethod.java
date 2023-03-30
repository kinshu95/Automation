package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClickMethod {
	public static void main(String[] args) throws InterruptedException {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Instantiation the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Passing the URL
		driver.get("https://demo.actitime.com/login.do");
		
		String webTitle=driver.getTitle();
		System.out.println(webTitle);
		String TestWebTitle="actiTIME - Logi";
		if(webTitle.equals(TestWebTitle))
		{
		//Passing the Keys
		driver.findElement(By.id("username")).sendKeys("Manager");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
		Thread.sleep(3000);
		
		//Web Element
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		System.out.println("Automation Script Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		
		//Termination of Entire Session
		driver.quit();
	}

}
