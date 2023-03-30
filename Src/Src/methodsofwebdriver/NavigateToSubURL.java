package methodsofwebdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToSubURL {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(5000);
		URL dassultMainURL= new URL("https://www.dassault-aviation.com/en/");
		URL dassultSubURLDefense = new URL(dassultMainURL, "defense/");
		driver.navigate().to(dassultSubURLDefense);
		Thread.sleep(5000);
		driver.quit();
	}

	
	}


