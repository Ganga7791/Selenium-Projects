package pom.facebook;

import wrappers.GenericWrappers;

public class FacebookAcct extends GenericWrappers {
	
	public FacebookAcct clickonCreate() {
		
		clickByXpath("//a[@data-testid='open-registration-form-button']");
		return this;
	}
	
	public FacebookAcct enterFirstName(String data) {
		
		enterByXpath("//input[@name='firstname']", data);
		return this;
	}

	public FacebookAcct enterSurName(String data) {
		
		enterByXpath("//input[@name='lastname']", data);
		return this;
	}
	
	public FacebookAcct enterEmail(String data) {
		
		enterByXpath("//input[@name='reg_email__']", data);
		return this;
	}
	
	public FacebookAcct enterPassword(String data) {
		
		enterByXpath("//input[@name='reg_passwd__']", data);
		return this;
	}
	
	public FacebookAcct selectDate(String data) {
		
		selectVisibileTextByXpath("//select[@id='day']", data);
		return this;
	}
	
	public FacebookAcct selectMonth(String data) {
		
		selectVisibileTextByXpath("//select[@id='month']", data);
		return this;
	}
	
	public FacebookAcct selectYear(String data) {
		
		selectVisibileTextByXpath("//select[@id='year']", data);
		return this;
	}
	
	public FacebookAcct selectGender(String data) {
		
		selectVisibileTextByXpath("//select[@name='sex']", data);
		return this;
	}
}

