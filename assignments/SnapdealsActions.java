package week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapdealsActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Go to "Men's Fashion".
		 //driver.findElement(By.xpath("(//li[@class='navlink']//span)[2]")).click();
		WebElement hover= driver.findElement(By.xpath("(//div[text()='Top Categories']/following::span)[2]"));
		Actions builder= new Actions(driver);
		builder.moveToElement(hover).perform();
		
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click(); //clicking on sports shoes
		
		//String shoes = driver.findElement(By.xpath("(//li[contains(@class,'child-cat-list cat-list')]//li//a/div)[2]")).getText();
		String shoes= driver.findElement(By.xpath("//h1[contains(text(),'Sports Shoes for Men')]/following-sibling::span")).getText();
		System.out.println("The total shoes counts are " +shoes); //print shoes count
		
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click(); //click on training shoes
		
		driver.findElement(By.xpath("//span[text()='Sort by:']/following::i")).click(); //sort by -click on arrow
		driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click(); //select low to high
		
		// Check if the displayed items are sorted correctly
		String sortedfrom=driver.findElement(By.xpath("//span[@class='from-price-text']")).getText();
		System.out.println("The sorted from range is: " +sortedfrom );
		
		String sortedto=driver.findElement(By.xpath("//span[@class='to-price-text']")).getText();
		System.out.println("The sorted to range is: " +sortedto);
		
		
		//price - filter
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
		
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("700");
		//click on go
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		
		Thread.sleep(3000);
		//filter colour
		driver.findElement(By.xpath("//input[@id='Color_s-White%20%26%20Blue']/following::label")).click(); //white and blue
	
		
		String filteredclr= driver.findElement(By.xpath("(//div[@class='navFiltersPill'])[2]/a[text()='White & Blue']")).getText();
		System.out.println("The filtered color is : " +filteredclr);
		
		//mouse hover
		Thread.sleep(2000);
		WebElement hover2=driver.findElement(By.xpath("(//div[contains(@class,'-description')]//a/p)[1]"));
		Actions builder2= new Actions(driver);
		builder2.moveToElement(hover2).perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div")).click(); //click quick view
		
		//price- shoe
		String shoerate= driver.findElement(By.xpath("(//div[contains(@class,'product-price')]/span)[1]")).getText();
		System.out.println("The shoe rate is : " +shoerate );
		
		//discount
		String shoedisc= driver.findElement(By.xpath("(//div[contains(@class,'product-price')]/span)[2]")).getText();
		System.out.println("The discount is : " +shoedisc );
		
		//screenshot
		File source= driver.getScreenshotAs(OutputType.FILE);
		File target= new File("./Snaps/shoe.png");
		FileUtils.copyFile(source, target);
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(@class,'close')]/i")).click(); // Close the current window.
		driver.close();
		
		
		

}}
