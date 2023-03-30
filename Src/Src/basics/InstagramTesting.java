package basics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramTesting {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		driver.findElement(By.name("username")).sendKeys("abcdefgh");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
