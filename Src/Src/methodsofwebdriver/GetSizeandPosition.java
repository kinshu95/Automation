package methodsofwebdriver;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeandPosition {
	public static void main(String[] args) throws InterruptedException {
		//Set driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Instantiation the browser specific class
		ChromeDriver driver=new ChromeDriver();
		
		//Pre-Condition Maximize the browser
		driver.manage().window().maximize();
		
		//Pass the main URL
		driver.get("http://www.leafground.com/pages/Window.html");
		
		//Find the element Open Multiple Windows button and perform click action
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Thread.sleep(5000);
		
		//Capture Size of Parent WIndow
		/*Dimension sizeOfParentWindow=driver.manage().window().getSize();
		System.out.println("Parent windows Height "+sizeOfParentWindow.getHeight());
		System.out.println("Parent windows Width "+sizeOfParentWindow.getWidth());*/
		
		//Getting Windows IDs to perform task and transfer control to multiple windows
		Set<String> windowsIDs=driver.getWindowHandles();
		System.out.println("Number of Windows : "+windowsIDs.size());
		System.out.println();
		for (String wID : windowsIDs) {
			System.out.println("Windows IDs Stored in Set :"+wID);
			}
		System.out.println();
		for (String winID : windowsIDs) {
			String windowTitle=driver.switchTo().window(winID).getTitle();
			System.out.println("Windows Title "+windowTitle);
			
			//Apply Condition to transfer driver control over children windows one by one Using Windows Title 
			if (windowTitle.equals("TestLeaf - Interact with HyperLinks")) {
				Dimension sizeOfHyperlinkWindow=driver.switchTo().window(winID).manage().window().getSize();
				int hyperLinkWindowHeight=sizeOfHyperlinkWindow.getHeight();
				int hyperLinkWindowWidth=sizeOfHyperlinkWindow.getWidth();
				System.out.println("HyperLink Window Height  "+hyperLinkWindowHeight);
				System.out.println("HyperLink Window Width  "+hyperLinkWindowWidth);
				Point hyperLinkWindowPosition = driver.manage().window().getPosition();
			    int HyperLinkstartX=hyperLinkWindowPosition.getX(); 
			    int HyperLinkstartY=hyperLinkWindowPosition.getY();
			    System.out.println("HyperLink Window Start X Point : "+HyperLinkstartX);
			    System.out.println("HyperLink Window Start Y Point : "+HyperLinkstartY);			    
				driver.manage().window().maximize();
			    Thread.sleep(5000);
				driver.close();
				
				//Transferring Control to Second Child  
				
			}
			//Dimension=driver.switchTo().window(winID).manage().window().getSize();
		}
		
		//Terminate the Session
		driver.quit();
		
	}

}
