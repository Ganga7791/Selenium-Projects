package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class IndianFrro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
	
	Thread.sleep(3000);
	
	driver.findElementByLinkText("Sign Up (Registration)").click();
	
	Thread.sleep(2000);
	
	driver.findElementById("u_id").sendKeys("Gangeshwari77");
	
	driver.findElementById("u_pwd").sendKeys("Alliswell@9");
	
	driver.findElementByName("u_repwd").sendKeys("Alliswell@9");
	
	driver.findElementById("u_secans").sendKeys("ABC Street");
	
	driver.findElementById("u_name").sendKeys("Raju");
	
	//("u_gender") dropdown
	
	 driver.findElementById("u_dob").sendKeys("15/11/1996");
	
	 driver.findElementById("u_designation").sendKeys("IT Professional");
	 
	 driver.findElementById("u_emailId").sendKeys("ganga@gmail.com");
	 
	 driver.findElementById("u_mobile").sendKeys("5656565656456");
	 
	 driver.findElementById("u_phone").sendKeys("8234329048239");
	 
	 //("u_nationality") dropdown
	 
	 driver.findElementById("name").sendKeys("Raju");
	 
	 driver.findElementById("capacity").sendKeys("5");
	 
	 driver.findElementById("address").sendKeys("ABC Street, Chennai");
	 
	 //("state") ("city_distr") Accomodation type, Grade dropdown
	 
	 driver.findElementById("email").sendKeys("ganga779@gmail.com");
	 
	 driver.findElementById("mcontact").sendKeys("24234 43242");
	 
	 driver.findElementById("contact").sendKeys("23232356");
	 
	 driver.findElementByName("name_o").sendKeys("Hena");
	 
	 driver.findElementByName("address_o").sendKeys("Gandhir street, Porur");
	 
	 // State , City dropdown
	 
	 driver.findElementByName("emailid_o").sendKeys("hena@gmail.com");
	 
	 driver.findElementByName("phoneno_o").sendKeys("9234223456");
	 
	 driver.findElementByName("mobile_o").sendKeys("55465 45623");
	 
	 driver.findElementByXPath("//*[@id=\"captchaval\"]").click();
	 
	 driver.findElementByXPath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[32]/td/input[1]").click();
	
	}
}
