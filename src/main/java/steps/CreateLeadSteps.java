package steps;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadSteps {
	ChromeDriver driver;
	@Given("Open chrome Browser")
	public void Open_chrome_Browser(){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
				
	}
	@Given("Enter Url")
	public void Enter_Url(){
		driver.get("http://leaftaps.com/opentaps");
				
	}
	@Given("Enter Username against UsernameField (.*)")
	public void Enter_Username_against_UsernameField(String Username){
		driver.findElementById("username").sendKeys(Username);
				}
	@Given("Enetr password against passwordField (.*)")
	public void enetr_password_against_passwordField(String Password) {
	    
		driver.findElementById("password").sendKeys(Password);

	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElementByClassName("decorativeSubmit").click();

	}

	@When("Click on CRM_SFA link")
	public void click_on_CRM_SFA_link() {
		driver.findElementByLinkText("CRM/SFA").click();
  

	}

	@When("Click on Leads Link")
	public void click_on_Leads_Link() {
		driver.findElementByLinkText("Leads").click();


	}

	@When("Click on Create Lead link")
	public void click_on_Create_Lead_link() {
	    
		driver.findElementByLinkText("Create Lead").click();

	}

	@When("Enter Company name as (.*)")
	public void enter_Company_name_as_Capgemini(String cName) {
		driver.findElementById("createLeadForm_companyName")
		.sendKeys(cName);
		

	}

	@When("Enter First name as (.*)")
	public void enter_First_name_as_Sabari(String fN) {
		driver.findElementById("createLeadForm_firstName")
		.sendKeys(fN);

	}

	@When("Enter Last name as (.*)")
	public void enter_Last_name_as_Raj(String lN) {
		driver.findElementById("createLeadForm_lastName")
		.sendKeys(lN);
	}

	@When("Click CreateLead")
	public void Click_CreateLead(){
		driver.findElementByName("submitButton").click();		
	}
	
	@Then("verifiy Create lead is successful")
	public void verifiy_Create_lead_is_successful() {
	    System.out.println("Successfully created");
		driver.close();		
		}

	

}
