package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriToolTipTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String expectedTilteToolTipText= "Jobseeker Login";
		System.out.println("Expected Tool Tip :- "+expectedTilteToolTipText);
		String actualTitleToolTipText = driver.findElement(By.id("login_Layer")).getAttribute("title");
		System.out.println("Actual Tool Tip :- "+actualTitleToolTipText);		
		if (expectedTilteToolTipText.equals(actualTitleToolTipText)) 
		{
			System.out.println("Pass: The tool tip text of the Login logo is Correct ");
		}
		else
			System.out.println("Fail: The tool tip of the Login is failed");	
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	}

}
