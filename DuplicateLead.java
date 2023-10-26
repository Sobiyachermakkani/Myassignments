package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login"); //Launch url
		driver.manage().window().maximize(); //maximizing the window
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); //username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); //password
		driver.findElement(By.className("decorativeSubmit")).click(); //login
		driver.findElement(By.partialLinkText("CRM")).click(); //Click CRM/SFA Link
		driver.findElement(By.xpath("//a[text()='Leads']")).click(); //click leads
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click(); //click create leads
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTest1");//company name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("xxyyzzz"); //First name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("aabbccc"); //Last name
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Tester"); //first name local
		driver.findElement(By.name("departmentName")).sendKeys("Testing"); //department
		driver.findElement(By.className("inputBox")).sendKeys("Manual tester"); //description
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("abc@gmail.com"); //email
		driver.findElement(By.xpath("//input[@name='submitButton']")).click(); //click on create lead button
		
		//to get title
		String text= driver.getTitle();
		System.out.println("Title of the page is " +text);
		
		//click on duplicate lead button
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		//clear company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Solutions");
		
		//clear first name
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).clear();
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Doo");
		
		//clcik create lead button
		
		driver.findElement(By.name("submitButton")).click();
		
		String text1=driver.getTitle();
		System.out.println("The current page title is " +text1);
		
	
		

	}

}
