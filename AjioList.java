package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioList {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(@class,'linkname-Men')]")).click();// click men

		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@class,'Fashion Bags')]")).click();// click fashion bags

		// products - count
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("The products size is : " + products.size());
		List<String> productslist = new ArrayList<String>();
		// print products text
		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i).getText());
			String text = products.get(i).getText();
			productslist.add(text);
		}
		System.out.println(productslist);
		Thread.sleep(3000);
		// brands
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("The brands size is : " + brands.size());
		List<String> brandslist = new ArrayList<String>();
		for (int i = 0; i < brands.size(); i++) {
			System.out.println(brands.get(i).getText());
			String brandsdetails = brands.get(i).getText();
			brandslist.add(brandsdetails);

		}
		System.out.println(brandslist);

	}

}
