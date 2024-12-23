package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.LandingPage;
import pageFactory.LoginPage;

public class LoginPageStepDefinition 
{
	
	WebDriver driver;
	LoginPage lp;
	LandingPage land;
	

	@When("user enters the email and password")
	public void user_enters_the_email_and_password() {
	    lp=new LoginPage(driver);
	    lp.LoginEmail("nmbvhgfhggh@gmail.com");
	    lp.LoginPassword("vghjhghj");
	}

	@Then("user clicks the login button")
	public void user_clicks_the_login_button() {
	   lp.ClickLogin();
	}

	@Then("user successfully logged in")
	public void user_successfully_logged_in() {
	    
	}

}
