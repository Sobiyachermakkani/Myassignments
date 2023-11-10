package week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("one plus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		String price = driver.findElement(By.xpath("((//span[@class='a-price'])[1]/span/following-sibling::span/span)[2]")).getText();
		System.out.println("The first product price is : " + price);

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[contains(@class,'link-style a-text-normal')])[1]/span")).click();
		Set<String> window = driver.getWindowHandles();
		List<String> nexttab = new ArrayList<String>(window);
		driver.switchTo().window(nexttab.get(1));
		
		  Thread.sleep(3000); 
		  // customer ratings
		  
		 WebElement rating = driver.findElement(By.
		 xpath("//span[@id='acrCustomerReviewText']"));
		 System.out.println(rating.getText());
		 

		// screenshot

		
		  File source = driver.getScreenshotAs(OutputType.FILE);
		  File target = new File("./Snaps/oneplus2.png"); 
		  FileUtils.copyFile(source, target);
		 
		Thread.sleep(3000);
        //add to cart
		driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]/input")).click();
		
       //get subtotal

		WebElement total= driver.findElement(By.xpath("(//div[contains(@class,'a-spacing-top-large')]/span)[2]"));
		String text1 = total.getText();
		System.out.println("The subtotal is : " +text1);

		if(price.equals(text1)) {
			System.out.println("The amounts are same");
		}
		else
		{
			System.out.println(" There was a problem retrieving the contents of your cart. ");
		}
		driver.close();
	}

}
