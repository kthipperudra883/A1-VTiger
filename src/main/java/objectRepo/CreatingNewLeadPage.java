package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewLeadPage {
	/**
	 * Locating WebElements
	 */
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstnameTextField;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastnameTextField;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyTextField;

	@FindBy(xpath="//input[@name='designation']")
	private WebElement titleTextField;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileTextField;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadSourceDropdown;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployessTextField;
	
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement cityTextField;
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement countryTextField;
	
	@FindBy(xpath="//input[@id='state']")
	private WebElement stateTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	/**
	 * initializing WebElements
	 * @param driver
	 */
	
	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	/**
	 * Getter methods
	 * @return
	 */

	
	public WebElement getFirstnameTextField() {
		return firstnameTextField;
	}

	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getLeadSourceDropdown() {
		return leadSourceDropdown;
	}

	public WebElement getNoOfEmployessTextField() {
		return noOfEmployessTextField;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getCountryTextField() {
		return countryTextField;
	}

	public WebElement getStateTextField() {
		return stateTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	/**
	 * This is a business library to create a new lead
	 * @param fName
	 * @param lName
	 * @param company
	 */
	
	
    public void createNewLead(String fName, String lName, String company) {
    
      getFirstnameTextField().sendKeys(fName);
      getLastnameTextField().sendKeys(lName);
      getCompanyTextField().sendKeys(company);
      getSaveButton().click();
    }
    /**
     * This is a business library to create a new lead
     * @param fName
     * @param lName
     * @param company
     * @param title
     * @param mobile
     * @param email
     */
    public void CreateNewLead(String fName,String lName,String company, String title, String mobile, String email) {
    
	getFirstnameTextField().sendKeys(fName);
	getLastnameTextField().sendKeys(lName);
	getCompanyTextField().sendKeys(company);
	getTitleTextField().sendKeys(title);
	getTitleTextField().sendKeys(mobile);
	getEmailTextField().sendKeys(email);
	getSaveButton().click();
	
    }
    /**
     * This is a business library to create a new lead
     * @param lName
     * @param company
     * @param leadSource DropDown
     * @param noOfemployees
     * @param city
     * @param country
     * @param state
     */
    
    public void CreateNewLead(String lName, String company,String leadsource,String noofemployees,String city,String country,String state) {
     
    getLastnameTextField().sendKeys(lName);
    getCompanyTextField().sendKeys(company);
    Select sel = new Select(leadSourceDropdown);;
    sel.selectByValue(leadsource);
    getNoOfEmployessTextField().sendKeys(noofemployees);
    getCityTextField().sendKeys(city);
    getCountryTextField().sendKeys(country);
    getStateTextField().sendKeys(state);
    getSaveButton().click();
    
 
    
   
	
	
	
}

	
	}




	


