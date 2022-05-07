package weektwo.dayfour;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); //Select the driver
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"); // load URL for Prompt Alert
		
		driver.switchTo().frame("iframeResult");
		
		/*driver.findElementByXPath("/html/body/button").click(); //Click on Try it button
		
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
			System.out.println("Fail");*/
		//}
		driver.switchTo().defaultContent(); // close the frame
		
		
		/*String winIdBeforeClick = driver.getWindowHandle();
		
		System.out.println(winIdBeforeClick);
		
		Set<String> allWinIdsBeforeClick = driver.getWindowHandles();
		
		System.out.println(allWinIdsBeforeClick);*/
		
		driver.findElementById("tryhome").click(); // click on the home button
		
		/*String winIdAfterClick = driver.getWindowHandle();
		
		System.out.println(winIdAfterClick);*/
		
		Set<String> allWinIdsAfterClick = driver.getWindowHandles();
		
		System.out.println(allWinIdsAfterClick);
		
		int i=0;
		
		for(String eachID : allWinIdsAfterClick) {
			
			System.out.println(eachID);
			
			driver.switchTo().window(eachID);
			
			i++;
			
			if(i==2) {
				break;
			}
			
		}
			
		Thread.sleep(5000);
		
		driver.findElementByLinkText("Log in").click();
		
		for(String eachID : allWinIdsAfterClick) {
			driver.switchTo().window(eachID);
			System.out.println(eachID);
			break;
		}
		
		
		
		driver.findElementByXPath("/html/body/div[2]/div/a[4]").click();

	}

}
