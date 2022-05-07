package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	
	public CharterPage clickOnEnquiryForm() {
		
		clickByXpath("//input[@id='enquiry-tab']");
		return this;
	}
	
	public CharterPage enterName(String data) {
		
		enterByXpath("//input[@name='name']", data);
		return this;
	}
	
	public CharterPage enterOrganisation(String data) {
		
		enterByXpath("//input[@name='organization']", data);
		return this;
	}
	
	public CharterPage enterMobile(String data) {
		
		enterByXpath("//input[@name='mobile']", data);
		return this;
	}
	
	public CharterPage enterEmail(String data) {
		
		enterByXpath("//input[@name='email']", data);
		return this;
	}
	
	public CharterPage selectRequest(String data) {
		
		selectVisibileTextByXpath("//select[@name='requestFor']", data);
		return this;
	}
	
	public CharterPage enterOriginStation(String data) {
		
		enterByXpath("//input[@name='originStation']", data);
		return this;
	}
	
	public CharterPage enterDestStation(String data) {
		
		enterByXpath("//input[@name='destnStation']", data);
		return this;
	}
	
	public CharterPage clickOnDeparturedate() {
		
		clickByXpath("//input[@name='checkInDate']");
		clickByXpath("//span[contains(text(),'28')]");
		return this;
	}
	
	public CharterPage clickOnDArrivalDate() {
		
		clickByXpath("//input[@name='checkOutDate']");
		clickByXpath("//span[contains(text(),'31')]");
		return this;
	}
	
	public CharterPage enterDuration(String data) {
		
		enterByXpath("//input[@name='durationPeriod']", data);
		return this;
	}
	
	public CharterPage enterNumberOfCoaches(String data) {
		
		enterByXpath("//input[@name='coachDetails']", data);
		return this;
	}
	
	public CharterPage enterPassengerCount(String data) {
		
		enterByXpath("//input[@name='numPassenger']", data);
		return this;
	}
	
	public CharterPage enterPurpose(String data) {
		
		enterByXpath("//input[@name='charterPurpose']", data);
		return this;
	}
	
	public CharterPage enterAdditonalServies(String data) {
		
		enterByXpath("//input[@name='services']", data);
		return this;
	}
	
	
}
