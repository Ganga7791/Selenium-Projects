package weekone;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.findElementByLinkText("Create New Account").click();
		
		Thread.sleep(5000);
		
		driver.findElementByName("firstname").sendKeys("Ganga");
		
		try {
			driver.findElementByName("lastname").sendKeys("Raj");
			System.out.println("The element with lastname is entered with data Raj");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with name lastnam is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
		} catch (NoSuchFrameException e) {
			// TODO: handle exception
		} catch (NoSuchWindowException e) {
			// TODO: handle exception
		} catch (InvalidArgumentException e) {
			// TODO: handle exception
		} catch (SessionNotCreatedException e) {
			// TODO: handle exception
		} catch (WebDriverException e) {
			// TODO: handle exception
		} catch (Throwable e) {
			// TODO: handle exception
		} finally {
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./screenshots/snap1.png");
			
			FileUtils.copyFile(tmp, dest);
			
		}
		
		driver.findElementByName("reg_email__").sendKeys("ganga77@gmail.com");
		
		driver.findElementByName("reg_email_confirmation__").sendKeys("ganga77@gmail.com");
		
		driver.findElementByName("reg_passwd__").sendKeys("Alliswell@77");
		
		driver.findElementByName("sex").click();
			
	}

}
