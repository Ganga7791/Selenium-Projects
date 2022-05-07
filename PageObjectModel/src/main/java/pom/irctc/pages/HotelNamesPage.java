package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelNamesPage extends GenericWrappers{
	
	public SpecificHotelPage clickOnHotel() {
		
		clickByXpath("(//div[@class='filtersearch-packages ng-star-inserted']//a//@href)[1]");
		return new SpecificHotelPage();
	}

}
