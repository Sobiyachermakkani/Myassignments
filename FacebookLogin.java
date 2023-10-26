package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize(); //maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //implicitly wait
		
		//clcik on create acct button- used elder cousin to younger cousin xpath
		driver.findElement(By.xpath("//a[text()='Forgotten password?']/following::a")).click();
		
		//enter first name - grandparent to garndchild
		driver.findElement(By.xpath("//div[@id='fullname_field']//input")).sendKeys("Sobiya");
		
		//enter last name- used grandparent to grandchild/elder cousin to younger cousin
		
		driver.findElement(By.xpath("//div[@id='fullname_field']//input/following::input")).sendKeys("C");
		
		//enter mobile number - elder sibling to younger sibling
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("8838292060");
		
		//enter password- elder sib to younger sib
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("Sobiya@06");
		
		//selecting DOB- day
		
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		Select obj= new Select(day);
		obj.selectByVisibleText("6");
		
		
		//month- elder sib to younger sib
		WebElement month= driver.findElement(By.xpath("//select[@id='day']/following-sibling::select"));
		Select obj1= new Select(month);
		obj1.selectByIndex(3);
		
		//year - eld sib to young sib+index
		
		WebElement year= driver.findElement(By.xpath("(//select[@id='day']/following-sibling::select)[2]"));
		Select obj2= new Select(year);
		obj2.selectByValue("1999");
		
		//select gender
		
		//driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		

	}

}
