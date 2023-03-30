package methodsofwebdriver;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPosition {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Thread.sleep(5000);
		//Getting ID of Multiple Windows-------------------------------
		Set<String> allWindowsIDs=driver.getWindowHandles();
		for (String windowsIdDisplay : allWindowsIDs) {
			System.out.println("All Windows ID Displayed :----> "+windowsIdDisplay);
			
		}
		System.out.println();
		//Iteratively take one windowID at a time------------------------------------
		for (String winID : allWindowsIDs) {
			String actualWindowsTitle=driver.switchTo().window(winID).getTitle();
			System.out.println("Actual Windows Titles : "+actualWindowsTitle);
			
			//Transferring Driver Control to one of the Child Window--------------------
			if (actualWindowsTitle.equals("TestLeaf - Interact with Buttons")) {
				Point targetPosition= new Point(200,200);
				driver.manage().window().setPosition(targetPosition);
				Dimension targetSize= new Dimension(1250, 800);
				driver.manage().window().setSize(targetSize);
				Thread.sleep(5000);
				// Direct Use of Dimension Method------------------------------
				driver.manage().window().setSize(new Dimension(720, 400));
				Thread.sleep(6000);
			}
				
			}
		driver.quit();
		}
		

	}


