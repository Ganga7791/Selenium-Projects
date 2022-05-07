package weektwo.daythree;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
        ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert"); //Load URL

		driver.switchTo().frame("iframeResult");

		driver.findElementByXPath("/html/body/button").click(); //Click on Try it button

		String alerttext = driver.switchTo().alert().getText(); // To read alert text

		System.out.println(alerttext); // To print the alert text

		driver.switchTo().alert().accept(); // Accept the alert

		driver.switchTo().defaultContent(); // exit the frame

		driver.findElementById("tryhome").click(); // to click on home button
	}

}
