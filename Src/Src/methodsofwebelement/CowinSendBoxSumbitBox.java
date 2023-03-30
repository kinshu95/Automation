package methodsofwebelement;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CowinSendBoxSumbitBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cowin.gov.in/");
		driver.findElement(By.xpath("//a[text()=' Partners ']")).click();
		Set<String> allWindowsIds= driver.getWindowHandles();
		
			
		for (String winId : allWindowsIds) 
		{
			String WindowURL= driver.switchTo().window(winId).getCurrentUrl();
			ArrayList<String > windowsURList= new ArrayList<String>();
			windowsURList.add(WindowURL);
			System.out.println(WindowURL);
			
			if (WindowURL.equals("https://www.cowin.gov.in/our-partner"))
			{
			 driver.findElement(By.xpath("//a[text()='Register Now']")).click();	
			}
			Set<String> everyWindowIds=driver.getWindowHandles();
			for (String winIds : everyWindowIds) {
				String allwindId= driver.switchTo().window(winIds).getCurrentUrl();
				System.out.println(allwindId);
				if (driver.findElement(By.name("submit")).isEnabled()) 
				{
					System.out.println("Fail : Submit buttom is enabled");
				}
				else {
					System.out.println("Pass: The submit buttom is disable");
				}
				
				
			}
		}
		driver.quit();
	}
	

}
