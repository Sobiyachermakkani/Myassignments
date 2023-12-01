package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseClass {
	public ChromeDriver driver;
	public String excelFilename;
	
	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver(); // Launch browser
		driver.get("https://sso.redhat.com"); // Launch url
		driver.manage().window().maximize(); // maximize
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // implicit wait
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException{
		
		return ReadExcel.readExcelData(excelFilename);
	}

}
