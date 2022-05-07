package testcases;

import org.testng.annotations.Test;

import utils.DP009;
import wrappers.GenericWrappers;

public class TC009 extends GenericWrappers {
	@Test(dataProvider="fetchData", dataProviderClass=DP009.class)
	public void formCWebsite(String u_id, String u_pwd, String u_repwd, String u_secques, String u_secans, String u_name, String u_gender, 
			String u_dob, String u_designation, String u_emailid, String u_mobile, String u_phone, String u_nationality, String name, 
			String capacity, String address, String state, String city_distr, String acco_type, String star_rat, String email, String mcontact, 
			String contact, String name_1, String address_1, String state_1, String citydistr_1, String emailid_1, String phoneno_1, 
			String mobile_1, String name_2, String address_2, String state_2, String citydistr_2, String emailid_2, String phoneno_2, 
			String mobile_2, String name_3, String address_3, String state_3, String citydistr_3, String emailid_3, String phoneno_3, 
			String mobile_3)
	{
		invokeApp("chrome", "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
		clickByLink("Sign Up (Registration)");
		waitProperty(2000);
		enterById("u_id", u_id);
		enterById("u_pwd", u_pwd);
		enterById("u_repwd", u_repwd);
		selectIndexById("u_secques", 4);
		waitProperty(3000);
		enterById("u_secans", u_secans);
		enterById("u_name", u_name);
		selectVisibileTextById("u_gender", u_gender);
		waitProperty(3000);
		enterById("u_dob", u_dob);
		enterById("u_designation", u_designation);
		enterById("u_emailid", u_emailid);
		enterById("u_mobile", u_mobile);
		enterById("u_phone", u_phone);
		selectVisibileTextById("u_nationality", u_nationality);
		waitProperty(3000);
		enterById("name", name);
		enterById("capacity", capacity);
		enterById("address", address);
		selectVisibileTextById("state", state);
		waitProperty(3000);
		selectVisibileTextById("city_distr", city_distr);
		waitProperty(3000);
		selectVisibileTextById("acco_type", acco_type);
		waitProperty(3000);
		selectVisibileTextById("star_rat", star_rat);
		waitProperty(3000);
		enterById("email", email);
		enterById("mcontact", mcontact);
		enterById("contact", contact);
		pageDownByXpath("//html/body");
		enterByName("name_o", name_1); // first guest
		enterByName("address_o", address_1);
		selectVisibileTextById("state_o", state_1);
		waitProperty(3000);
		selectVisibileTextById("citydistr_o", citydistr_1);
		enterByName("emailid_o", emailid_1);
		enterByName("phoneno_o", phoneno_1);
		enterByName("mobile_o", mobile_1);
		waitProperty(3000);
		clickByXpath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[2]/tbody/tr/td[2]/input"); // add button
		enterByName("name_o", name_2); //second guest
		enterByName("address_o", address_2);
		selectVisibileTextById("state_o", state_2);
		waitProperty(3000);
		selectVisibileTextById("citydistr_o", citydistr_2);
		enterByName("emailid_o", emailid_2);
		enterByName("phoneno_o", phoneno_2);
		enterByName("mobile_o", mobile_2);
		clickByXpath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[2]/tbody/tr/td[2]/input"); //add
		enterByName("name_o", name_3);
		enterByName("address_o", address_3);
		selectVisibileTextById("state_o", state_3);
		waitProperty(2000);
		selectVisibileTextById("citydistr_o", citydistr_3);
		enterByName("emailid_o", emailid_3);
		enterByName("phoneno_o", phoneno_3);
		enterByName("mobile_o", mobile_3);
		clickByXpath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[2]/tbody/tr/td[2]/input");
		closeAllBrowsers();
		}
}
