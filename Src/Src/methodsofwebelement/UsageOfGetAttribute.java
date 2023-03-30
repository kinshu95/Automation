package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Verified tool tip text------------------------

public class UsageOfGetAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String expectedToolTipText = "Flipkart";
		System.out.println("Expected Tool Tip :- "+expectedToolTipText);
		String actualToolTipText = driver.findElement(By.cssSelector("img[alt='Flipkart']")).getAttribute("title");
		System.out.println("Actual Tool Tip :- "+actualToolTipText);
		if (actualToolTipText.equals(expectedToolTipText)) 
		{
			System.out.println("Pass: The tool tip text of the flipkart logo is Correct ");
		}
		else
			System.out.println("Fail: The tool tip of the flipkart is failed");
		driver.quit();
	
	}

}
