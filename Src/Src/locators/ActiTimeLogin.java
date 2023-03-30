package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	public static void main(String[] args) throws InterruptedException {
		//Set driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Setting Instantiation of Web Driver OR creating object of Chrome Driver of type Web Driver
		WebDriver driver=new ChromeDriver();
		
		//Maximize Command
		driver.manage().window().maximize();
		
		//For using specific URL Page 
		driver.get("https://demo.actitime.com/login.do");
		
		//Transferring Control to insert data and autoClick for credentials
		//In HTML code find name, Id they are the first priority after that go for xpath for Web Element
		driver.findElement(By.name("username")).sendKeys("admin");
		 /* Alternate Syntax
		 WebElement usernameTextFields=driver.findElement(By.tagName("username"));
		 usernameTextFields.sendKeys("admin");   
		 */
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		/* Alternate Syntax 
		WebElement passwordTextFields= driver.findElement(By.name("pwd"));
		passwordTextFields.sendKeys("manager");
		*/
		
		Thread.sleep(5000);
		driver.findElement(By.id("keepLoggedInLabel")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
