package week5.assignments.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateAccount extends BaseClass {
@Test
	public void createAccount() {
		driver.findElement(By.linkText("Accounts")).click(); //Click Accounts
		driver.findElement(By.linkText("Create Account")).click(); //Click Create Account
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");//Enter account name
		driver.findElement(By.xpath("//textarea[contains(@class,'inputBox')]")).sendKeys("Selenium Automation Tester");//Enter description
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Test"); //enter local name
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("abcde"); //enter site name
		driver.findElement(By.xpath("(//input[contains(@class,'input')])[5]")).sendKeys("1XXXX"); //enter annual revenue
		//dropdowns
		WebElement industrydd=driver.findElement(By.xpath("(//select[@class='inputBox'])[2]"));
		Select obj= new Select(industrydd);
		obj.selectByIndex(3);
		
		WebElement ownerdd= driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select obj1= new Select(ownerdd);
		obj1.selectByVisibleText("S-Corporation");
		
		WebElement sourcedd= driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select obj2= new Select(sourcedd);
		obj2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marletingdd= driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select obj3= new Select(marletingdd);
		obj3.selectByIndex(6);
		
		WebElement statedd= driver.findElement(By.xpath("//select[contains(@id,'Province')]"));
		Select obj4= new Select(statedd);
		obj4.selectByValue("TX");
		
		//Click on create account button
		
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		
	


	}

}
