package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage 
{
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement lnk_home;
	
	@FindBy(xpath="//a[@href='/products']")
	WebElement lnk_products;
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
	WebElement lnk_cart;
	
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	WebElement lnk_signlogin;
	
	public void HomePage()
	{
		lnk_home.click();
	}
	
	public void Products()
	{
		lnk_products.click();
	}
	
	public void Cart()
	{
		lnk_cart.click();
	}
	
	public void SignupOrLogin()
	{
		lnk_signlogin.click();
	}
	
}
