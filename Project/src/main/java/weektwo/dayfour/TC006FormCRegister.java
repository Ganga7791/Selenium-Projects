package weektwo.dayfour;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC006FormCRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
        ChromeDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		
        driver.get("https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
		
        driver.findElementByLinkText("Sign Up (Registration)").click();
	    
        Thread.sleep(1000);
	    
        driver.findElementById("u_id").sendKeys("ganges77");
	    
        driver.findElementById("u_pwd").sendKeys("Alliswell");
	    
        driver.findElementById("u_repwd").sendKeys("Alliswell");
	    
        WebElement secQues = driver.findElementById("u_secques"); //dropdown using option
	    
        Select value = new Select(secQues);
	    
        value.selectByValue("1");
	    
        driver.findElementById("u_secans").sendKeys("S Ra");
	    
        driver.findElementById("u_name").sendKeys("Ganga");
	    
        WebElement gender = driver.findElementById("u_gender"); //dropdown using option
	    
        Select value_gender = new Select(gender);
	    
        value_gender.selectByValue("F");
	    
        driver.findElementById("u_dob").sendKeys("07/11/1996");
	    
        driver.findElementById("u_designation").sendKeys("Doctor");
	    
        driver.findElementById("u_emailid").sendKeys("ganges37r@gmail.com");
	    
        driver.findElementById("u_mobile").sendKeys("9865321476");
	    
        driver.findElementById("u_phone").sendKeys("");
	    
        WebElement nation = driver.findElementById("u_nationality");
	    
        Select nation_Text = new Select(nation);
		
        nation_Text.selectByVisibleText("INDIA");
		
        driver.findElementById("name").sendKeys("Ganga");
		
        driver.findElementById("capacity").sendKeys("5");
		
        driver.findElementById("address").sendKeys("ABC Street, VOC Road, Chennai");
		
        WebElement state = driver.findElementById("state");	
	
		Select state_Value = new Select(state);
		
		state_Value.selectByValue("28");
	    
		Thread.sleep(3000);
		
		WebElement city = driver.findElementById("city_distr");
		
		Select city_Text = new Select(city);
		
		city_Text.selectByVisibleText("CHENNAI");
		
		WebElement acc_Type = driver.findElementById("acco_type");
		
		Select acc_Type_Value = new Select(acc_Type);
		
		acc_Type_Value.selectByValue("H");
		
		WebElement grade = driver.findElementById("star_rat");
		
		Select grade_Value = new Select(grade);
		
		grade_Value.selectByValue("5s");
		
		driver.findElementById("email").sendKeys("ganga37r@gmai.com");
		
		driver.findElementById("mcontact").sendKeys("9632587412");
		
		driver.findElementById("contact").sendKeys("");
		
		driver.findElementByXPath("/html/body").sendKeys("Keys.PAGE_DOWN"); //Enter Guest Info
		
		driver.findElementByName("name_o").sendKeys("Rajendran"); //Enter First Guest Info
		
		driver.findElementByName("address_o").sendKeys("ABC Street");
		
		WebElement state_two = driver.findElementById("state_o");
		
		Select state_Two = new Select(state_two);
		
		state_Two.selectByValue("28");
		
		Thread.sleep(1000);
		
		WebElement city_two = driver.findElementById("citydistr_o");
		
		Select city_Two = new Select(city_two );
		
		city_Two.selectByValue("4C");
		
		driver.findElementByName("emailid_o").sendKeys("priya37r@gmai.com");
		
		driver.findElementByName("phoneno_o").sendKeys("");
		
		driver.findElementByName("mobile_o").sendKeys("8523697412");
		
		driver.findElementByXPath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[2]/tbody/tr/td[2]/input").click(); //add button
		
		driver.findElementByName("name_o").sendKeys("Priyanga"); // second guest
		
		driver.findElementByName("address_o").sendKeys("Gandhi Street");
		
		WebElement state_three = driver.findElementById("state_o");
		
		Select state_Three = new Select(state_three);
		
		state_Three.selectByValue("28");
		
		Thread.sleep(1000);
		
		WebElement city_three = driver.findElementById("citydistr_o");
		
		Select city_Three = new Select(city_three);
		
		city_Three.selectByValue("4C");
		
		driver.findElementByName("emailid_o").sendKeys("raje879@gmail.com");
		
		driver.findElementByName("phoneno_o").sendKeys("");
		
		driver.findElementByName("mobile_o").sendKeys("9654687123");
		
		driver.findElementByXPath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[2]/tbody/tr/td[2]/input").click();
		
		driver.findElementByName("name_o").sendKeys("Chitra"); // add third guest
		
		driver.findElementByName("address_o").sendKeys("Nehru Street");
		
		WebElement state_four = driver.findElementById("state_o");
		
		Select state_Four = new Select(state_four);
		
		state_Four.selectByValue("28");
		
		Thread.sleep(1000);
		
		WebElement city_four = driver.findElementById("citydistr_o");
		
		Select city_Four = new Select(city_four);
		
		city_Four.selectByValue("4C");
		
		driver.findElementByName("emailid_o").sendKeys("chitra897@gmail.com");
		
		driver.findElementByName("phoneno_o").sendKeys("");
		
		driver.findElementByName("mobile_o").sendKeys("8023697852");

		driver.findElementByXPath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[2]/tbody/tr/td[2]/input").click();
		
		driver.quit();
		
	}

}
