package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{
	
	public AccommodationPage clickLogin() {
		clickByXpath("//a[@class='nav-link loginicon']");
		
		return new AccommodationPage();
	}

	public FTRServicePage clickBookYourCoach() {
		clickByXpath("//li//a[contains(text(),'Book Your Coach/Train')]");
		return new FTRServicePage();
	}	
}

