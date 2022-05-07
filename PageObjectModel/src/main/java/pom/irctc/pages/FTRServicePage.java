package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRServicePage extends GenericWrappers{
	
	public NewUserSignupPage clickBookYourCoach(){
		clickByXpath("//a[contains(text(),'New User? Signup')]");
		return new NewUserSignupPage();
	}

	
}
