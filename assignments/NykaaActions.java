package week4.day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NykaaActions {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// click on brands
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();

		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oréal Paris"); // search loreal paris

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//ul[@class='l-vertical-list']/li)[5]//img")).click(); // click on loreal paris  img
																								

		String title = driver.getTitle(); // print title of the pafe
		System.out.println("The title of the page is : " + title);
		if (title.contains("L'Oreal Paris")) // verify the title
		{
			System.out.println("The brand is L'Oreal Paris");
		} else {
			System.out.println("The brand is not known");
		}
		driver.findElement(By.xpath("//span[@class='sort-name']")).click(); // clciking sort by
		driver.findElement(By.xpath("(//div[@class='control-value'])[4]/following-sibling::div")).click(); //select customertoprelated
																											
		Thread.sleep(2000);

		WebElement scroll = driver.findElement(By.xpath("//span[text()='Category']"));
		Actions builder1 = new Actions(driver);
		builder1.scrollToElement(scroll).perform(); // scroll to category
		scroll.click();// click category

		driver.findElement(By.xpath("//span[contains(@class,'filter-name')]")).click(); // select hair
		driver.findElement(By.xpath("(//span[contains(@class,'filter-name')])[2]")).click(); // select haircare
		driver.findElement(By.xpath("(//span[text()='Shampoo']/following::div)[1]")).click(); // select shampoo

		driver.findElement(By.xpath("(//div[@id='product-list-wrap']/div)[9]//a")).click(); // click on "L'Oreal Paris Colour Protect Shampoo

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		String childwindow = list.get(1);
		driver.switchTo().window(childwindow);

		driver.findElement(By.xpath("//span[text()='180ml']")).click(); // clicking on 180ml
		String price = driver.findElement(By.xpath("(//span[text()='MRP:']/following-sibling::span)[1]")).getText();
		System.out.println("The price of the shampoo is :" + price);

		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click(); // add to bag
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click(); // click on shopping bag

		driver.switchTo().frame(0); //switching to frame by index

		String grandtotal = driver.findElement(By.xpath("(//span[text()='Grand Total']/preceding::span)[14]")).getText();
				
		System.out.println("The grandtotal amount is :" + grandtotal); // print grandtotal

		driver.findElement(By.xpath("//span[text()='Proceed']")).click(); // click on proceed

		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click(); // click on continue as guest

		driver.findElement(By.xpath("((//p[text()='Add New Address'])[2]/preceding::img)[7]")).click();// cancel on address
																										 

		driver.findElement(By.xpath("(//span[contains(@class,'end-icon-layout')]/img)[2]")).click();
		String finalbill = driver
				.findElement(By.xpath("((//div[contains(@class,'price-details-desktop')]/div)[3]//p)[2]")).getText();// finaltotal
																														 

		System.out.println("The bill amount is :" + finalbill);
		// verify
		if (grandtotal.equals(finalbill)) {
			System.out.println("The grand total and final bill amount are same");
		} else {
			System.out.println("Both amounts are not same");
		}

		driver.quit(); // closing all windows

	}

}
