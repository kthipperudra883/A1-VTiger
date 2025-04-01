package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.Contactspage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_004 extends BaseClass {
	
	@Test(groups= {"Regression", "Smoke"})
	public void CON_001() throws EncryptedDocumentException, IOException {
		
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		
		Contactspage cp = new Contactspage(driver);
		cp.clickCreateNewContactIcon();
		
		String lName = eUtil.getDataFromExcelFile("contacts", 2, 1);
		String title = eUtil.getDataFromExcelFile("contacts", 2, 2);
		String dept = eUtil.getDataFromExcelFile("contacts", 2, 3);
		
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.CreateNewContact(lName, title,dept);
		
	}


}
