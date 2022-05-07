package testcases;

import org.testng.annotations.Test;

import utils.DP003;
import wrappers.GenericWrappers;

public class TC003 extends GenericWrappers{
    
	@Test(dataProvider="fetchData", dataProviderClass=DP003.class)
	public void panIndWebsite(String panTitle, String panFirstName, String panMiddleName, String panLastName, String fatherFirstName, String fatherMiddleName, String fatherLastName,
			String mobileNumber, String email, String sourceofIncome, String pandob, String addressline1, String addressline2, String cityname, String panState, String pincode,
			String officename, String officeaddressline1, String officeaddressline2, String officecityname, String officepincode, String officestate, String identityproof, 
			String addressproof, String DOBproof, String aadhaarproof, String officeaddressproof) {
	invokeApp("chrome","https://panind.com/india/new_pan/");
	waitProperty(2000);
	selectVisibileTextById("pan_title", panTitle);
	enterById("pan_firstname", panFirstName);
	enterById("pan_middlename", panMiddleName);
	enterById("pan_lastname", panLastName);
	enterById("pan_fatherfirstname", fatherFirstName);
	enterById("pan_fathermiddlename", fatherMiddleName);
	enterById("pan_fatherlastname", fatherLastName);
	enterById("pan_mobilenumber", mobileNumber);
	enterById("pan_email", email);
	clickById("office");
	selectVisibileTextById("pan_sourceofincome", sourceofIncome);
	enterByName("pan_dob", pandob);
	waitProperty(5000);
	//resident address
	enterById("pan_addressline1", addressline1);
	enterByName("pan_addressline2", addressline2);
	enterByName("pan_cityname", cityname);
	selectVisibileTextById("pan_state", panState);
	enterByName("pan_pincode", pincode);
	// office address
	pageDownByXpath("//html/body");
	enterByName("pan_officename", officename);
	enterByName("pan_officeaddressline1", officeaddressline1);
	enterByName("pan_officeaddressline2", officeaddressline2);
	enterByName("pan_officecityname", officecityname);
	enterByName("pan_officepincode", officepincode);
	selectVisibileTextById("pan_officestate", officestate);
	pageDownByXpath("//html/body");
	selectVisibileTextById("pan_identityproof", identityproof);
	waitProperty(2000);
	selectVisibileTextById("pan_addressproof", addressproof);
	waitProperty(2000);
	selectVisibileTextById("pan_DOBproof", DOBproof);
	selectVisibileTextById("pan_aadhaarproof", aadhaarproof);
	selectVisibileTextById("pan_officeaddressproof", officeaddressproof);
	clickById("pan_source");
	//closeAllBrowsers();
	}
}
