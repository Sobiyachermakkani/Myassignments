package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml"); //launch url
		driver.manage().window().maximize(); //Maximizing window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement dd=driver.findElement(By.xpath("(//select[contains(@class,'ui')])[1]"));
		Select obj= new Select(dd);
		obj.selectByVisibleText("Selenium");
		
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("(//li[text()='Bengaluru']/following-sibling::li)[1]")).click();
		
		
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		driver.findElement(By.xpath("(//li[text()='மூன்று']/preceding-sibling::li)[3]")).click();
		
		
		driver.findElement(By.xpath("//button[contains(@class,'autocomplete')]")).click();
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'autocomplete')]")).click();
		driver.findElement(By.xpath("(//li[text()='RestAssured']/preceding-sibling::li)[6]")).click();
		
		
		
		

	}

}
