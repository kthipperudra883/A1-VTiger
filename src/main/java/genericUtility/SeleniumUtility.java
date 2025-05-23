package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * This is a utility class which contains components from Selenium library
 * @author Rudra
 * @version 25.03.07
 */
public class SeleniumUtility {
	/**
	 * This is a generic method to access a web application
	 * @param driver
	 * @param url
	 */
	public void navigateToApplication(WebDriver driver,String url)
	{
		driver.get(url);
	
	}
	/**
	 * This is a generic method maximize the browser
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * This is a generic method to provide the implicit wait
	 * @param driver
	 * @param maxTime
	 */
	public void implicitWait(WebDriver driver, int maxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
		
	}
	/////////Mouse Actions////////
	/**
	 * This is a generic method to scroll the webpage to a webelement
	 * @param driver
	 * @param element
	 */
	public void scrollingOperation(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}
	/**
	 * This is a generic method to perform mouse hovering action on a webelement
	 * @param driver
	 * @param element
	 */
	public void mouseHoveringAction(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
	act.moveToElement(element).perform();
	
	}
	/**
	 * This is a generic method to perform double click operation on a webelement
	 * @param driver
	 * @param element
	 */
	public void doubleClickOperation(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
   /////////Handling Alert////////
	/**
	 * This is a generic method to accept alert popup
	 * @param driver
	 */
	public void acceptAlert (WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * This is a generic method to cancel the Alert
	 * @param driver 
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		
	}
	/**
	 *  This is a generic method to get alert popup message
	 * @param driver 
	 */
	public void getAlert(WebDriver driver) {
		driver.switchTo().alert().getText();
		
	}
	public void sendValueToAlert(WebDriver driver, String value) {
		driver.switchTo().alert().sendKeys(value);
		
		
	}
	/////////Handling Duration///////
	/**
	 *  This is a generic method to select an option in dropdown using it's index 
	 * @param element
	 * @param index
	 */
	public void selectOptionByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
		
	}
	/**
	 *   This is a generic method to select an option in dropdown using it's value attribute
	 * @param element
	 * @param value
	 */
	public void selectOptionByIndex(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
		
	}
	/**
	 *   This is a generic method to select an option in dropdown using it's visible text
	 * @param element
	 * @param visibleText
	 */
	public void selectOptionByVisibleText(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}
	 ////////Taking Screenshot/////////
	/**
	 *This is a generic method to take the screenshot of the webpage
	 * @param driver
	 * @param dateTimeStamp
	 * @return
	 * @throws IOException
	 */
	public String takeScreenshot(WebDriver driver, String dateTimeStamp) throws IOException {
	   TakesScreenshot ts=(TakesScreenshot)driver;
       File src = ts.getScreenshotAs(OutputType.FILE);
       File dest = new File(".\\Screenshots\\image -"+dateTimeStamp+".png");
       Files.copy(src, dest);
       return dest.getAbsolutePath(); // For Listeners
	
}
	
	
	
}
