package weektwo.daythree;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertsAndFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		Thread.sleep(5000);

	//	driver.switchTo().frame(1);
		
	//	driver.switchTo().frame("iframeResult");
		
		WebElement myFrame = driver.findElementByXPath("//*[@id=\"iframeResult\"]");
		
		driver.switchTo().frame(myFrame);
		
		driver.findElementByXPath("/html/body/button").click();
		
		String alertText = driver.switchTo().alert().getText();
		
		System.out.println(alertText);
		
		if(alertText.equals("Please enter your name:")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		driver.switchTo().alert().sendKeys("Ganga");
		
		driver.switchTo().alert().accept();
		
		String applicationText = driver.findElementById("demo").getText();
		
		System.out.println(applicationText);
		
		if(applicationText.contains("Ganga")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("/html/body/button").click();
		
		driver.switchTo().alert().dismiss();
		
		driver.switchTo().defaultContent();
		
		driver.findElementById("tryhome").click();
		
	}
}
