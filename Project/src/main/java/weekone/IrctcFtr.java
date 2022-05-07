package weekone;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcFtr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.ftr.irctc.co.in/ftr/");
		Thread.sleep(2000);
		driver.findElementByLinkText("New User? Signup").click();
		driver.findElementById("userId").sendKeys("ganges77777");
		driver.findElementById("password").sendKeys("Alliswell@77");
		driver.findElementById("cnfPassword").sendKeys("Alliswell@77");
		driver.findElementById("secAnswer").sendKeys("Alliswell");
		driver.findElementById("dateOfBirth").click();
		driver.findElementByLinkText("9").click();
		driver.findElementById("gender1").click();
	    driver.findElementById("maritalStatus1").click();
	    //sec ques, occu, nationality, country dropdown
	    driver.findElementById("email").sendKeys("ganga77@gmail.com");
	    driver.findElementById("fname").sendKeys("Ganges");
	    driver.findElementById("mname").sendKeys("");
	    driver.findElementById("lname").sendKeys("Rajendran");
	    driver.findElementById("flatNo").sendKeys("898");
	    driver.findElementById("street").sendKeys("Gandhi street");
	    driver.findElementById("area").sendKeys("Pudur");
	    driver.findElementById("mobile").sendKeys("6254568975");
	    driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
	    driver.findElementById("sameAddresses1").click();
	    driver.findElementById("flatNoOffice").sendKeys("No.4342/N");
	    driver.findElementById("streetOffice").sendKeys("St.Geroge town");
	    driver.findElementById("areaOffice").sendKeys("Hyderbad");
	    driver.findElementById("mobileOffice").sendKeys("91236548978");
	    driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
	    driver.findElementById("//*[@id=\"captchaTxt\"]").click(); //captcha
	    driver.findElementByXPath("/html/body/div[2]/form/div/div[2]/table/tbody/tr[37]/td/button").click(); //register button click
	    driver.findElementByXPath("/html/body/div[4]/div[2]/button").click(); //pincode
	}

}
