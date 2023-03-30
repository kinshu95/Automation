package handlingforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingActiTimeTables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement footerTable= driver.findElement(By.xpath("//table[@class='footer']"));
		
		//findElement() search criteria has optimize if the element is present inside the table
		//The total execution  
		String tagText= footerTable.findElement(By.xpath("//tr//td[not(@id='copyRight')]/nobr")).getText();
		System.out.println("tagText = "+ tagText);
		driver.quit();
	}

}
