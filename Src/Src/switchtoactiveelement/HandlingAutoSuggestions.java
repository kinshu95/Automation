package switchtoactiveelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//FindElements - List<WebElements
//Handling Auto Suggestions


public class HandlingAutoSuggestions {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
			driver.switchTo().activeElement().sendKeys("Selenium");
			List<WebElement> seleniumAutoSuggestion= driver.findElements(By.xpath("//li[@class='sbct' and not(@id='YMXe')]"));
			
			//To get the count of the element in the auto suggestion returned ny the findElements
			System.out.println("Selenium Auto Suggested list no :- "+ seleniumAutoSuggestion.size());

			/* The for each loop - run iteratively for 10 times but at the mid of iteration it will click 
			 * on the Selenium tutorial which tend to transfer the chrome page to the selenium tutorial 
			 * chrome page which leads to  org.openqa.selenium.StaleElementReferenceException to avoid that
			 * we can use break inside if block and there is another method POM----> Object Model   */
			
			//The for each loop -- Iteration of 10 time
			for (WebElement auto1 : seleniumAutoSuggestion) {
				System.out.println(auto1.getText());
				//It has to click on 6th Auto-Suggestion
				if (auto1.getText().equals("selenium tutorial")) {
					
					//Supply the wait for the condition as expected by the user
					wait.until(ExpectedConditions.textToBePresentInElement(auto1, "selenium tutorial"));
					// perform the action on the element which is under current iteration 
					auto1.click();
					//under 6th iteration of the for-each loop the condition 
					//Satisfied and clicked on the element
					// for the next iteration of the for-each loop their is no actual element
					
					
					
					break;
				}
			}
			Thread.sleep(7000);
			
		

	}

}
