package switchtoactiveelement;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonRedmiSerach {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi");
		List<WebElement> redmiAutoSuggestions= driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		System.out.println("Size of List :- "+redmiAutoSuggestions.size());
		for (WebElement auto : redmiAutoSuggestions) {
			if (auto.getText().equals("redmi note 10 pro")) {
				auto.click();
				break;
				
			}
			
		}
		driver.quit();
	}

}
