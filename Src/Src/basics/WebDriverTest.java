package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	FirefoxDriver drive=new FirefoxDriver();
	Thread.sleep(5000);
	drive.quit();
}
}
