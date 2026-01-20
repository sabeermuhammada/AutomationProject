package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ultilies.FakerUtility;
import ultilies.PageUtility;
import ultilies.WaitUtility;

public class AdminUsersPage {
public WebDriver driver;
public PageUtility pageutility = new PageUtility();
public WaitUtility wait = new WaitUtility();
public FakerUtility faker = new FakerUtility();
	
	public AdminUsersPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//*[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath ="//*[@id='username']")WebElement username;
	@FindBy(xpath ="//*[@id='password']")WebElement password;
	@FindBy(xpath ="//*[@id='user_type']")WebElement usertypedropdown;
	@FindBy(xpath ="//*[@id='user_type']//*[contains(text(),'Delivery Boy')]")WebElement usertypedata;
	@FindBy(xpath ="//*[@class='fa fa-save']")WebElement savebutton;
	
	public AdminUsersPage addnewuserbyadmin() {
		newbutton.click();
		username.sendKeys(faker.getFakeFirstName());
		password.sendKeys(faker.getPassword());
		pageutility.selectbyindex(usertypedropdown, 4);		
		return this;
	}
	public AdminUsersPage savebuttonclick() {
		wait.waitforaelementclicked(driver, savebutton);
		savebutton.click();
		return this;
	}
	
	
	

}
