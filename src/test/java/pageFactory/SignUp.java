package pageFactory;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp 
{
	WebDriver driver;
	WebDriverWait wait;
	public SignUp(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[normalize-space()='New User Signup!']")
	WebElement txt_newuser;
	
	public void signuppagevalidation()
	{
		txt_newuser.isDisplayed();
	}
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement txt_name;
	
	public void CustomerName(String name)
	{
		txt_name.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement txt_email;
	
	public void EmailId(String email)
	{
		txt_email.sendKeys(email);
	}
	
	@FindBy(xpath="//button[normalize-space()='Signup']")
	WebElement btn_singup;
	
	public void SignUpButton()
	{
		btn_singup.click();
	}
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/p")
	WebElement txt_alreadyexist;
	
	public void AccountAlreadyExist()
	{
		txt_alreadyexist.isDisplayed();
		System.out.println(txt_alreadyexist.getText());
	}
	
	@FindBy(xpath="//input[@id='id_gender1']")
	WebElement chk_male;
	
	public void Male()
	{
		chk_male.click();
	}
	
	@FindBy(xpath="//input[@id='id_gender2']")
	WebElement  chk_female;
	
	public void Female()
	{
		chk_female.click();
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement  txt_password;
	
	public void Password(String pass)
	{
		txt_password.sendKeys(pass);
	}
	
	@FindBy(xpath="//select[@id='days']")
	WebElement  drp_days;
	
	public void Days(String day)
	{
		Select sl=new Select(drp_days);
		sl.selectByVisibleText(day);
	}
	
	@FindBy(xpath="//select[@id='months']")
	WebElement  drp_months;
	
	public void Months(String month)
	{
		Select sl=new Select(drp_months);
		sl.selectByVisibleText(month);
	}
	
	@FindBy(xpath="//select[@id='years']")
	WebElement  drp_years;
	
	public void Years(String year)
	{
		Select sl=new Select(drp_years);
		sl.selectByVisibleText(year);
	}
	
	@FindBy(xpath="//input[@id='newsletter']")
	WebElement chk_newsletter;
	
	public void NewsLetter()
	{
		chk_newsletter.click();
	}
	
	@FindBy(xpath="//input[@id='optin']")
	WebElement chk_specialoffer;
	
	public void SpecialOffer()
	{
		chk_specialoffer.click();
	}
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement  txt_firstname;
	
	public void FirstName(String fname)
	{
		txt_firstname.sendKeys(fname);
	}
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement  txt_lastname;
	
	public void LastName(String lname)
	{
		txt_lastname.sendKeys(lname);
	}
	
	@FindBy(xpath="//input[@id='company']")
	WebElement  txt_company;
	
	public void CompanyName(String company)
	{
		txt_company.sendKeys(company);
	}
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement  txt_address1;
	
	public void Address1(String address1)
	{
		txt_address1.sendKeys(address1);
	}
	
	@FindBy(xpath="//input[@id='address2']")
	WebElement  txt_address2;
	
	public void Address2(String address2)
	{
		txt_address2.sendKeys(address2);
	}
	
	@FindBy(xpath="//select[@id='country']")
	WebElement drp_country;
	
	public void Country(String country)
	{
		Select sl=new Select(drp_country);
		sl.selectByVisibleText(country);
	}
	
	@FindBy(xpath="//input[@id='state']")
	WebElement  txt_state;
	
	public void State(String state)
	{
		txt_state.sendKeys(state);
	}
	
	@FindBy(xpath="//input[@id='city']")
	WebElement  txt_city;
	
	public void CityName(String city)
	{
		txt_city.sendKeys(city);
	}
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement  txt_zipcode;
	
	public void zipcode(String zip)
	{
		txt_zipcode.sendKeys(zip);
	}
	
	@FindBy(xpath="//input[@id='mobile_number']")
	WebElement  txt_number;
	
	public void MobileNumber(String number)
	{
		txt_number.sendKeys(number);
	}
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div/form/button")
	WebElement  btn_createaccount;
	
	
	public void CreateAccount()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(359, 638)");
		btn_createaccount.click();
	}
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/h2/b")
	WebElement txt_accountcreated;
	
	public void AccountCreated()
	{
		txt_accountcreated.isDisplayed();
	}
	
}
