package getthescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementScreenShot {
	public static void main(String[] args) throws IOException {
		LocalDateTime DateTime= LocalDateTime.now();
		String timeStamp=DateTime.toString().replace(':', '.');
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.shaadi.com/");
		File tempFile = driver.findElement(By.xpath("//button[text()=\"Let's Begin\"]")).getScreenshotAs(OutputType.FILE);
		File desFile=new File("./errorshots/"+timeStamp+"Button_Element.png");
		FileUtils.copyFile(tempFile, desFile);
		
		driver.quit();
	}

}
