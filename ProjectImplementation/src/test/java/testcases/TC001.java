package testcases;

import org.testng.annotations.Test;

import utils.DP001;
import wrappers.GenericWrappers;

public class TC001 extends GenericWrappers{

	@Test(dataProvider="fetchData",dataProviderClass=DP001.class)
	public void facebookSignup(String firstname, String lastname, String emailID, String confirmemailID, String pwd, String day, String month, String year) 
	{
		invokeApp("chrome", "https://www.facebook.com");		
		clickByLink("Create New Account");
		waitProperty(2000);
		enterByName("firstname", firstname);
		enterByName("lastname", lastname);
		enterByName("reg_email__", emailID);
		enterByName("reg_email_confirmation__", confirmemailID);
		enterByName("reg_passwd__", pwd);
		selectVisibileTextById("day", day);
		selectVisibileTextById("month", month);
		selectVisibileTextById("year", year);
		waitProperty(2000);
		clickByXpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input");
		closeAllBrowsers();
	}
}