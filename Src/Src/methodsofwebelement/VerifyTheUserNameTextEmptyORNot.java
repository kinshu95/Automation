package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheUserNameTextEmptyORNot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		String usernameTextFieldValue= driver.findElement(By.name("username")).getAttribute("value");
		System.out.println("UserName text field Value:- "+usernameTextFieldValue);
		
		// isEmpty() checks weather the field is Empty or Not  always return Boolean Value
		if (usernameTextFieldValue.isEmpty()) 
		{
			System.out.println("True");
			System.out.println("Passed: The UserName Text Field is Empty");
		}
		else
		{
			System.out.println("False");
			System.out.println("Failed: The UserName Text Field is Not Empty");
		}
		driver.quit();
	}

}
