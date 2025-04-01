package testCaseRepo;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_002 extends BaseClass {
	
	@Test(groups={"Sanity"})
	public void LE_002() throws Exception, IOException {
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		
		String fName = eUtil.getDataFromExcelFile("Leads",5, 1);
		String lName = eUtil.getDataFromExcelFile("Leads", 5, 2);
		String company = eUtil.getDataFromExcelFile("Leads", 5, 3);
		String title = eUtil.getDataFromExcelFile("Leads", 5, 4);
		String mobile = eUtil.getDataFromExcelFile("Leads", 5, 5);
		String email = eUtil.getDataFromExcelFile("Leads", 5, 6);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.CreateNewLead(fName, lName, company, title, mobile,email);
		
	}


}
