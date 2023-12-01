package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class RedHatPortal extends BaseClass {
	@BeforeTest
	public void setValues() {
		excelFilename="RedHat";
	}
@Parameters({"username","password","email","phoneno"})
@Test(dataProvider="fetchData")
public void redHatLogin(String uName, String pWord, String eMail, String pNo) {
		// Click on register red hat account
		driver.findElement(By.xpath("//button[contains(text(),'Register for a Red Hat account')]")).click();
		String text = driver.findElement(By.xpath("//h1[text()='Register for a Red Hat account']")).getText();

		if (text.contains("Register")) {
			System.out.println("Register form is displayed");
		} else {
			System.out.println("Register form is not displayed");
		}
		
		driver.findElement(By.id("username")).sendKeys(uName); //username
		driver.findElement(By.id("password")).sendKeys(pWord); //password
		driver.findElement(By.id("email")).sendKeys(eMail); //email
		driver.findElement(By.xpath("//input[contains(@id,'phoneNumber')]")).sendKeys(pNo);//phone no
		
	}

}
