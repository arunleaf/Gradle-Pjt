package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{

	
	public FindLeadPage clickPhone() {
		WebElement elePhone = locateElement("xpath", "//span[text()='Phone']");
		click(elePhone);
		return this;
	}
	
	public FindLeadPage typephoneNumber(String date) {
		WebElement elePhone = locateElement("name", "phoneNumber");
		type(elePhone,date);
		return this;
	}
	public FindLeadPage clickSearchLeadID() throws InterruptedException {
		WebElement eleSearchLeadID= locateElement("xpath", "//button[text()='Find Leads']");
		click(eleSearchLeadID);
		Thread.sleep(2000);
		return this;
	}
	
	public ViewLead clickLeadID() {
		WebElement eleLeadID = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(eleLeadID);
		return new ViewLead();
	}
	
}









