package getthescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebPageScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://en-gb.facebook.com/");
		
		//TypeCasting ---->  Down Casting the WebDriver object into TakesScreenshot object...
		TakesScreenshot takeScreenShot= (TakesScreenshot)driver;
		
		//Calling getScreenshotAs()
		//Return type Object
		// In three type we are choosing FILE ---( .png, .jpg, .jpeg).....
		File faceBookLoginPageTempFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		
		
		
		//Most secure Output type Encrypted in BASE64.....
		String base64file = takeScreenShot.getScreenshotAs(OutputType.BASE64);
		
		//Minimal Secure in Byte form......
		byte[] bytesFile = takeScreenShot.getScreenshotAs(OutputType.BYTES);
		
		//Since JVM delete the screenshot upon exiting the from the current session
		//File type printing it's absolute path by calling getAbsolutePath() ---> String
		System.out.println(faceBookLoginPageTempFile.getAbsolutePath());
		
		//Add commoIOJAR file to Java-Selenium Environment and Bulid it's path	
		// Declaring the permanent position....
		//JAR file will create the target screenshot folder upon mentioning its address in
		File destFile = new File("./errorshots/facebookLoginPage.png");
		
		//FileUtils is the CommoIO JAR
		//Moving the temporary file to permanent location......--->FileUtils.copyFile(File scrFile, File destinationFile)
		FileUtils.copyFile(faceBookLoginPageTempFile, destFile);
		
		System.out.println(destFile.getAbsolutePath());
		System.out.println(base64file);
		System.out.println(bytesFile);
		Thread.sleep(20000);
		driver.quit();
	}

}
