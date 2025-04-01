package sample;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class fetchingdatafrompropertiesfile {

	public static void main(String[] args) throws IOException, Throwable {
	WebDriver driver=new ChromeDriver();
//	FileInputStream fis = new FileInputStream("C:\\Users\\kthip\\OneDrive\\Documents\\CommonTestData.Properties");
//	Properties prop=new Properties();
//	prop.load(fis);
//	String value=prop.getProperty("url");
//	String UN=prop.getProperty("username");
//	String PWD=prop.getProperty("password");
		PropertiesUtility pUtil = new PropertiesUtility();
		String value=pUtil.getDataFromPropertiesFile("url");
		driver.get(value);
		String UN = pUtil.getDataFromPropertiesFile("username");
		String PWD = pUtil.getDataFromPropertiesFile("password");
		driver.findElement(By.name("user_name")).sendKeys(UN, Keys.TAB, PWD, Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	

	}

}
