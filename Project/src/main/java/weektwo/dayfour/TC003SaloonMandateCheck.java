package weektwo.dayfour;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC003SaloonMandateCheck {

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
			
			Set<String> winhandles = driver.getWindowHandles();
			
			for(String handle : winhandles)
			{
			driver.switchTo().window(handle);
			}
			
		    driver.findElementByXPath("//*[@id=\"sidebarCollapse\"]").click();
		    
		    Thread.sleep(2000);
		    
		    driver.findElementByLinkText("Charter").click(); // link loaded in same window not new tab/window
		    
		    driver.findElementByXPath("//*[@id=\"dismiss\"]").click();
		    
		    Thread.sleep(2000);
		    
			driver.findElementByLinkText("Enquiry Form").click();
			
			Thread.sleep(2000);
			
			driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[1]/input").sendKeys("Ganges");
			
			driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[2]/input").sendKeys("FORD");
			
			driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[3]/input").sendKeys("ABC Street, Chennai");
			
			driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[4]/input").sendKeys("235689741lk");
			
			driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[5]/input").sendKeys("gangs37r@gmail.com");
			
			WebElement saloon = driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[6]/select");
			
			Select saloon_obj = new Select(saloon);
			
			saloon_obj.selectByValue("Saloon Charter");
			
			driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[7]/input").sendKeys("Chennai");
			
			driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[8]/input").sendKeys("Madurai");
			
			driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[9]/input").sendKeys("14-02-2022");
			
			driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[3]/td[2]/span").click();
			
			driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[10]/input").sendKeys("16-02-2022");
			
			driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/tbody/tr[3]/td[4]/span").click();
			
			driver.findElementByName("durationPeriod").sendKeys("2");
			
			driver.findElementByName("coachDetails").sendKeys("2");
			
			driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[14]/input").sendKeys("140");
			
			driver.findElementByName("charterPurpose").sendKeys("For a tour");
			
			driver.findElementByName("services").sendKeys("Food for breakfast and dinner");
			
			driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[17]/button").click();
			
			String appText = driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[4]/span").getText();
			
			if(appText.contains("Mobile no. not valid"))
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
