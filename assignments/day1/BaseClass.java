package week5.assignments.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public ChromeDriver driver;
	@BeforeMethod
	public void precondition() {
	driver= new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login"); //Launch url
	driver.manage().window().maximize(); //maximizing the window
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); //username
	driver.findElement(By.id("password")).sendKeys("crmsfa"); //password
	driver.findElement(By.className("decorativeSubmit")).click(); //login
	driver.findElement(By.partialLinkText("CRM")).click(); //Click CRM/SFA Link
	}
	@AfterMethod
	public void postCondition() {
		
		driver.close();
		
	}

}
