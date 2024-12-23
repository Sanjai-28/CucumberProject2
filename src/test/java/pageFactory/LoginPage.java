package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
	WebElement  txt_Loginemail;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement  txt_LoginPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement  btn_Login;
	
	public void LoginEmail(String email)
	{
		txt_Loginemail.sendKeys(email);
	}
	
	public void LoginPassword(String password)
	{
		txt_LoginPassword.sendKeys(password);
	}
	
	public void ClickLogin()
	{
		btn_Login.click();
	}
	
}
