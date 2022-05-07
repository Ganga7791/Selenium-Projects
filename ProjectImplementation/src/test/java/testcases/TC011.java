package testcases;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC011 extends GenericWrappers {

	@Test
	public void confirmAlert()
	{
		invokeApp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		switchToFrameByName("iframeResult");
		clickByXpathNoSnap("/html/body/button");
		getAlertText();
		acceptAlert();
		verifyTextById("demo", "You pressed OK!");
		refreshPage();
		refreshPage();
		switchToFrameByName("iframeResult");
		clickByXpathNoSnap("/html/body/button");
		dismissAlert();
		verifyTextById("demo", "You pressed Cancel!");
		switchToDefaultFrame();
		clickById("tryhome");
	}
}
