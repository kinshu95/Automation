package handlingdropdownlist;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YearDropDownSelection {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		
		//For day select option
		WebElement datDropDown=driver.findElement(By.id("day"));
		
		//Select variable will select on UI of the Application
		Select daySelect=new Select(datDropDown);
		
		// Creating List of Days
		List<WebElement> allDayOptionElements= daySelect.getOptions();
		
		//ForEach loop to select one day at a time
		for (WebElement day : allDayOptionElements) {
			
			// Passing the value of date in visibleDayText
			String visibleDayText=day.getText();
			
			//The Date which is selected is it displayed on the application or not 
			daySelect.selectByVisibleText(visibleDayText);
			
			//if selected date is same as displayed date then   
			if (day.isSelected()) {
				System.out.println("Pass :- "+visibleDayText+" is selected");
			}
			
		}
		
		
		WebElement monthDropDown= driver.findElement(By.id("month"));
		Select monthSelect=new Select(monthDropDown);
		List<WebElement>  allMonthOptionElements  =monthSelect.getOptions();
		for (WebElement months : allMonthOptionElements) {
		String visibleMonthText=months.getText();
		monthSelect.selectByVisibleText(visibleMonthText);
		if (months.isSelected()) {
			System.out.println("Pass:- "+visibleMonthText+" is selected");	
			
		}
		else {
			System.out.println("Fail:- "+visibleMonthText+" is not selected");
		}
		
	}
		
		
		WebElement yearDropDown= driver.findElement(By.id("year"));
		Select yearSelect=new Select(yearDropDown);		
		List<WebElement> allYearsOptioElements=yearSelect.getOptions();
		for (WebElement years : allYearsOptioElements) {
			String visibleYearText=years.getText();
			yearSelect.selectByVisibleText(visibleYearText);
			if (years.isSelected()) {
				System.out.println("Pass :- "+visibleYearText+" is Selected");
				
			}
			else {
				System.out.println("Fail:- "+visibleYearText+" is selected");
			}
			
		}
		
		driver.quit();
		
	}
}
