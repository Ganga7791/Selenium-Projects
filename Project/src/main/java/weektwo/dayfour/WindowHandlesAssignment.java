package weektwo.dayfour;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); //Select the driver
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.get("https://www.bus.irctc.co.in/home");
		Set<String> windowhandles = driver.getWindowHandles();	
		for (String eachID : windowhandles) {
			System.out.println(windowhandles);

			driver.findElementByXPath("/html/body/app-root/ng-component/div[3]/div[1]/ul/li[4]/a/div").click(); // parent window click
			driver.switchTo().window(eachID); 
			break;
	}
		System.out.println(windowhandles);
		driver.findElementByXPath("/html/body/app-root/ng-component/div[2]/div[1]/ul/li[5]/a/div").click(); //child window click
		System.out.println(windowhandles);
		
	}

}
