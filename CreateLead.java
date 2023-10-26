package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login"); //Launch url
		driver.manage().window().maximize(); //maximizing the window
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); //username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); //password
		driver.findElement(By.className("decorativeSubmit")).click(); //login
		driver.findElement(By.partialLinkText("CRM")).click(); //Click CRM/SFA Link
		driver.findElement(By.xpath("//a[text()='Leads']")).click(); //click leads
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click(); //click create leads
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTest");//company name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("xxyyzz"); //First name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("aabbcc"); //Last name
		
		//Dropdowns
		
		WebElement sourcedd= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select obj1= new Select(sourcedd);
		obj1.selectByVisibleText("Employee");
		
		WebElement marketCdd= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select obj2= new Select(marketCdd);
		obj2.selectByValue("9001");
		
		WebElement ownerdd= driver.findElement(By.xpath("//select[contains(@id,'ownershipEnumId')]"));
		Select obj3= new Select(ownerdd);
		obj3.selectByIndex(4);
		
		WebElement countrydd= driver.findElement(By.xpath("(//select[contains(@id,'createLeadForm')])[7]"));
		Select obj4= new Select(countrydd);
		obj4.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();//Click create lead button
		
		String title=driver.getTitle(); 
		System.out.println(title); //Print title
		
		

	}

}
