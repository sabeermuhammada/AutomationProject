package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ultilies.WaitUtility;

public class LoginPage {
public WebDriver driver;
public WaitUtility wait = new WaitUtility();
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//*[@placeholder='Username']")WebElement userID;
	@FindBy(xpath ="//*[@placeholder='Password']")WebElement password;
	@FindBy(xpath ="//*[@type='submit']")WebElement signinButton;
	@FindBy(xpath ="(//*[contains(text(),'Dashboard')])[4]")WebElement dashboard;
	
	public LoginPage enterusernameandpassword(String username , String passcode)
	{
		System.out.println("Enter User Name");
		userID.sendKeys(username);
		System.out.println("Enter Password ");
		password.sendKeys(passcode);
		return this;
	}
	public HomePage clickloginbutton()
	{
		wait.waitforaelementclicked(driver, signinButton);
		signinButton.click();
		System.out.println("Login Button Cliked");
		return new HomePage(driver);
	}
	public boolean isverifydashboard()
	{
		return dashboard.isDisplayed();
	}
}
