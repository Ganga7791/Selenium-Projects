package weekone;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PanInd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://panind.com/india/new_pan/");
		
		Thread.sleep(2000);
		
		WebElement title = driver.findElementById("pan_title");
		
		Select sel = new Select(title);
		
		// sel.selectByIndex(1);
		
		// sel.selectByValue("3");
		
		sel.selectByVisibleText("MRS.");
		
		driver.findElementById("pan_firstname").sendKeys("Siva");
		
		driver.findElementById("pan_middlename").sendKeys("Raj");
		
		driver.findElementById("pan_lastname").sendKeys("kumar");
		
		driver.findElementById("pan_fatherfirstname").sendKeys("Velan");
		
		driver.findElementById("pan_fathermiddlename").sendKeys("");
		
		driver.findElementById("pan_fatherlastname").sendKeys("kk");
		
		driver.findElementByName("pan_mobilenumber").sendKeys("65655896325");
		
		driver.findElementByName("pan_email").sendKeys("taj@gmail.com");
		
		driver.findElementById("office").click(); 
		
		driver.findElementById("pan_dob").sendKeys("11121991");
		
		//Resident Address
		
		driver.findElementByName("pan_addressline1").sendKeys("no.09, abc street");
		
		driver.findElementByName("pan_addressline2").sendKeys("vel nagar");
		
		driver.findElementByName("pan_cityname").sendKeys("chennai");
		
		driver.findElementByName("pan_pincode").sendKeys("625555");
		
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		
		// Office Address
		
		driver.findElementByName("pan_officename").sendKeys("ITC Ltd");
		
		driver.findElementByName("pan_officeaddressline1").sendKeys("No. 7, Chola street");
		
	    driver.findElementByName("pan_officeaddressline2").sendKeys("TT Main road");
	    
	    driver.findElementByName("pan_officecityname").sendKeys("Coimbatore");
	    
	    driver.findElementByName("pan_officepincode").sendKeys("938908");
	    
	    driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		
		driver.findElementById("pan_source").click(); //-- check box
		
		driver.findElementByXPath("//*[@id=\"msform\"]/div[16]/div[2]/input[2]").click();
		
		//dropdown for state and country / Proof Section
	}
}
