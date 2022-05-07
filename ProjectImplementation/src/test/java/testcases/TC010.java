package testcases;

import org.testng.annotations.Test;


import utils.DP010;
import wrappers.GenericWrappers;

public class TC010 extends GenericWrappers {
	
	@Test(dataProvider="fetchData", dataProviderClass=DP010.class)
	public void promptAlert(String name1, String name2)
	{
		invokeApp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		switchToFrameByName("iframeResult");
		clickByXpathNoSnap("/html/body/button");
		enterdataToAlert("Ganga");
		waitProperty(1000);
		acceptAlert();
		verifyTextContainsByXpath("//*[@id=\"demo\"]", name1);
		refreshPage();
		switchToFrameByName("iframeResult");
		clickByXpathNoSnap("/html/body/button");
		enterdataToAlert("Ganga");
		dismissAlert();
		verifyTextContainsByXpath("//*[@id=\"demo\"]", name2);
		switchToDefaultFrame();
		clickById("tryhome");
	}
}
