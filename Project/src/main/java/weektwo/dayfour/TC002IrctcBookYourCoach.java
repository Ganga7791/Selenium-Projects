package weektwo.dayfour;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC002IrctcBookYourCoach {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		
		driver.findElementByLinkText("HOLIDAYS").click();
		
		Thread.sleep(2000);
		
		driver.findElementByLinkText("Stays").click();
		
		Thread.sleep(2000);
		
		driver.findElementByLinkText("Lounge").click();
		
		Thread.sleep(3000);
		
		Set <String> winhandles = driver.getWindowHandles(); // List all the windows opened
		
	    for (String eachid : winhandles )
	    {
	    	driver.switchTo().window(eachid);
	    }
	    
		driver.findElementByXPath("//*[@id=\"sidebarCollapse\"]").click(); //menu icon
		
		driver.findElementByLinkText("Book Your Coach/Train").click();
		
		Thread.sleep(2000);
		
		winhandles = driver.getWindowHandles(); // to work in grand child window use getwindowhandles again
		
		for (String eachid : winhandles )
		    {
		    	driver.switchTo().window(eachid);	
		    }
		
		driver.findElementByLinkText("New User? Signup").click(); 
		
		driver.findElementById("userId").sendKeys("ganges77777");
		
		driver.findElementById("password").sendKeys("Alliswell@77");
		
		driver.findElementById("cnfPassword").sendKeys("Alliswell@77");
		
		WebElement secques = driver.findElementById("secQstn"); // select by value dropdwon
		
		Select secques_obj = new Select(secques); 
		
		secques_obj.selectByValue("0");
		
		driver.findElementById("secAnswer").sendKeys("Laila");
		
		driver.findElementById("dateOfBirth").sendKeys("09/02/1969");
		
		driver.findElementByLinkText("9").click();
		
		driver.findElementById("gender1").click();
	    
		driver.findElementById("maritalStatus1").click();
	    
		//occu dropdown
		
        WebElement occu = driver.findElementById("occupation"); // select by value dropdwon
        	
		Select occu_obj = new Select(occu);
		
		occu_obj.selectByValue("Public");
	    
		driver.findElementById("email").sendKeys("ganga77@gmail.com");
	    
		driver.findElementById("fname").sendKeys("Ganges");
	    
		driver.findElementById("mname").sendKeys("");
	    
		driver.findElementById("lname").sendKeys("Rajendran");
		
		//nationality dropdown
		
        WebElement natinality = driver.findElementById("natinality"); // select by visibletext dropdwon
		
		Select natinality_obj = new Select(natinality);
		
		natinality_obj.selectByVisibleText("Indian");
		
		// country dropdown
		
        WebElement country = driver.findElementById("country"); // select by value dropdwon
		
		Select country_obj = new Select(country);
		
		country_obj.selectByValue("94");
		
		driver.findElementById("flatNo").sendKeys("898");
	    
		driver.findElementById("street").sendKeys("Gandhi street");
	    
		driver.findElementById("area").sendKeys("Pudur");
	    
		driver.findElementById("mobile").sendKeys("6254568975");
		
		driver.findElementById("pincode").sendKeys("600063");
	    
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		
        WebElement city = driver.findElementById("city");
		
		Select city_obj = new Select(city);
		
		city_obj.selectByVisibleText("Kanchipuram");
		
        WebElement state = driver.findElementById("state");
		
		Select state_obj = new Select(state);
		
		state_obj.selectByVisibleText("TAMIL NADU");
		
        WebElement postOffice = driver.findElementById("postOffice");
		
		Select postOffice_obj = new Select(postOffice);
		
		postOffice_obj.selectByVisibleText("Srinivasanagar East B.O");
	    
		driver.findElementById("sameAddresses1").click();
	    
		driver.findElementById("flatNoOffice").sendKeys("4342");
	    
		driver.findElementById("streetOffice").sendKeys("Gerogetown");
	    
		driver.findElementById("areaOffice").sendKeys("Hyderbad");
		
        WebElement countryOffice_select = driver.findElementById("countryOffice"); // select by visibletext dropdown
		
		Select countryOffice_obj = new Select(countryOffice_select); 
		
		countryOffice_obj.selectByVisibleText("India");
	    
		driver.findElementById("mobileOffice").sendKeys("91236548978");
		
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
	    
		driver.findElementById("pincodeOffice").sendKeys("600042");
		
		driver.findElementByXPath("//html/body").click();
		
        WebElement city_two = driver.findElementById("cityOffice"); // select by visibletext dropdown
		
		Select city_obj_two = new Select(city_two);
		
		city_obj_two.selectByVisibleText("Chennai");
		
		Thread.sleep(1000);
		
        WebElement stateTwo = driver.findElementById("stateOffice"); // select by visibletext dropdown
		
		Select state_obj_two = new Select(stateTwo);
		
		state_obj_two.selectByVisibleText("TAMIL NADU");
		
		Thread.sleep(1000);
		
        WebElement postOfficetwo = driver.findElementById("postOfficeOffice"); // select by visibletext dropdown
		
		Select postOffice_objtwo = new Select(postOfficetwo);
		
		postOffice_objtwo.selectByVisibleText("Velacheri S.O");
		
		Thread.sleep(2000);
	    
        driver.quit();	// closed all driver browser instance parent child grandchild
    }
	}

