package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a leads page POM class
 * @author Rudra
 * @version 25.03.10
 */
public class LeadsPage {
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement creatNewLeadIcon;
	
	public LeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/**
	 * initializig WebElements
	 * @return
	 */
	
	public WebElement getCreatNewLeadIcon() {
		return creatNewLeadIcon;
		
	}
	/**
	 * This is business library to click on Create New Lead icon
	 */
	public void clickOnCreateNewLeadIcon()
	{
		getCreatNewLeadIcon().click();
	}
	

}
