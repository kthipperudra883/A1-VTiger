package testCaseRepo;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_001 extends BaseClass {
	@Test(groups={"Smoke","Sanity"})
	public void LE_001() throws Exception, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		
		String fName = eUtil.getDataFromExcelFile("Leads", 2, 1);
		String lName = eUtil.getDataFromExcelFile("Leads", 2, 2);
		String company = eUtil.getDataFromExcelFile("Leads", 2, 3);
	//	Assert.fail();
		
		CreatingNewLeadPage cnp = new CreatingNewLeadPage(driver);
		cnp.createNewLead(fName, lName, company);
		
	}
	@Test
	public void demo()
	{
		System.out.println("Hi");
	}
	
	
}


