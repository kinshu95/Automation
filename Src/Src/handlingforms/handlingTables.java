package handlingforms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingTables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.com/contact.html");
		System.out.println(driver.findElement(By.xpath("//div/table//tr[6]/td")).getText());
		WebElement table=driver.findElement(By.cssSelector("table[class='responsive-table']"));
		
		
		
		
		
		//Parent Element ----> Table
		/*WebElement trainTable =driver.findElement(By.xpath("//div/table"));      //div/table//tr[6]/td[text()='Buddhist train']     table[class='responsive-table']
		
		//Parent Element -----> Last row of the table
		WebElement lastRowData= trainTable.findElement(By.xpath("(//tbody/tr)[6]"));
		
		System.out.println(lastRowCellData.size());
		System.out.println("Printing the contents :-");
		for (WebElement cellData : lastRowCellData) {
		String cellValue =cellData.getText();
		System.out.println("");
		
			
		}*/
		driver.quit();
	}
}
