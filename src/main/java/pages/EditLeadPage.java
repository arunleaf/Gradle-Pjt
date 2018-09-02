package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{

	public EditLeadPage typeupdatecompanyName(String data) {
		WebElement eleupdatecompanyName = locateElement("id", "updateLeadForm_companyName");
		click(eleupdatecompanyName);
		return this;
	}
	public EditLeadPage clickupdatebutton() {
		WebElement updatebutton = locateElement("class", "smallSubmit");
		click(updatebutton);
		return this;
	}
	
}









