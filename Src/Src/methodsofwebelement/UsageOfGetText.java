package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement headerText=driver.findElement(By.id("headerContainer"));
		String headerTagText=headerText.getText();
		System.out.println("Tag Name is :- " +headerTagText);
		String headerTagName=headerText.getTagName();
		System.out.println("Tag name of the Element:- "+headerTagName);
		WebElement userNameTextField=driver.findElement(By.id("username"));
		WebElement passwordTextField=driver.findElement(By.name("pwd"));
		Thread.sleep(5000);
		userNameTextField.clear();		
		Thread.sleep(5000);
		passwordTextField.clear();
		Thread.sleep(5000);		
		userNameTextField.sendKeys("Administration");
		passwordTextField.sendKeys("Himanshu");
		Thread.sleep(5000);
		driver.findElement(By.id("keepLoggedInLabel")).click();
		Thread.sleep(3000);
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		
		//Enumeration is Java Template
		// Keys is one of the "enum" of Selenium
		//Inside enum we have
		loginButton.sendKeys(Keys.ENTER);
		driver.quit();
	}

}
