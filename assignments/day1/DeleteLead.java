package week5.assignments.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClass {
@Test
	public void deleteLead() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Leads']")).click(); //click leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click(); //click find leads
		driver.findElement(By.xpath("//span[text()='Phone']")).click(); //click phone
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8838292061"); //enter phone no.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); //click on find leads
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'col-partyId')]/a)[1]")).click(); //opening the 1st resulting lead
		driver.findElement(By.xpath("//a[text()='Delete']")).click(); //delete
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click(); //click find leads
		driver.findElement(By.name("id")).sendKeys("16016"); //searching deleted id
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); //click find leads
		String text=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text); //printing the verify message
		
		
		
		
		
	}

}
