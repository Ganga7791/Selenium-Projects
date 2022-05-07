package testcases;

import org.testng.annotations.Test;

import utils.DP004;
import wrappers.GenericWrappers;

public class TC004 extends GenericWrappers{
	
	@Test(dataProvider="fetchData", dataProviderClass=DP004.class)
	public void irctcSignUp(String userName, String usrPwd, String cnfUsrPwd, String firstName, String middleName, String lastname, String email, String mobile, String resAddress1,
			String resAddress2, String resAddress3, String resPinCode, String resState, String resPhone, String offAddress1, String offAddress2, String offAddress3, String offPinCode, 
			String offState, String offCity, String offPostOff, String offPhone) 
	{	
		invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		clickByLink("REGISTER");
		waitProperty(2000);
		pageDownByXpath("//html/body");
		enterById("userName", userName);
		enterById("usrPwd", usrPwd);
		enterById("cnfUsrPwd", cnfUsrPwd);
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown");
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li");
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div");
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li/span");
		enterByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input", "Surfing");
		waitProperty(2000);
		clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
		waitProperty(2000);
		enterById("firstName", firstName);
		enterById("middleName", middleName);
		enterById("lastname", lastname);	
		clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div");
		clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li");
		waitProperty(2000);
		clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input");
		waitProperty(2000);
		selectVisibileTextByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[1]", "October");
		waitProperty(2000);
		selectVisibileTextByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]","1991");
		waitProperty(2000);
		clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[2]/td[5]/a");
		waitProperty(2000);
		clickByXpath("//*[@id=\"unmarried\"]/div/div[2]/span");
		waitProperty(2000);
		clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[2]");
		enterById("email", email);
		enterById("mobile", mobile);
		selectValueByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select", "94");
		clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
		enterById("resAddress1", resAddress1);
		enterById("resAddress2", resAddress2);
		enterById("resAddress3", resAddress3);
		enterByName("resPinCode", resPinCode);
		enterById("resState", resState);
		selectVisibileTextByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[6]/select", "Coimbatore");
		selectVisibileTextByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select", "Kavundampalayam B.O");
		enterById("resPhone", resPhone);
		clickByXpath("//*[@id=\"no\"]/div/div[2]");
		enterById("offAddress1", offAddress1);
		enterById("offAddress2", offAddress2);
		waitProperty(1000);
		enterById("offAddress3", offAddress3);
		clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[3]/span");
		clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[105]/li");
		enterById("offPinCode", offPinCode);
		enterById("offState", offState);
		enterById("offCity", offCity);
		enterById("offPostOff", offPostOff);
		enterById("offPhone", offPhone);
		pageDownByXpath("//html/body");
		waitProperty(2000);
		clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[13]/span[1]");
		waitProperty(2000);
		closeAllBrowsers();
	}
}
