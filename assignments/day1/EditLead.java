package week5.assignments.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead extends BaseClass {
@Test
	public void editLead() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click(); //click leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click(); //click find leads
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Doo"); //enter first name
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); //click on Find leads button
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'col-partyId')]/a)[1]")).click(); //open 1st resulting lead
		//verify the title of the page
		String title=driver.getTitle();
		System.out.println("The title of the page is " +title);
		//click edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();//clearing the filled company name
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Soln private lmt");//updating new company name
		driver.findElement(By.name("submitButton")).click(); //Click on update button
		
		
		
		
	}

}
