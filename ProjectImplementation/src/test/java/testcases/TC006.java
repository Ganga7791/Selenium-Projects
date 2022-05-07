package testcases;

import org.testng.annotations.Test;

import utils.DP006;
import wrappers.GenericWrappers;

public class TC006 extends GenericWrappers{
	@Test(dataProvider="fetchData", dataProviderClass=DP006.class)
	public void saloonMandatoryCheck(String name, String organization, String address, String mobile, String email, String originStation, String destnStation, 
			String checkInDate, String checkOutDate, String durationPeriod, 
			String coachDetails, String numPassenger, String charterPurpose, String services)
	{
		invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		clickByLink("HOLIDAYS");
		waitProperty(2000);
		clickByLink("Stays");
		waitProperty(2000);
		clickByLink("Lounge");
		waitProperty(2000);
		switchToLastWindow();
		clickById("sidebarCollapse");
		waitProperty(2000);
		clickByLink("Charter");
		clickByXpath("//*[@id=\"dismiss\"]");
		waitProperty(2000);
		clickById("enquiry-tab");
		waitProperty(2000);
		enterByName("name", name);
		enterByName("organization", organization);
		enterByName("address", address);
		enterByName("mobile", mobile);
		enterByName("email", email);
		selectVisibileTextByXpath("//*[@id=\"enquiry\"]/div/form/div/div[6]/select", "Saloon Charter");
		enterByName("originStation", originStation);
		enterByName("destnStation", destnStation);
		enterByName("checkInDate", checkInDate);
		clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[4]/td[4]/span");
		enterByName("checkOutDate", checkOutDate);
		clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/tbody/tr[5]/td[4]/span");
		enterByName("durationPeriod", durationPeriod);
		enterByName("coachDetails", coachDetails);
		enterByName("numPassenger", numPassenger);
		enterByName("charterPurpose", charterPurpose);
		enterByName("services", services);
		pageDownByXpath("//html/body");
		clickByXpath("/html/body/app-root/ng-component/div[2]/div/div/div/div[2]/div/form/div/div[17]/button");
		verifyTextByXpath("//*[@id=\"enquiry\"]/div/form/div/div[4]/span", "Mobile no. not valid");
		closeAllBrowsers();
	}
}
