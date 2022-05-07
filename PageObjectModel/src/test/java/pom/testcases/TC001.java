package pom.testcases;

import pom.facebook.FacebookAcct;

public class TC001 {
	
	public void Facebook() {
		
		new FacebookAcct()
		.clickonCreate()
		.enterFirstName("Ganga")
		.enterSurName("Rajendran")
		.enterEmail("gangarajen@gmail.com")
		.enterPassword("Alliswell@7")
		.selectDate("09")
		.selectMonth("December")
		.selectYear("1992")
		.selectGender("Female");
	}

}
