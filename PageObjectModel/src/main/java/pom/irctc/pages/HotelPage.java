package pom.irctc.pages;

public class HotelPage extends HomePage {
	
	public HotelPage clickOnLogin() {
		clickByXpath("//a[contains(text(),'Login')]");
		return this;
	}
	
	public HotelPage clickOnGuestLogin() {
		clickByXpath("//a[@id='profile-tab']");
		return this;
	}
	
	public HotelPage enterEmail(String data) {
		enterByXpath("//input[@name='email']", data);
		return this;
	}
	
	public HotelPage enterMobile(String data) {
		enterByXpath("//input[@name='mobileNo']", data);
		return this;
	}
	
	public HotelPage clickOnLoginButton(){
		clickByXpath("//button[contains(text(),'Login')]");
		return this;
	}

	public HotelPage enterHotel(String data) {
		enterByXpath("//input[@id='filterText']", data);
		return this;
	}
	
	public HotelPage clickOnStartDate() {
		clickByXpath("//input[@name='dt12']");
		clickByXpath("(//td[@class='owl-dt-calendar-cell owl-dt-day-1 ng-star-inserted'])[3]");
		return this;
	}
	
	public HotelPage clickOnEndDate() {
		clickByXpath("//input[@name='dt13']");
		clickByXpath("(//td[@class='owl-dt-calendar-cell owl-dt-day-3 ng-star-inserted'][3]");
		return this;
	}
	
	public HotelPage clickOnRoomGuest() {
		clickByXpath("//input[@id='user-data-wrapper-id']");
		return this;
	}
	
	public HotelPage selectRoom(String data) {
		selectVisibileTextByXpath("//select[@name='hotelRoom']", data);
		return this;
	}
	
	public HotelPage selectGuest(String data) {
		selectVisibileTextByXpath("//select[@name='hotelAdult']", data);
		return this;
	}
	
	public HotelPage selectChild(String data) {
		selectVisibileTextByXpath("//select[@name='hotelChild']", data);
		return this;
	}
	
	public HotelPage clickOnDone() {
		clickByXpath("//button[contains(text(),'Done')]");
		return this;
	
	}
	
	public HotelNamesPage clickFindHotel() {
		clickByXpath("//button[contains(text(),'Find Hotel')]");
		return new HotelNamesPage();
	}
	
}
