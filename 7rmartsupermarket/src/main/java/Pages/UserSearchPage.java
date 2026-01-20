package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ultilies.PageUtility;

public class UserSearchPage {
public WebDriver driver;
public PageUtility pageutility = new PageUtility();
	
	public UserSearchPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//*[@onclick ='click_button(2)']")WebElement searchicon;
	@FindBy(xpath ="//*[@id='un']")WebElement username; 	
	@FindBy(xpath ="//*[@id='ut']")WebElement usertype;
	@FindBy(xpath ="//*[@name='Search']")WebElement searchbutton;
	@FindBy(xpath ="//*[@class='card-body']//*[contains(text(),'Reset')]")WebElement resetbutton;
	
	public void headersearchbuttonclick() {
		searchicon.click();
	}
	public void enteruserdetails(String UserName) {
		username.sendKeys(UserName);
		pageutility.selectbyindex(usertype, 2);
	}
	public void clicksearchbutton() {
		searchbutton.click();
	}
	public void clickresetbutton() {
		resetbutton.click();
	}

}
