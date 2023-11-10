package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingassign {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login"); //Launch url
		driver.manage().window().maximize(); //maximizing the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); //username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); //password
		driver.findElement(By.className("decorativeSubmit")).click(); //login
		driver.findElement(By.partialLinkText("CRM")).click(); //Click CRM/SFA Link
		driver.findElement(By.xpath("//a[text()='Contacts']")).click(); //click contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click(); //click merger contacts
		//from contact
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		Set<String> windowHandles= driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> handle= new ArrayList<String>(windowHandles);
		driver.switchTo().window(handle.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//td[contains(@class,'td-partyId x-grid3-cell-first')])[1]/div/a")).click();
		Thread.sleep(3000);
		driver.switchTo().window(handle.get(0));
		//to contact
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		
		Set<String> windowto= driver.getWindowHandles();
		System.out.println(windowto);
		List<String> tohandle= new ArrayList<String>(windowto);
		driver.switchTo().window(tohandle.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//td[contains(@class,'td-partyId x-grid3-cell-first')])[1]//a")).click();
		driver.switchTo().window(tohandle.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();//click merge button
		
		//alert
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String title= driver.getTitle();
		System.out.println(title);
		
	}
	

}
