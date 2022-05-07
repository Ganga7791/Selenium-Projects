package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;

public class GenericWrappers implements Wrappers {

	RemoteWebDriver driver;
	
	public void invokeApp(String browser, String url)  {
		// TODO Auto-generated method stub
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			System.out.println("The Browser "+browser+" is launched with given URL "+url+" successfully");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			System.err.println("The Browser " +browser+ " is not launched since could not create the new session");
		} catch (InvalidArgumentException e) {
			// TODO: handle exception
			System.err.println("The Browser " +browser+ " is not launched since argument URL doesnot contain type http/https");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The Browser " +browser+ " is not launched due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void enterById(String idValue, String data) {
		try {
			// TODO Auto-generated method stub
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The element with id " +idValue+ " is entered with text " +data);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("The element with id " +idValue+ " is not found in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id " +idValue+ " is not visible in DOM");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id " +idValue+ " is not interactable in DOM");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with id " +idValue+ " is not stable from current DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id " +idValue+ " is not entered with " +data+ " due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void enterByName(String nameValue, String data)  {
		try {
			// TODO Auto-generated method stub
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("The element with name " +nameValue+ " is entered with text " +data);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("The element with name " +nameValue+ " is not found in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with name " +nameValue+ " is not visible in DOM");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with name " +nameValue+ " is not interactable in DOM");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with name " +nameValue+ " is not stable from current DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with name " +nameValue+ " is not entered with " +data+ " due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("The element with xpath value " +xpathValue+ " located successfully in DOM and entered with text " +data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath " +xpathValue+ " is not found in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathValue+ " is not visible in DOM");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathValue+ " is not interactable in DOM");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathValue+ " is not stable from current DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println(
					"The element with xpath " +xpathValue+ " is not entered with " +data+ " due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualtitle = driver.getTitle();
			
			if (actualtitle.equals(title)) {
				System.out.println("The title of the page " +actualtitle+ " matching with expected title of browser " +title);
			} else {
				System.err.println("The title of the page " +actualtitle+ " not matching with expected title of browser " +title);
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("The title of the page " +title+ " is not verified due to unknown error");
		} finally {
			takeSnap();
		}	
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext = driver.findElementById(id).getText(); // read text
			if (actualtext.equals(text)) {
				System.out.println("The element with id " +id+ " has actual text " +actualtext+ " which is matching with expected text " +text);
			} else {
				System.err.println("The element with id " +id+ " has acutual text " +actualtext+ " which is not matching with expected text " +text);
			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("The element with id " +id+ " is not found in DOM");	
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id " +id+ " is not visible in DOM");
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id " +id+ " is not interactable in DOM");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with id " +id+ " is not stable from current DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id " +id+ " is not verified with  " +text+ " due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext = driver.findElementByXPath(xpath).getText();
			
			if (actualtext.equals(text)) // exact match
			{
				System.out.println("The element with xpath " +xpath+ " has actual text as " +actualtext+ " is matching with expected text " +text);
			} else {
				System.err.println("The element with xpath " +xpath+ " has actual text as " +actualtext+ " is not matching with expected text " +text);
			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpath+ " is not found in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpath+ " is not visible in DOM");
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath " +xpath+ " is not interactable in DOM");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpath+ " is not stable from current DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println(
					"The element with xpath " +xpath+ " is not verified with " +text+ " due to unknown error");
		} finally {
			takeSnap();
		}	
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext = driver.findElementByXPath(xpath).getText();
			if (actualtext.contains(text)) // verify partial match
			{
				System.out.println("The element with xpath " +xpath+ " contains actual text " +actualtext+ " is matching with expected text " +text);
			} else {
				System.out.println("The element with xpath " +xpath+ " contains actual text " +actualtext+ " is not matching with expected text " +text);
			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpath+ " is not found in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpath+ " is not visible in DOM");
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath " +xpath+ " is not interactable in DOM");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpath+ " is not stable from current DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err
					.println("The element with xpath " +xpath+ " is not verified with " +text+ " due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			System.out.println("The element with id " +id+ " is clicked successfully");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id " +id+ " is not clickable in DOM");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("The element with id " +id+ " is not found in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id " +id+ " is not visible in DOM");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id " +id+ " is not interactable in DOM");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with id " +id+ " is not stable in the current DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id " +id+ " is not clickable due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("The element with classname " +classVal+ " is clicked successfully");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with classname " +classVal+ " is not clickable in DOM");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with classname " +classVal+ " is not found in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with classname " +classVal+ " is not visible in DOM");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with classname " +classVal+ " is not interactable in DOM");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with classname " +classVal+ " is not stable in the current DOM");	
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with classname " +classVal+ " is not clickable due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			System.out.println("The element with name " +name+ " is clicked successfully");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with name " +name+ " is not clickable in DOM");	
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with name " +name+ " is not found in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with name " +name+ " is not visible in DOM");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with name " +name+ " is not stable in the current DOM");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with name " +name+ " is not interactable in DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with name " +name+ " is not clickable due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("The element with Linktext " +name+ " is clicked successfully");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with Linktext " +name+ " is not clickable in DOM");	
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with Linktext " +name+ " is not found in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with Linktext " +name+ " is not visible in DOM");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with Linktext " +name+ " is not interactable in DOM");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with Linktext " +name+ " is not stable in the current DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with Linktext " +name+ " is not clickable due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("The element with Linktext " +name+ " is clicked successfully");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with Linktext " +name+ " is not clickable in DOM");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with Linktext " +name+ " is not found in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with Linktext " +name+ " is not visible in DOM");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with Linktext " +name+ " is not stable in the current DOM");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with Linktext " +name+ " is not interactable in DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with Linktext " +name+ " is not clickable due to unknown error");
		}
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element with xpath " +xpathVal+ " is clicked successfully");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathVal+ " is not clickable in the DOM");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath " +xpathVal+ " is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathVal+ " is not visible in the DOM");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathVal+ " is not interactable in the DOM");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathVal+ " is not stable in the current DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathVal+ " is not clickable due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element with xpath " +xpathVal+ " is clicked successfully");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathVal+ " is not clickable in the DOM");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath " +xpathVal+ "  is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathVal+ " is not visible in the DOM");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathVal+ " is not interactable in the DOM");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathVal+ " is not stable in the current DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathVal+ " is not clickable due to unknown error");
		}
	}

	public String getTextById(String idVal) {
		String hasText = null;
		// TODO Auto-generated method stub
		try {
			hasText  = driver.findElementById(idVal).getText();
			System.out.println("The element with Id " +idVal+ " holds text " +hasText+ " displayed successfully");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with Id " +idVal+ " is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with Id " +idVal+ " is not visible in the DOM");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with Id " +idVal+ " is not interactable in the app");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with Id " +idVal+ " is not stable in the current DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with Id " +idVal+ " is not obtained due to unknown error");
		} finally {
			takeSnap();
		}
		return hasText;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String hasTextXpath = null;
		try {
			hasTextXpath = driver.findElementByXPath(xpathVal).getText();
			System.out.println("The element with xpath " +xpathVal+ " holds text " +hasTextXpath+ " displayed successfully");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath " +xpathVal+ " is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathVal+ " is not visible in DOM");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathVal+ "   is not interactable in DOM");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathVal+ " is not stable in the current DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath " +xpathVal+ " is not obtained due to unknown error");
		} finally {
			takeSnap();
		}
		return hasTextXpath;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selectDropdown = driver.findElementById(id);
			Select  dropdownValues = new Select(selectDropdown);
			dropdownValues.selectByVisibleText(value);
			System.out.println("The element with Select dropdown " +id+ " Visible text value " +value+ " selected successfully");			
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("The element with Select dropdown " +id+ " with " +value+ " is not selectable");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with Select dropdown " +id+ " is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with Select dropdown " +id+ " is visible in the DOM");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with Select dropdown " +id+ " is not interactable in the app");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with Select dropdown " +id+ " is not stable in the current DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with Select dropdown " +id+ " is not selectable due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void selectVisibileTextByXpath(String xpathVal, String value) {
	        // TODO Auto-generated method stub
			try {
				WebElement selectDropdown = driver.findElementByXPath(xpathVal);
				Select  dropdownValues = new Select(selectDropdown);
				dropdownValues.selectByVisibleText(value);
				System.out.println("The element with Select dropdown " +xpathVal+ " Visible text value " +value+ " selected successfully");			
			} catch (ElementNotSelectableException e) {
				// TODO: handle exception
				System.err.println("The element with Select dropdown " +xpathVal+ " with " +value+ " is not selectable");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.err.println("The element with Select dropdown " +xpathVal+ " is not found in the DOM");
			} catch (ElementNotVisibleException e) {
				// TODO: handle exception
				System.err.println("The element with Select dropdown " +xpathVal+ " is visible in the DOM");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				System.err.println("The element with Select dropdown " +xpathVal+ " is not interactable in the app");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
				System.err.println("The element with Select dropdown " +xpathVal+ " is not stable in the current DOM");
			} catch (WebDriverException e) {
				// TODO: handle exception
				System.err.println("The element with Select dropdown " +xpathVal+ " is not selectable due to unknown error");
			} finally {
				takeSnap();
			}
		
	}
	
	public void selectValueByXpath(String xpathValue, String value)
	{
		// TODO Auto-generated method stub
					try {
						WebElement selectDropdown = driver.findElementByXPath(xpathValue);
						Select  dropdownValues = new Select(selectDropdown);
						dropdownValues.selectByValue(value);
						System.out.println("The element with Select dropdown " +xpathValue+ " Visible text value " +value+ " selected successfully");			
					} catch (ElementNotSelectableException e) {
						// TODO: handle exception
						System.err.println("The element with Select dropdown " +xpathValue+ " with " +value+ " is not selectable");
					} catch (NoSuchElementException e) {
						// TODO Auto-generated catch block
						System.err.println("The element with Select dropdown " +xpathValue+ " is not found in the DOM");
					} catch (ElementNotVisibleException e) {
						// TODO: handle exception
						System.err.println("The element with Select dropdown " +xpathValue+ " is visible in the DOM");
					} catch (ElementNotInteractableException e) {
						// TODO: handle exception
						System.err.println("The element with Select dropdown " +xpathValue+ " is not interactable in the app");
					} catch (StaleElementReferenceException e) {
						// TODO: handle exception
						System.err.println("The element with Select dropdown " +xpathValue+ " is not stable in the current DOM");
					} catch (WebDriverException e) {
						// TODO: handle exception
						System.err.println("The element with Select dropdown " +xpathValue+ " is not selectable due to unknown error");
					} finally {
						takeSnap();
					}
	}
	
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement selectDropdownOne = driver.findElementById(id);
			Select dropdownValues = new Select(selectDropdownOne);
			dropdownValues.selectByIndex(value);
			System.out.println("The element with Select dropdown " +id+ " index value " +value+ " selected successfully");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("The element with Select dropdown " +id+ " with " +value+ " is not selectable");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with Select dropdown " +id+ " is not found in the DOM");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with Select dropdown " +id+ " is not interactable in the DOM");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with Select dropdown " +id+ " is not stable in the current DOM");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with Select dropdown " +id+ "  is not selectable due to unknown error");
		} finally {
			takeSnap();
		}
	}
	
	

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> windowhandles = driver.getWindowHandles();	
			for (String eachID : windowhandles) {
				driver.switchTo().window(eachID); 
				break; // controls stays in parent window
			}
			System.out.println("Control Moved to Parent window successfully");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			System.err.println("Switching to parent window failed as Session id is null");
		} catch (NoSuchWindowException e) {
			// TODO: handle exception
			System.err.println("Switching to parent window failed since no windows available");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Switching to parent window failed due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> windowhandles = driver.getWindowHandles();	
			for (String eachID : windowhandles) {
				driver.switchTo().window(eachID);           // controls moves to active window
			}
			System.out.println("Control moved to Last window Successfully");
		} catch (NoSuchWindowException e) {
			// TODO: handle exception
			System.err.println("Control not moved to Last window failed since no windows available");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Control not moved to Last window failed due to unknown error");
		} finally {
			takeSnap();
		}	
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			System.out.println("Alert accepted successfully");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
 			System.err.println("No Alert box presented when tried to switch to alert");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Alert not accepted due to unknown error");
		} 
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("Alert dismissed successfully");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
 			System.err.println("No Alert box presented when tried to switch to alert");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Alert not dismissed due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String getAlertText=null;
		try {
			 getAlertText = driver.switchTo().alert().getText();
			System.out.println("The Alert box content " +getAlertText+ " displayed successfully");
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
			System.err.println("No Alert box presented when tried to switch to alert");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Alert text reading failed due to unknown errors");
		} 
		return getAlertText;
	}

	public void takeSnap() {
		// TODO Auto-generated method stub
		try {
			File temp = driver.getScreenshotAs(OutputType.FILE);
			File destination = new File("./screenshots/snap1.png");
			FileUtils.copyFile(temp, destination);
		} catch (ScreenshotException e) {
			// TODO Auto-generated catch block
			System.err.println("The Screenshot can’t be captured due to the screenshot restriction");		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("The Screenshot can’t be captured since copying files failed");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Not able to take screenshot due to unknown error");
		}
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			System.out.println("The current active window closed successfully");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("The current active window are not closed due to unknown error");
		} 
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			System.out.println("All browser windows in active session are closed successfully");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("All Browser windows are not closed due to unknown error");
		} 
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) { //java exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void pageDownByXpath(String xpathVal)
	{
	 try {
		driver.findElementByXPath(xpathVal).sendKeys(Keys.PAGE_DOWN);
		System.out.println("Browser window page down successfull");
	 } catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		System.err.println("The element with xpath " +xpathVal+ " is not found in DOM");
	} catch (WebDriverException e) {
		// TODO: handle exception
		System.err.println("The element with xpath " +xpathVal+ " not found due to unknown error");
	} finally {
		takeSnap();
	}}
	 
	 public void switchToFrameByName(String nameVal) {
		 try {
			driver.switchTo().frame(nameVal);
			System.out.println("The element frame with name " +nameVal+ "  is switched successfully");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element frame with name " +nameVal+ " not found due to unknown error");
		} finally {
			takeSnap(); }
	 }
		
	 public void switchToDefaultFrame() {
			
			try {
				driver.switchTo().defaultContent();
				System.out.println("The element frame switched to default");
			} catch (WebDriverException e) {
				// TODO: handle exception
				System.err.println("The element frame not closed due to unknown error");
			}
		}
		
	 public void enterdataToAlert(String value) {
			
			try {
				driver.switchTo().alert().sendKeys(value);
				System.out.println("The element alert box is entered with text " +value+ " successfully");
			} catch (WebDriverException e) {
				// TODO: handle exception
				System.err.println("The element alert box not entered text " +value+ "  due to unknown error");
			} 
		}
		
	 public void refreshPage() {
			
			try {
				driver.navigate().refresh();
			} catch (WebDriverException e) {
				// TODO: handle exception
				System.err.println("The element refresh not working due to unknown error");
			} 
		}	
}

