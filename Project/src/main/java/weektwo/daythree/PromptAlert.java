package weektwo.daythree;

import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); //Select the driver
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"); // load URL for Prompt Alert
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("/html/body/button").click(); //Click on Try it button
		
		driver.switchTo().alert().sendKeys("Ganga"); // Input your Name
		
		String alertText = driver.switchTo().alert().getText(); // To get text of alert 
		
		System.out.println(alertText); // To print the text of alert box
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept(); // Accept the Alert
		
		String appText = driver.findElementById("demo").getText();
		
		if(appText.contains("Ganga")) // verify your name is printed in the application 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		Thread.sleep(1000);
		
		driver.navigate().refresh(); // refresh the page
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("/html/body/button").click();
		
		driver.switchTo().alert().sendKeys("Ganga"); // Input your Name
		
        String alertTextTwo = driver.switchTo().alert().getText(); // To read text in alert box 
		
		System.out.println(alertTextTwo); // To print the text in alert box
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().dismiss(); // dismiss the alert
		
		String appTextTwo = driver.findElementById("demo").getText();
		
		if(!appTextTwo.contains("Ganga")) // verify name is not printed when dismiss is clicked
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.switchTo().defaultContent(); // close the frame
		
		driver.findElementById("tryhome").click(); // click on the home button
	}
}
