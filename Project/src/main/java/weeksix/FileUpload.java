package weeksix;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button").click();
		
		Thread.sleep(5000);
		
		Clipboard obj =  Toolkit.getDefaultToolkit().getSystemClipboard();
		
		StringSelection str = new StringSelection("C:\\Resumes\\Ganga_Resume.docx");
		
		obj.setContents(str, null);
		
		Robot rbt = new Robot();
		
		rbt.keyPress(KeyEvent.VK_CONTROL);
		
		rbt.keyPress(KeyEvent.VK_V);
		
		rbt.keyRelease(KeyEvent.VK_V);
		
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
	}

}
