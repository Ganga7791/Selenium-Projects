package testcases;

import org.testng.annotations.Test;

import utils.DP005;
import wrappers.GenericWrappers;

public class TC005 extends GenericWrappers {
	@Test(dataProvider="fetchData", dataProviderClass=DP005.class)
	public void bookYourCoach(String userId, String password, String cnfPassword, String secQstn, String secAnswer, String dateOfBirth, String occupation, String email, String fname, String mname, String lname, String natinality, String flatNo, String street, String area, String country, String mobile, String pincode, String city, String state, String postOffice, String flatNoOffice, String streetOffice, String areaOffice, String countryOffice, String mobileOffice, String pincodeOffice, String cityOffice, String stateOffice, String postOfficeOffice)
	{
		invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]");
		clickByLink("HOLIDAYS");
		clickByLink("Stays");
		clickByLink("Lounge");
		waitProperty(2000);
		switchToLastWindow();
		clickByXpath("//*[@id=\"sidebarCollapse\"]");
		clickByLink("Book Your Coach/Train");
		waitProperty(2000);
		switchToLastWindow();
		waitProperty(2000);
		clickByLink("New User? Signup");
		enterById("userId", userId);
		enterById("password", password);
		enterById("cnfPassword", cnfPassword);
		selectVisibileTextById("secQstn", secQstn);
		enterById("secAnswer", secAnswer);
		enterById("dateOfBirth", dateOfBirth);
		clickByLink("9");
		clickById("gender1");
		clickById("maritalStatus1");
		selectVisibileTextById("occupation", occupation);
		enterById("email", email);
		enterById("fname", fname);
		enterById("mname", mname);
		enterById("lname", lname);
		selectVisibileTextById("natinality", natinality);
		enterById("flatNo", flatNo);
		enterById("street", street);
		enterById("area", area);
		selectVisibileTextById("country", country);
		enterById("mobile", mobile);
		enterById("pincode", pincode);
		enterByXpath("/html/body", "Keys.PAGE_DOWN");
		selectVisibileTextById("city", city);
		selectVisibileTextById("state", state);
		selectVisibileTextById("postOffice", postOffice);
		clickById("sameAddresses1");
		enterByXpath("/html/body", "Keys.PAGE_DOWN");
		enterById("flatNoOffice", flatNoOffice);
		enterById("streetOffice", streetOffice);
		enterById("areaOffice", areaOffice);
		selectVisibileTextById("countryOffice", countryOffice);
		enterById("mobileOffice", mobileOffice);
		enterById("pincodeOffice", pincodeOffice);
		clickByXpath("//html/body");
		enterByXpath("/html/body", "Keys.PAGE_DOWN");
		selectVisibileTextById("cityOffice", cityOffice);
		waitProperty(1000);
		selectVisibileTextById("stateOffice", stateOffice);
		waitProperty(1000);
		selectVisibileTextById("postOfficeOffice", postOfficeOffice);
		waitProperty(2000);
		closeAllBrowsers();		
	}
}
