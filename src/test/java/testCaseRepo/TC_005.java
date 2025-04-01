package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.Contactspage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_005 extends BaseClass {
	@Test(groups= {"Regression", "Smoke"})
	public void CO_005() throws Exception
	{	
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();

		Contactspage cp = new Contactspage(driver);
	    cp.clickCreateNewContactIcon();
		
		String lName = eUtil.getDataFromExcelFile("Contacts", 5, 1);
		String email = eUtil.getDataFromExcelFile("Leads", 5, 2);
		String mobile = eUtil.getDataFromExcelFile("Leads", 5, 3);
		String mailingCity = eUtil.getDataFromExcelFile("Leads", 5, 4);
		
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.CreateNewContact(lName, email, mobile, mailingCity);
		
	}	

	
	}	

		



