package basics;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowIdStringTestScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Thread.sleep(5000);
		Set<String> windowsIDs=driver.getWindowHandles();
		for (String winIDs : windowsIDs) {
			System.out.println("Windows ID are:- "+winIDs);
			String windowTitle=driver.switchTo().window(winIDs).getTitle();		
			System.out.println(windowTitle);
			}
			for (String windowId : windowsIDs) {
				
				
			}
			driver.quit();
		}
		
	
	}


