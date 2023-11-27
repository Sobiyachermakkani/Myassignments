package week5.assignments.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void precondition(String url,String uName, String pWord) {
	driver= new ChromeDriver();
	driver.get(url); //Launch url
	driver.manage().window().maximize(); //maximizing the window
	
	driver.findElement(By.id("username")).sendKeys(uName); //username
	driver.findElement(By.id("password")).sendKeys(pWord); //password
	driver.findElement(By.className("decorativeSubmit")).click(); //login
	driver.findElement(By.partialLinkText("CRM")).click(); //Click CRM/SFA Link
	}
	@AfterMethod
	public void postCondition() {
		
		driver.close();
		
	}

}
