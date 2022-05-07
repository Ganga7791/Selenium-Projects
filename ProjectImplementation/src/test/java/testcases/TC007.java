package testcases;

import org.testng.annotations.Test;

import utils.DP007;
import wrappers.GenericWrappers;

public class TC007 extends GenericWrappers {
	@Test(dataProvider="fetchData", dataProviderClass=DP007.class)
	public void bookHotelsOTPValidation(String email, String mobileNo, String filterText, String firstName, String lastName)
	{
		invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		clickByLink("HOLIDAYS");
		waitProperty(3000);
		clickByLink("Stays");
		waitProperty(3000);
		clickByLink("Lounge");
		waitProperty(3000);
		switchToLastWindow();
		clickByLink("Hotels");
		waitProperty(3000);
		switchToLastWindow();
		clickByLink("Login");
		waitProperty(3000);
		clickByLink("Guest User Login");
		waitProperty(3000);
		enterByName("email", email);
		enterByName("mobileNo", mobileNo);
		waitProperty(2000);
		clickByXpath("//*[@id=\"profile\"]/div/form/div[3]/button"); // sign in 
		waitProperty(2000);
		enterById("filterText", filterText);
		waitProperty(2000);
		clickByXpath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[1]/a/div[1]/span");
		waitProperty(3000);
		clickByName("dt12");
		waitProperty(3000);
		clickByXpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[4]/span");
		clickByName("dt13");
		waitProperty(3000);
		clickByXpath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[6]/span");
		waitProperty(3000);
		clickById("user-data-wrapper-id");
		selectVisibileTextByXpath("//*[@id=\"user-data-wrapper\"]/div[1]/div[1]/select", "1"); // Room dropdown
		waitProperty(3000);
		selectVisibileTextByXpath("//*[@id=\"user-data-wrapper\"]/div[1]/div[2]/select", "3");  // adult dropdown
		waitProperty(3000);
		clickByXpath("//*[@id=\"user-data-wrapper\"]/div[2]/button"); //done button
		waitProperty(3000);
		clickByXpath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[5]/button"); //find hotel
		waitProperty(3000);
		getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[1]/div/h5"); // print hotel name
		waitProperty(3000);
		getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div/div[1]/div[2]"); // print price in console
		waitProperty(3000);
		clickByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/button/b"); // click on cont button
		waitProperty(3000);
		selectValueByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[1]/select", "3"); //title dropdown
		enterByName("firstName", firstName);
		enterByName("lastName", lastName);
		waitProperty(3000);
		selectVisibileTextByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[4]/select", "India");
		selectVisibileTextByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[5]/select", "TAMIL NADU");
		selectVisibileTextByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[8]/select", "No");
		verifyTextByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[1]/div/div/h5", "COSMOPOLITAN HOTEL MADURAI");
		clickByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[9]/button[2]"); //Click Go
		waitProperty(3000);
		clickByXpath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[1]/ul/li/label/span"); //Click Agree
		waitProperty(3000);
		clickByXpath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[2]/button[2]"); // Make Payment
		waitProperty(3000);
		clickByXpath("//*[@id=\"modalOTP\"]/div/div/form/div/div[2]/button"); // click OTP verify button
		verifyTextByXpath("//*[@id=\"modalOTP\"]/div/div/form/div/div[1]/span", "otp is required.");
		closeAllBrowsers();	
	}
}
