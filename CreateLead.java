package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
     //step 1 : setup WebDriverManager for ChromeDriver
		WebDriverManager.chromedriver().setup();
		
		
		//step 2: to open the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
//step 3 : to load application url
		driver.get("http://leaftaps.com/opentaps/control/login");
	
		
//step 4: to close the browser
		//driver.close();
		
//step 1 : locate element 
		WebElement findElement = driver.findElement(By.id("username"));
		
//step 2 : to type a value in a text field
		findElement.sendKeys("demosalesmanager");
		
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("crmsfa");
		
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lilly");
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pushpam");
	
	driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Employee");
	
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("DL");
	
	driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Lead");
	
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Leads");
	
	driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1,00000");
	
	driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Computer Software");
	
	driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("Partnership");
	
	driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345678");
	
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("DVLP");
	
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/09/93");
	
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");
	
	driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
	
	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("01");
	
	driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("09");
	
	driver.findElement(By.name("primaryEmail")).sendKeys("sweety@gmail.com");
	
	driver.findElement(By.className("inputBox")).sendKeys("9876065856");
	
	driver.findElement(By.name("generalToName")).sendKeys("David");
	
	driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("thiruthangal");
	
	driver.findElement(By.name("generalCity")).sendKeys("Sivakasi");
	
	driver.findElement(By.name("generalPostalCode")).sendKeys("626130");
	
	driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
	
	driver.findElement(By.name("generalCountryGeoId")).sendKeys("INDIA");
	
    driver.findElement(By.name("submitButton")).click();
    
     
    
    
    
    
	
	
	
	
		
		
		
		
		
		
		
		
		
	}

}
