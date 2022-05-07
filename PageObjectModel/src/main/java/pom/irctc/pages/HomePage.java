package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public RegistrationPage clickOnRegister() {
		
		clickByXpath("//a[contains(text(),'REGISTER')]");
		return new RegistrationPage();
		
	}
	
	public HomePage mouseHoverOnHolidays() {
		clickByXpath("//a[contains(text(),'HOLIDAYS')]");
		return this;
	}


	public HomePage mouseHoverOnStays() {
		
		clickByXpath("//a[contains(text(),'STAYS')]");
		return this;
	}
	
	public AccommodationPage clickOnLounge() {
		
		clickByXpath("//span[contains(text(),'Lounge')]");
		return new AccommodationPage();
	}

	public HotelPage clickOnHotels() {
		
		clickByXpath("(//div[@class='Nav-icons IRCTCHotels']//parent::a//@href)[1]");
		return new HotelPage();
	}
}
