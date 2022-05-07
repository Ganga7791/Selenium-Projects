package testcases;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC012 extends GenericWrappers {
	@Test
	public void simpleAlert()
	{
		invokeApp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		switchToFrameByName("iframeResult");
		waitProperty(2000);
		clickByXpathNoSnap("/html/body/button");
		getAlertText();
		acceptAlert();
		switchToDefaultFrame();
		clickById("tryhome");
	}
	}

