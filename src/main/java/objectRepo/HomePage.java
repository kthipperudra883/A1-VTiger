package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[text()='Leads' and @href='index.php?module=Leads&action=index']") 
	private WebElement leadsMenu;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactMenu;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountIcon;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement siggnOutOption;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getContactMenu() {
		return contactMenu;
	}

	public WebElement getAccountIcon() {
		return accountIcon;
	}

	public WebElement getSiggnOutOption() {
		return siggnOutOption;	
	}
	/**
	 * This is business library which clicks on lead menu
	 */
	public void clickOnLeadsMenu()
	{
		getLeadsMenu().click();
	}
	/*
	 * This is a business library which clicks on Contacts menu
	 */
	public void clickOnContactsMenu()
	{
		getContactMenu().click();
	}
	/**
	 * This is a business library to perform sign out operation
	 * @param driver
	 */
	public void signOutOperation(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(getAccountIcon()).perform();
		getSiggnOutOption().click();
	}
	
}
