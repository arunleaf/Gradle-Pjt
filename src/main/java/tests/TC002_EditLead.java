package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.FindLeadPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import wdMethods.ProjectMethods;

public class TC002_EditLead extends ProjectMethods {
	
	@BeforeClass(groups="common")
	public void setData() {
		testCaseName = "TC002_EditLead";
		testCaseDescription ="Edit a lead";
		category = "Smoke";
		author= "Babu";
		dataSheetName="TC002";
	}
	@Test(dataProvider="fetchData")
	public  void editLead(String PhoneNumber, String UpdateCompanyName)  throws InterruptedException {
			
		new MyHomePage()
		.clickLeads()
		.clickFindLead()
		.clickPhone()
		.typephoneNumber(PhoneNumber)
		.clickSearchLeadID()
		.clickLeadID()
		.clickEdit()
		.typeupdatecompanyName(UpdateCompanyName);
	}

}
