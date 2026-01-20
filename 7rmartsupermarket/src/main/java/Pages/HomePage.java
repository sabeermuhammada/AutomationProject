package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="(//*[contains(text(),'7rmart supermarket')])[2]")WebElement homeicon;
	@FindBy(xpath ="(//*[contains(text(),'Dashboard')])[4]")WebElement dashboard;
	@FindBy(xpath ="//*[@data-toggle='dropdown']")WebElement profiledropdown;
	@FindBy(xpath ="(//*[@class='dropdown-item'])[2]")WebElement logoutbutton;
	@FindBy(xpath ="(//*[@class='col-lg-3 col-6']//*[contains(text(),'More info ')])[1]")WebElement adminusercard;
	
	public HomePage verifythedashboard() {
		homeicon.isDisplayed();	
		System.out.println("Dashboard displayed");
		return this;
	}
	
	public HomePage dashboardprofile() {
		profiledropdown.click();
		System.out.println("Profile dropdown clicked");
		return this;
	}
	
	public HomePage clickLogoutButton() {
		
		logoutbutton.click();
		System.out.println("Logout Button Cliked");
		return this;
	}
	public AdminUsersPage clicknewuserbyadmin() {
		adminusercard.click();
		return new AdminUsersPage(driver);
	}

}
