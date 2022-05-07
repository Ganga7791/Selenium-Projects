package weektwo.dayfour;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowsPractice {

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
				
				String firstWindow = driver.getWindowHandle(); // Check which window currently active
				
				System.out.println(firstWindow); // give the parent window handle
				
				System.out.println(driver.getTitle());
				
				Set <String> winhandles = driver.getWindowHandles(); // List all the windows opened
				
			    List<String> handleslist = new ArrayList<>(winhandles); // insert the windows list in List to switch windows
			    
			    System.out.println(handleslist); // give the parent and child window handle
			    
			    driver.switchTo().window(handleslist.get(1)); // switch to window 2 child window, use 1 since index starts with zero
			    
				driver.findElementByXPath("//*[@id=\"sidebarCollapse\"]").click();
				
				driver.findElementByLinkText("Book Your Coach/Train").click();
				
				Thread.sleep(2000);
				
				System.out.println(driver.getTitle()); // print the active child window title
				
				System.out.println(handleslist.size()); // gives size of window handles
				
				driver.close(); // close the child window
				
				Set <String> winhandles2 = driver.getWindowHandles(); // to work in grand child window use getwindowhandles again
				
				handleslist.clear(); // clear the List array
				
				handleslist.addAll(winhandles2); // add active windowhandles to list
				
				System.out.println(handleslist); // print the active windowhandle - parent and grandchild
				
				driver.switchTo().window(handleslist.get(1)); // to perform click in grandchild use switch and List method get(1)
				
				driver.findElementByLinkText("New User? Signup").click(); 
				
				System.out.println(driver.getTitle()); // gives the title of active grandchild
				
				driver.quit();	// closed all driver browser instance parent and child

	}

}
