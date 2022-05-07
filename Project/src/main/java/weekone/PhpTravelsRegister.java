package weekone;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravelsRegister {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.phptravels.org/register.php");
		
		Thread.sleep(2000);
		
		driver.findElementByName("firstname").sendKeys("Meera");
		
		driver.findElementByName("lastname").sendKeys("Raj");
		
		driver.findElementByName("email").sendKeys("meera@gmail.com");
		
		driver.findElementByName("phonenumber").sendKeys("5655498896");
		
		driver.findElementByName("companyname").sendKeys("ABC Limited");
		
		driver.findElementByName("address1").sendKeys("No.89, ABCD Street");
		
		driver.findElementByName("address2").sendKeys("ABC Nagar");
		
		driver.findElementByName("city").sendKeys("Chennai");
		
		driver.findElementByName("state").sendKeys("Tamilnadu");
		
		driver.findElementByName("postcode").sendKeys("543098");
		
	    driver.findElementByName("customfield[2]").sendKeys("56568 56689");
	    
	    driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
	    
	    driver.findElementByName("password").sendKeys("Alliswell@1");
	    
	    driver.findElementByName("password2").sendKeys("Alliswell@1");
	    
		
	}
	
}
