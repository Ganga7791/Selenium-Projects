package pom.testcases;

import pom.irctc.pages.CovidAlertPage;

public class TC004 {
	
	public void IrctcRegistration() {
		
		new CovidAlertPage()
		.clickOnOk()
		.clickOnRegister()
		.enterUserName("Ganga")
		.enterUserPwd("Alliswell")
		.enterConfirmPwd("Alliswell")
		.selectPreferredLanguage("English")
		.selectSecurityQuestion("What is your pet name")
		.selectSecurityQuestion("Rosiee")
		.clickContinue()
		.enterFirstName("Ganga")
		.enterLastName("Rajendran")
		.selectOccupation("PRIVATE")
		.enterDOB("23-12-1992")
		.clickOnMarritalStatus()
		.selectCountry("India")
		.selectGender("Female")
		.enterEmailId("ganga889@gmail.com")
		.enterPhoneNumber("7894561236")
		.clickOnContinueAgain()
		.enterFlatNum("NO 12")
		.enterStreet("GANDHI Street")
		.enterLocality("Chennai")
		.enterPincode("600063")
		.enterState("Tamil Nadu")
		.selectCity("Kanchipuram")
		.selectPostOffice("Srinivasanagar East B.O")
		.enterPhoneNo("9632587412")
		.clickOnContinueAgain()
		.enterOfficeFlatNum("989")
		.enterOfficeStreet("Soutth street")
		.enterOfficeLocality("Chennai")
		.selectOfficeCountry("India")
		.enterOfficePincode("600042")
		.enterOfficeState("Tamil Nadu")
		.selectOfficeCity("Chennai")
		.selectOfficePostOffice("Velacheri S.O")
		.enterOfficePhoneNumber("7412365898")
		.clickOnAgreement();
		
	}

}
