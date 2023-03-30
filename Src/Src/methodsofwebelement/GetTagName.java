package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement loginButton= driver.findElement(By.name("login"));
		String typeAttValue=loginButton.getAttribute("type");
		System.out.println("typeAttValue = "+typeAttValue);
		String loginButtonTagName=loginButton.getTagName();
		System.out.println("LoginButtonTagName = "+loginButtonTagName);
		if (loginButtonTagName.equals("button")) {
			if (typeAttValue.equals("submit")) {
				loginButton.submit();
				Thread.sleep(5000);
				
			}
			
		}
		driver.quit();
		}

}
