package weeksix;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://erail.in/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = driver.findElementById("buttonFromTo");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		
		List<WebElement> allTrains = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr");
		
		for(int i=1; i<=allTrains.size();i++) {
			
			if(i!=15) {
			String trainNanme = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+i+"]/td[2]").getText();
			
			System.out.println(trainNanme);
			
			if(trainNanme.equals("PUNE DURNTO EXP")) {
				driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+i+"]/td[2]").click();
				
				List<WebElement> allDetails = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr[3]/td");
				
				for(int j=1; j<=allDetails.size();j++) {
					
					String trainDetails = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+i+"]/td["+j+"]").getText();
					
					System.out.println(trainDetails);
					
					
					
				}
				
				
			}
			
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
