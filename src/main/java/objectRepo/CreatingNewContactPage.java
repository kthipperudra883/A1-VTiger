package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is Creating New Contact POM class
 * @author Rudra
 * @version 25.03.11
 */
public class CreatingNewContactPage {
	/**
	 * Locating the WebElements
	 */
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement titleTextField;
	
	@FindBy(xpath="//input[@name='department']")
	private WebElement departmentTextField;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileTextField;
	
	@FindBy(xpath="//input[@name='mailingcity']")
	private WebElement mailingcityTextField;
	
	@FindBy(xpath="//input[@name='mailingstate']")
	private WebElement mailingstateTextField;
	
	@FindBy(xpath="//input[@name='mailingcountry']")
	private WebElement mailingcountryTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	//initializing WebElement
	public CreatingNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/**
	 * Getters method
	 * @return
	 */

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getDepartmentTextField() {
		return departmentTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getMailingcityTextField() {
		return mailingcityTextField;
	}

	public WebElement getMailingstateTextField() {
		return mailingstateTextField;
	}

	public WebElement getMailingcountryTextField() {
		return mailingcountryTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create a new contact
	 * @param lName
	 * @param title
	 * @param department
	 */
	public void CreateNewContact(String lName, String title, String department) {
		getLastNameTextField().sendKeys(lName);
		getTitleTextField().sendKeys(title);
		getDepartmentTextField().sendKeys(department);
		getSaveButton().click();
		
	}
	/**
	 * This is a business library to create a new contact
	 * @param lName
	 * @param email
	 * @param mobile
	 * @param mailingCity
	 */
	public void CreateNewContact(String lName, String email, String mobile, String mailingCity) {
		getLastNameTextField().sendKeys(lName);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getMailingcityTextField().sendKeys(mailingCity);
		getSaveButton().click();
	}
	/**
	 * This is a business library to create a new contact
	 * @param lName
	 * @param email
	 * @param mobile
	 * @param mailingCity
	 * @param mailingState
	 * @param mailingCountry
	 */
	public void CreateNewContact(String lName, String email, String mobile, String mailingCity, String mailingState, String mailingCountry) {
		getLastNameTextField().sendKeys(lName);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getMailingcityTextField().sendKeys(mailingCity);
		getMailingstateTextField().sendKeys(mailingState);
		getMailingcountryTextField().sendKeys(mailingCountry);
		getSaveButton().click();
	}
}

	 


