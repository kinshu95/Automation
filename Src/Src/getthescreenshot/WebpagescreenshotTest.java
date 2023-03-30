package getthescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebpagescreenshotTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		LocalDateTime localDateTime=LocalDateTime.now();
		String localDateTimeString=localDateTime.toString().replace(':', '.');
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
		File tempFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
		System.out.println("Temporary Location : "+tempFile.getAbsolutePath());
		File destinationFile=new File("./errorshots/actiTimeScreenShot"+localDateTimeString+".png");
		FileUtils.copyFile(tempFile, destinationFile);
		System.out.println("Saved Location : "+destinationFile.getAbsolutePath());
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("User");
		driver.findElement(By.name("pwd")).sendKeys("Himanshu");
		Thread.sleep(3000);
		File tempFile2=takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile2=new File("./errorshots/actiTimeDataEnter"+localDateTimeString+".png");
		FileUtils.copyFile(tempFile2, destinationFile2);
		System.out.println("Enter dataFile location : "+destinationFile2);
		
		
		
		/* File webElementButton=driver.findElement(By.id("loginButton")).getScreenshotAs(OutputType.FILE);
		File webElementDestinationLocFile= new File("./errorshots/LoginButton.png");
		FileUtils.copyFile(webElementDestinationLocFile, webElementDestinationLocFile);
		System.out.println("WebElement Login Button Location : "+webElementDestinationLocFile); */
		
		driver.quit();
		
	}

}
