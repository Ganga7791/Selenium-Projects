package pom.testcases;

import pom.panindia.PanIndia;;

public class TC002 {

	public void PanIndiaForm() {
		
		new PanIndia()
		.selectFullName("MS.")
		.enterFirstName("Ganga")
		.enterMiddleName("S")
		.enterLastName("Rajendran")
		.enterFatherFirstName("Rajendran")
		.enterFatherMiddleName("K")
		.enterFatherLastName("Krishnaswamy")
		.enterMobile("9176320074")
		.enterEmail("ganga7791@gmail.com")
		.selectIncomeSource("Salary")
		.clickOnAddress()
		.enterDateofBirth("09121991")
		.enterHomeAddress("No.2")
		.enterHomeStreet("Gandhi Street")
		.enterHomeCity("Chennai")
		.selectHomeState("Tamil Nadu")
		.enterHomePincode("600063")
		.selectHomeCountry("India")
		.enterOfficeName("ABC")
		.enterOfficeAddress("No 7")
		.enterOfficeStreet("MGR street")
		.enterOfficeCity("Chennai")
		.selectOfficeState("Tamil Nadu")
		.enterOfficePincode("600091")
		.selectOfficeCountry("India")
		.selectIdentityProof("Driving License (In Copy)")
		.selectAddressProof("PASSPORT (In Copy)")
		.selectDOBProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectAadhaarProof("Copy of Aadhaar Card / Letter")
		.selectOfficeAddressProof("Bank statement carrying Office Address")
		.clickOnAgree();
		}
}
