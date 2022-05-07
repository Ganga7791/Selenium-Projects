package weektwo.daythree;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm"); // Enter the Confirm Alert URL
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("/html/body/button").click(); //Click on Try it button
		
        String alertText = driver.switchTo().alert().getText(); // To read text of alert box 
		
		System.out.println(alertText); // To print the text of alert box
		
		driver.switchTo().alert().accept(); //Accept the alert
		
		Thread.sleep(2000);
		
		String appText = driver.findElementById("demo").getText();
		
		if(appText.contains("OK"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.navigate().refresh();
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("/html/body/button").click(); // click on the Try in button
		
        String alertTextTwo = driver.switchTo().alert().getText(); // To read text of alert box 
		
		System.out.println(alertTextTwo); // print the text of alert box
		
		driver.switchTo().alert().dismiss(); // click on the cancel button
		
		Thread.sleep(2000);
		
		String appTextTwo = driver.findElementById("demo").getText();
				
		if(appTextTwo.contains("Cancel")) // check cancel is present
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.switchTo().defaultContent(); // Close the frame
		
		driver.findElementById("tryhome").click(); //click on home button
		
	}
}
