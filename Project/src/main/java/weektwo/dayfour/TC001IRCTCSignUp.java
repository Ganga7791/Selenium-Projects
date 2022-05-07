package weektwo.dayfour;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC001IRCTCSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		
		driver.findElementByLinkText("REGISTER").click();
		
		Thread.sleep(2000);
		
		driver.findElementById("userName").sendKeys("Ganges779137");
		
		driver.findElementById("usrPwd").sendKeys("Alliswell@77");
		
		driver.findElementById("cnfUsrPwd").sendKeys("Alliswell@77");
		
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[2]/span").click();//dropdown lang
		
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
		
		//security question dropdown
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div").click();
		
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li/span").click();
		
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input").sendKeys("Surfing");
		
        //for cont button
		driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
		Thread.sleep(1000);
		
		driver.findElementById("firstName").sendKeys("Ganges");
		
	    driver.findElementById("middleName").sendKeys("M");
	    
	    driver.findElementById("lastname").sendKeys("Rajendran");
	    
	    //dropdown occupation  
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div").click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li").click();
	    
	    Thread.sleep(4000);
	    
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input").click();
	    
	    Thread.sleep(4000);
	    //dob select
	    WebElement dobMon = driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[1]");
	    
	    Select dobMonObj = new Select(dobMon);
	    
	    dobMonObj.selectByVisibleText("October");
	    
	    Thread.sleep(4000);
	    
        WebElement dobYear = driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]");
	    
	    Select dobYearObj = new Select(dobYear);
	    
	    dobYearObj.selectByVisibleText("1994");
	    
	    Thread.sleep(2000);
	    // specific date
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[2]/td[5]").click();
	    
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[2]/span").click();  //female button
	    
	    // dropdown select country
	    
	    WebElement country = driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[8]/select");
	    
	    Select country_select = new Select(country);
	    
	    country_select.selectByValue("94");
	    
	    driver.findElementByXPath("//*[@id=\"unmarried\"]/div/div[2]/span").click(); //radiobutton
	    
	    driver.findElementById("email").sendKeys("ganges98956@gmail.com");
	    
	    driver.findElementById("mobile").sendKeys("9874559505");
	    //nationlity dropdown
        WebElement nationality = driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select");
	    
	    Select nationality_select = new Select(nationality);
	    
	    nationality_select.selectByValue("94");
	    
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select").click();
	    
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select/option[106]").click();
	    
	    //for cont button
	    driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
	    
	    Thread.sleep(1000);
	    
	    driver.findElementById("resAddress1").sendKeys("No 9877 / Old No 1236 Mega Avenue");
	    
	    driver.findElementById("resAddress2").sendKeys("Nehru Road");
	    
	    driver.findElementById("resAddress3").sendKeys("Gandhipuram");
	    
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[4]/input").sendKeys("641030");
	    
	    driver.findElementByXPath("//html/body").click();
	    
	    WebElement city = driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[6]/select"); //city dropdown
	    
	    Select city_select = new Select(city);
	    
	    city_select.selectByValue("Coimbatore");
	    
	    WebElement postofc = driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select"); // postoff dropdown
	    
	    Select postofc_select = new Select(postofc);
	    
	    postofc_select.selectByValue("Kavundampalayam B.O");
	    
	    driver.findElementById("resPhone").sendKeys("9856471236");
	    
	    driver.findElementByXPath("//*[@id=\"no\"]/div/div[2]").click();
	    
	    driver.findElementById("offAddress1").sendKeys("105");
	    
	    driver.findElementById("offAddress2").sendKeys("No. 987, Taramani");
	    
	    Thread.sleep(1000);
	    
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[2]/span").click(); //ofc country dropdown
	    
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[105]/li").click();
	    
	    driver.findElementById("offAddress2").sendKeys("Chennai");
	    
	    driver.findElementById("offPinCode").sendKeys("600158");
	    
	    driver.findElementByXPath("//html/body").click();
	    
	    driver.findElementById("offCity").sendKeys("Chennai");
	    
	    driver.findElementById("offPhone").sendKeys("9632587412");
	    
	    driver.findElementById("offPostOff").sendKeys("Chennai");
	    
	    Thread.sleep(8000);
	 
	    driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
	    
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[13]/span[1]/input").click(); //checkbox
	    
	    Thread.sleep(3000);
	    
	    driver.quit();
	    
	    }

}
