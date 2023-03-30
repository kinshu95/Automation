package handlingforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLoginForm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		//Handling the form----- To optimize the search criteria
		// Parent element---- form division tables.....
		WebElement facebookLoginForm= driver.findElement(By.cssSelector("form[data-testid='royal_login_form']"));
		facebookLoginForm.findElement(By.id("email")).sendKeys("Garima Srivastava");
		Thread.sleep(3000);
		facebookLoginForm.findElement(By.id("pass")).sendKeys("Himanshu");
		 WebElement loginButton= facebookLoginForm.findElement(By.name("login"));
		 if (loginButton.getAttribute("type").equals("submit")) {
			 if (loginButton.getTagName().equals("button")) {
				 loginButton.submit();
				Thread.sleep(3000);
			}
			
		}
		 driver.quit();
		
	}

}
