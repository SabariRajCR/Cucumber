package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadSteps {

	ChromeDriver driver;
	@Given("Open Chrome Browser")
	public void open_Chrome_Browser() {
	  
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
				
	}

	@Given("Navigate to the Leaftaps URL")
	public void navigate_to_the_Leaftaps_URL() {
	    
		driver.get("http://leaftaps.com/opentaps");
	}

	@Given("Enter Username as (.*)")
	public void enter_Username_as(String Username) {
		driver.findElementById("username").sendKeys(Username);
	    
	}

	@Given("Enter password as (.*)")
	public void enter_password_as(String Password) {
		driver.findElementById("password").sendKeys(Password);
	    
	}

	@When("User clicks login")
	public void user_clicks_login() {
		driver.findElementByClassName("decorativeSubmit").click();
	    
	}

	@When("User clicks on CRM_SFA")
	public void user_clicks_on_CRM_SFA() {
	    
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@When("User clicks on Leads")
	public void user_clicks_on_Leads() {
		driver.findElementByLinkText("Leads").click();
			    
	}

	@When("User clicks on Find Leads")
	public void user_clicks_on_Find_Leads() {
	    
		driver.findElementByLinkText("Find Leads").click();
	}

	@When("User clicks on email")
	public void user_clicks_on_email() {
	    
		driver.findElementByXPath("//span[text()='Email']").click();
	}

	@When("Enter email address as .com")
	public void enter_email_address_as_com() {
		driver.findElementByName("emailAddress").sendKeys(".com");
	    
	}

	@When("User clicks on Find Leads Search")
	public void user_clicks_on_Find_Leads_Search() throws InterruptedException {
	    
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(10000);
	}

	@When("User selects the first resulting lead")
	public void user_selects_the_first_resulting_lead() {
		driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[1]//a)[1]").click();;
	    
	}

	@When("User verifies the title of the page")
	public void user_verifies_the_title_of_the_page() {
		String title = driver.getTitle();
		//System.out.println(title);
		if(title.contains("View Lead")){
			
			System.out.println("True");
			
			
		}
	    
	}

	@When("Click on Edit")
	public void click_on_Edit() {
		driver.findElementByLinkText("Edit").click();		
		
		
	    
	}

	@When("User enters the CompanyName as TestLeaf")
	public void user_enters_the_CompanyName_as_TestLeaf() {
		WebElement company = driver.findElementById("updateLeadForm_companyName");
		company.clear();
		company.sendKeys("Test Leaf");
	    
	}

	@When("Click on Update")
	public void click_on_Update() {
		driver.findElementByXPath("//input[@value='Update']").click();
	    
	}

	@Then("User verfies the update name")
	public void user_verfies_the_update_name() {
		
		String text = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		
		if(text.contains("Test Leaf")){
			
			System.out.println("Match");
		}
		else{
			
			System.out.println("MisMatch");
			
		}
		
	    
	}
	
	
	
}
