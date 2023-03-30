package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTilteMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Creating Object or Instantiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//Retrieving Title
		String exepectedamazonTilte="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualamazonTitle=driver.getTitle();
		System.out.println("ExceptedAmazonTitle: "+exepectedamazonTilte);
		System.out.println();
		System.out.println("ActualamazonTitle : "+actualamazonTitle);
		//Validation
		if(exepectedamazonTilte.equals(actualamazonTitle))
		{ 
			System.out.println();
			System.out.println("Pass: The Amazon webpafe title is correct");
		}
		else
			System.out.println("Failed");
		driver.close();
	}
}
