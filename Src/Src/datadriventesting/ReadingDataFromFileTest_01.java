package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadingDataFromFileTest_01 {
	public static void main(String[] args) throws IOException {
		FileInputStream files= new FileInputStream("./testdata/commondata.properties");
		Properties propObject= new Properties();
		
		//propObject.load(InputStream inStream) is used.....
		propObject.load(files);
		
		String browserName= propObject.getProperty("browser");
		String urlData= propObject.getProperty("url");
		String usernameKeyValueString=propObject.getProperty("username");
		String passwordKeyValueString=propObject.getProperty("password");
		
		System.out.println("Browser key value : "+browserName);
		System.out.println("URL key value : "+urlData);
		System.out.println("Username key value : "+usernameKeyValueString);
		System.out.println("Password key value : "+passwordKeyValueString);
	}

}
