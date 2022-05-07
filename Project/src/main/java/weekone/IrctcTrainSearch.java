package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcTrainSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
	        ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.irctc.co.in/nget/train-search");
			
			Thread.sleep(5000);
			
			driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
			
			driver.findElementByLinkText("REGISTER").click();
			
			Thread.sleep(5000);
			
			driver.findElementById("userName").sendKeys("Ganges77");
			
			driver.findElementById("usrPwd").sendKeys("Alliswell@77");
			
			driver.findElementById("cnfUsrPwd").sendKeys("Alliswell@77");
			
			//dropdown lang/security question
			
			driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input").sendKeys("Alliswell");
			
            //for cont button
			driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
			
			driver.findElementById("firstName").sendKeys("Ganges");
			
		    driver.findElementById("middleName").sendKeys("");
		    
		    driver.findElementById("lastname").sendKeys("Rajendran");
		    
		    //dropdwon occupation/country
		    
		    driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input").click();
		    
		    driver.findElementByLinkText("1").click();
		    
		    driver.findElementByXPath("//*[@id=\"unmarried\"]/div/div[2]/span").click();
		    
		    driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[2]/span").click();
		    
		    driver.findElementById("email").sendKeys("ganges98956@gmail.com");
		    
		    driver.findElementById("mobile").sendKeys("9874555555");
		    //for cont button
		    driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
		    
		    driver.findElementById("resAddress1").sendKeys("No 9877 / Old No 1236 Mega Avenue");
		    
		    driver.findElementById("resAddress2").sendKeys("Nehru Road");
		    
		    driver.findElementById("resAddress3").sendKeys("Velchery");
		    
		    driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[4]/input").sendKeys("641030");
		    
		    driver.findElementById("resState").sendKeys("TamilNadu");
		    
		    driver.findElementById("resPhone").sendKeys("9856471236");
		    
		    driver.findElementByXPath("//*[@id=\"no\"]/div/div[2]").click();
		    
		    driver.findElementById("offAddress1").sendKeys("105");
		    
		    driver.findElementById("offAddress2").sendKeys("No. 987, Taramani");
		    
		    driver.findElementById("offAddress2").sendKeys("Chennai");
		    
		    driver.findElementById("offPinCode").sendKeys("600158");
		    
		    driver.findElementById("offState").sendKeys("Tamilnadu");
		    
		    driver.findElementById("offPhone").sendKeys("9632587412");
		    
		    //driver.findElementByXPath("//*[@id=\"recaptcha-anchor\"]/div[1]").click(); //captcha
		    
		    driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[13]/span[1]/input").click(); //checkbox
		    
		    //Registerbutton click
		    driver.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
		    
		    
	}

}
