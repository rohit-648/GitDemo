package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver driver;
	
	
	  public LoginPage(WebDriver driver) {
	 
	  this.driver=driver;
	  
	  PageFactory.initElements(driver, this); }
	
	
	
	By sn =By.id("nav-link-accountList");

	@FindBy(id = "nav-link-accountList")
	WebElement Signin;

	@FindBy(className = "nav-action-inner")
	WebElement SigninButton;
	
	@FindBy (xpath="//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")
	WebElement Mobiles;

	@FindBy(id = "twotabsearchtextbox")
	WebElement SearchBar;
	
	
	@FindBy (xpath="//input[@type='submit']")
	WebElement SearchButton;
	
	public WebElement SearchButton() {

		return SearchButton;

	}
	
	
	public WebElement SearchBar() {

		return SearchBar;

	}
	
	public WebElement Mobiles() {

		return Mobiles;

	}
	public WebElement Signin() {

		return Signin;

	}

	public WebElement SigninButton() {

		return SigninButton;

	}
	
	public WebElement Sn() {

		return driver.findElement(sn);

	}
}
