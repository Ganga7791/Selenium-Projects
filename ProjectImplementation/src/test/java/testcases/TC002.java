package testcases;

import org.testng.annotations.Test;

import utils.DP002;
import wrappers.GenericWrappers;


public class TC002 extends GenericWrappers {
	
	@Test(dataProvider="fetchData", dataProviderClass=DP002.class)
	public void phpTravels(String firstname, String lastname, String email, String phonenumber, String companyname, String address1, String address2, String city, String postcode,
			String inputCountry, String customfield2, String stateselect, String password, String password2)
	{
	  invokeApp("chrome","https://www.phptravels.org/register.php");
	  waitProperty(2000);
	  enterByName("firstname", firstname);
	  enterByName("lastname", lastname);
	  enterByName("email", email);
	  enterByName("phonenumber", phonenumber);
	  enterByName("companyname", companyname);
	  enterByName("address1", address1);
	  enterByName("address2", address2);
	  enterByName("city", city);
	  enterByName("postcode", postcode);
	  waitProperty(2000);
	  selectVisibileTextById("inputCountry", inputCountry);
	  enterById("customfield2", customfield2); 
	  selectVisibileTextById("stateselect", stateselect);
	  pageDownByXpath("//html/body");
	  enterByName("password", password);
	  enterByName("password2", password2);
	  closeAllBrowsers();
	}
}
