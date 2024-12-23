package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.LandingPage;
import pageFactory.SignUp;

public class RegisterPageStepDefinition 
{
	
	public WebDriver driver;
	public LandingPage land;
	public SignUp sign;
	
	@Given("user enters the landing page")
	public void user_enters_the_landing_page() throws InterruptedException {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://automationexercise.com/");
	    Thread.sleep(3000);
	}

	@Given("user clicks the signup or login page link")
	public void user_clicks_the_signup_or_login_page_link() {
	    land=new LandingPage(driver);
	    land.SignupOrLogin();
	}
	
	@Given("user find the new user signup page")
	public void user_find_the_new_user_signup_page() {
		sign=new SignUp(driver);
		sign.signuppagevalidation();
	}

	@When("user enters the name and email")
	public void user_enters_the_name_and_email() {
		sign.CustomerName("jayasree");
	    sign.EmailId("nmbvhgfhggh@gmail.com");
	}

	@Then("user clicks the signup button")
	public void user_clicks_the_signup_button() {
	    sign.SignUpButton();
	}

	@Then("user enters the title male or female")
	public void user_enters_the_title_male_or_female() {
	   sign.Female();
	}

	@Then("user enters the valid password")
	public void user_enters_the_valid_password() {
	   sign.Password("jkhsdfjg");
	}

	@Then("user enters the DOB")
	public void user_enters_the_dob() {
	    sign.Days("20");
	    sign.Months("April");
	    sign.Years("1998");
	}

	@Then("user enters the firstname and lastname")
	public void user_enters_the_firstname_and_lastname() {
	   sign.FirstName("jayasree");
	   sign.LastName("sanjay");
	}

	@Then("user enters the company details")
	public void user_enters_the_company_details() {
	    sign.CompanyName("tata");
	}

	@Then("user enters the address1 and address2")
	public void user_enters_the_address1_and_address2() {
	   sign.Address1("nbvhgdjjhhjf");
	}

	@Then("user enters the country state city zipcode")
	public void user_enters_the_country_state_city_zipcode() {
	    sign.Country("India");
	    sign.State("tamilnadu");
	    sign.CityName("chennai");
	    sign.zipcode("356564");
	}

	@Then("user enters the mobile number")
	public void user_enters_the_mobile_number() {
	    sign.MobileNumber("2464456574");
	}

	@Then("user clicks the create account button")
	public void user_clicks_the_create_account_button() {
	    sign.CreateAccount();
	}
	
	@Then("user successfully created account")
	public void AccountCreatedSuccessfully()
	{
		sign.AccountCreated();
	}

}
