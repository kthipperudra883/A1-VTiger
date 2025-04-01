package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is a contacts page POM class
 * @author Rudra
 * @version 25.03.11
 */
public class Contactspage {
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createNewContactIcon;
	
	public Contactspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreateNewContactIcon() {
		return createNewContactIcon;
	}
	
	/**
	 * This is a business library to click on create new contact icon
	 */
	public void clickCreateNewContactIcon() {
		getCreateNewContactIcon().click();
		
	}

}
