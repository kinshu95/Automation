package methodsofwebdriver;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWindows {
  public static void main(String[] args) throws InterruptedException, MalformedURLException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	// Creating Instance of Chrome Driver
	WebDriver driver=new ChromeDriver();
	// Inserting URL in chrome Browser
	driver.get("http://www.leafground.com/pages/Window.html");
	
	// Getting Path of Web page
	driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
	
	//Getting Parent Window ID by using getWindowsHandle()
	String parentWindowID=driver.getWindowHandle();
	System.out.println("Parent Window ID : "+ parentWindowID);
	//Getting all windows Id in current Session
	Set<String>allWindowsID=driver.getWindowHandles();
	// driver.close();
	// Print all windows ID
	System.out.println("All Windows ID = "+" "+allWindowsID);
	
	//Getting all windows ID iteratively one at a time by using Set<String> method
	for(String windowsID : allWindowsID)
	{
		// Printing Windows ID one at a time
		System.out.println("Windows ID : "+windowsID);
		
		//Transfer the driver control from current windows to the windowsID under this iteration
		//get the title of the windows under iteration
		String windowsTitle=driver.switchTo().window(windowsID).getTitle();
		
		//Print the windows Title under iteration
		System.out.println("Windows Title : "+ windowsTitle);
		//Close the parent windows upon the validation of its title 
		if (windowsTitle.equals("TestLeaf-Interact with Windows"))
		{
			driver.close();
		}
	}
	driver.quit();
	}
	
}

