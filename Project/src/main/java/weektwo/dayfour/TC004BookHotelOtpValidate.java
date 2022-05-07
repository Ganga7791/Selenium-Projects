package weektwo.dayfour;


import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC004BookHotelOtpValidate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("https://www.irctc.co.in");
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
	
		Thread.sleep(3000);
		
		driver.findElementByLinkText("HOLIDAYS").click();
		
		Thread.sleep(3000);
		
		driver.findElementByLinkText("Stays").click();
		
		Thread.sleep(3000);
		
		driver.findElementByLinkText("Lounge").click();
		
		Thread.sleep(3000);
		
		Set<String> winhandles = driver.getWindowHandles();
		
		for (String handleAfterClick : winhandles)
			
		{
			driver.switchTo().window(handleAfterClick);
		}
		
		driver.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[1]/ul/li[2]/a").click(); //click on hotel icon
		
		Thread.sleep(3000);
		
		winhandles = driver.getWindowHandles();
		
		for (String handleAfterClick : winhandles)
			
		{
		driver.switchTo().window(handleAfterClick);
		}
		
		driver.findElementByLinkText("Login").click();
		
		Thread.sleep(3000);
		
		driver.findElementByLinkText("Guest User Login").click();
		
		Thread.sleep(3000);
		
		driver.findElementByName("email").sendKeys("ganga7791@gmail.com");
		
		driver.findElementByName("mobileNo").sendKeys("9176320074");
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//*[@id=\"profile\"]/div/form/div[3]/button").click(); // guest sign in
		
		Thread.sleep(3000);
		
		driver.findElementById("filterText").sendKeys("Goa"); // destination
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[1]/a/div[1]/span").click();
		
		Thread.sleep(3000);
		
		driver.findElementByName("dt12").click(); // select date
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[1]/button[2]").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[2]/td[5]/span").click();
		
		Thread.sleep(3000);
		
		driver.findElementByName("dt13").click(); // select date
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[3]/td[1]/span").click();
		
		Thread.sleep(3000);
		
		driver.findElementById("user-data-wrapper-id").click();		
	
		WebElement room = driver.findElementByXPath("//*[@id=\"user-data-wrapper\"]/div[1]/div[1]/select"); // Room dropdown
		
	    Select room_sel = new Select(room);
		
		room_sel.selectByValue("1");
		
		Thread.sleep(3000);
		
		WebElement adult = 	driver.findElementByXPath("//*[@id=\"user-data-wrapper\"]/div[1]/div[2]/select"); // adult dropdown
		
		Select adult_sel = new Select(adult);
		
		adult_sel.selectByVisibleText("3");
		
		Thread.sleep(3000);
		
        WebElement child = driver.findElementByXPath("//*[@id=\"user-data-wrapper\"]/div[1]/div[3]/select"); // child dropdown
		
		Select child_sel = new Select(child);
		
		child_sel.selectByVisibleText("0");
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//*[@id=\"user-data-wrapper\"]/div[2]/button").click(); //done button
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[5]/button").click(); // find hotel
		
		Thread.sleep(3000);
	
		String hotelname = driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[1]/div/h5").getText(); 
		
		Thread.sleep(3000);
		
		System.out.println(hotelname); // print hotel name in console
		
		Thread.sleep(3000);
		
		String price = driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/strong").getText();
		
		Thread.sleep(3000);
		
		System.out.println(price);  // print price in console
		
		Thread.sleep(3000);
		
        driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[3]/button/b").click(); // click on continue button
		
		Thread.sleep(3000);
		
		WebElement title = driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[1]/select"); //title dropdown
		
		Select title_name = new Select(title);
		
		title_name.selectByValue("3");
		
		driver.findElementByName("firstName").sendKeys("Ganges");
		
		driver.findElementByName("lastName").sendKeys("Rajen");
		
		Thread.sleep(2000);
		
		WebElement country_sel = driver.findElementByName("country"); // select country
		
		Select country_select = new Select(country_sel);
		
		country_select.selectByVisibleText("India");
		
		Thread.sleep(2000);
		
		WebElement state_sel = driver.findElementByName("state"); // select state
		
        Select state_select = new Select(state_sel);
		
        state_select.selectByVisibleText("TAMIL NADU");
        
        Thread.sleep(2000);
                
        WebElement gst_sel = driver.findElementByName("gst"); // select state
		
        Select gst_select = new Select(gst_sel);
		
        gst_select.selectByVisibleText("No");
		
		Thread.sleep(2000);
		
		//Get the Hotel Name and Compare
		String hotelActual = driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-paxdetail/div[1]/div/div/h5").getText();
		String hotelExpected = "Baywatch Resort Sernabatim South Goa Margao (FHRAI Member)";
		if (hotelExpected.equals(hotelActual)) {
			System.out.println("Hotel name is matching");
		} else {
			System.out.println("Hotel name is not matching");
		}
		
		//Get the Amount and Compare
		String priceActual = driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-paxdetail/div[1]/div/div/h5").getText();
		String priceExpected = "₹ 6048";
		if (priceExpected.equals(priceActual)) {
			System.out.println("Price value is matching");
		} else {
			System.out.println("Price value is not matching");
		}
		
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[9]/button[2]").click(); //Click Go
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[1]/ul/li/label/span").click(); //Click Agree
		
		Thread.sleep(1000);

		driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[2]/button[2]").click(); // Make Payment
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//*[@id=\"modalOTP\"]/div/div/form/div/div[2]/button").click(); // click OTP verify button
		
		Thread.sleep(2000);
		
		String otpError = driver.findElementByXPath("//*[@id=\"modalOTP\"]/div/div/form/div/div[1]/span").getText();
		
		if(otpError.contains("otp is required."))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.quit();
	}
}
