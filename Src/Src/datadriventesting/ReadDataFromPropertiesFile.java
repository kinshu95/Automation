package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.sql.CommonDataSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
		FileInputStream files= new FileInputStream("./testdata/commondata.properties");
		Properties propertiesObject =new Properties();
		
		//Loading File in the Compiler
		propertiesObject.load(files);
		
		//Retrieving the data from the file which is consist with URL
		String keysvalue = propertiesObject.getProperty("url");
		String browserString= propertiesObject.getProperty("browser");
		//Printing the data
		System.out.println("Value of URL key "+keysvalue);
		System.out.println("Value of URL key "+browserString);
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.quit();
	}

}
