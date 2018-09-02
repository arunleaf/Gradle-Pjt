package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	
	}
	
	@CacheLookup
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompanyName;
	

	public CreateLeadPage typeCompanyName(String data) {
		//WebElement eleCompanyName = locateElement("id", "createLeadForm_companyName");
		type(eleCompanyName, data);
		return this;
	}
	
	@CacheLookup
	@FindBys( {
		   @FindBy(id = "createLeadForm_firstName"),
		   @FindBy(name = "Firstname")
		} )
	WebElement eleFirstName;
	
	
	public CreateLeadPage typeFirstName	(String data) {
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		type(eleFirstName, data);
		return this;
	}
	public CreateLeadPage typeLastName	(String data) {
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName, data);
		return this;
	}
	
	public EditLeadPage clickCreateLead() {
		WebElement eleCreateLead= locateElement("class", "smallSubmit");
		click(eleCreateLead);
		return new EditLeadPage(); 
		
		
	}
	
}









