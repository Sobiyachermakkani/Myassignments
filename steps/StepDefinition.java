package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	public ChromeDriver driver;
	@Given("Launch the browser")
	public void launch() {
		driver= new ChromeDriver();
	}
	@And("Load the url")
	public void url() {
		driver.get("http://leaftaps.com/opentaps/control/login");
	}
	@Given("Enter the username as Demosalesmanager")
	public void username() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}
	@And("Enter the password as crmsfa")
	public void password() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("Click on Login button")
	public void login(){
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@And("Click on Crmfsa link")
	public void crmfsalink() {
		driver.findElement(By.partialLinkText("CRM")).click();
	}
	@And("Click Accounts")
	public void clickaccounts() {
		driver.findElement(By.linkText("Accounts")).click();
	}
	@And("Click Create Account")
	public void createacct() {
		driver.findElement(By.linkText("Create Account")).click();
	}
	@Given("Enter account name as (.*)$")
	public void acctname(String acname) {
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(acname);
	}
	@And("Enter description as (.*)$")
	public void desc(String d) {
		driver.findElement(By.xpath("//textarea[contains(@class,'inputBox')]")).sendKeys(d);
	}
	@And("Enter local name as (.*)$")
	public void locname(String loname) {
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys(loname);
	}
	@And("Enter site name as (.*)$")
	public void sitename(String sitname) {
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys(sitname);
	}
	@And("Enter annual revenue as (.*)$")
	public void amt(String amtt) {
		driver.findElement(By.xpath("(//input[contains(@class,'input')])[5]")).sendKeys(amtt);
	}
	@Then("Click on Create account button")
	public void clicksubmit() {
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
	}
}

//CreateLead
	/*@Given("Launch the browser")
	public void launchBrowser() {
    driver=new ChromeDriver();
		
	}
	
   @And("Load the Url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/logout");
	}
   
   
   
	
	  @And("Enter the username as {string}") 
	  public void enterUsername(String
	  uName) { driver.findElement(By.id("username")).sendKeys(uName); 
	  }
	  
	  @And("Enter the password as {string}") 
	  public void enterPassword(String pWord) { 
	  driver.findElement(By.id("password")).sendKeys(pWord);
	  
	  }
	 
    @When("Click on the Login button")
	public void clickLogin() {
	driver.findElement(By.className("decorativeSubmit")).click();
	}
    
	
	  @Then("Homepage is displayed") 
	  public void verifyhomepage() { 
		  String text=driver.findElement(By.tagName("h2")).getText();
	  if(text.contains("Welcome"))
	  { System.out.println("Homepage is displayed");
	  }else
	  { System.out.println("Homepage is not displayed"); 
	  }
	  }
	 
	
	  @But("Errormessage is displayed") 
	  public void errorMessage() { 
		  String texterr=driver.findElement(By.id("errorDiv")).getText();
	  if(texterr.contains("error")) {
	  System.out.println("Unable to login- Error message is displayed");
	  }
	  else {
	  System.out.println("Error message is not displayed"); } }
	 
    @When("Click on Crmsfa link")
    public void crmsfaLink() {
    	driver.findElement(By.partialLinkText("CRM")).click();
    }
    @And("Click on Leads link")
    public void leadsLink() {
    	driver.findElement(By.xpath("//a[text()='Leads']")).click();
    }
    @And("Click on CreateLead link")
    public void createLeadLink() {
    	
    	driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
    }
    @Given("Enter the companyname as (.*)$")
    public void companyName(String cName) {
    	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
    }
    @And("Enter the firstname as (.*)$")
    public void firstName(String fName) {
    	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
    }
    @And("Enter the lastname as (.*)$")
    public void lastName(String lName) {
    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
    }
    @When("Click on Submit button")
    public void submit() {
    	driver.findElement(By.name("submitButton")).click();
    	
    }
    @Then("viewLeadspage should be displayed as (.*)$")
    public void verifyLeadsPage(String cName) {
    	String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
    	if(text.contains("cName")) {
    		System.out.println("Lead created");
    }else {
    	System.out.println("Lead not created");
    }
    }
    
	
		
	
}*/
