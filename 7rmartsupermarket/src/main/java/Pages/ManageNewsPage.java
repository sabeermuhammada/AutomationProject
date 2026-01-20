package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;
	
	public ManageNewsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="(//*[@class='col-lg-3 col-6']//*[contains(text(),'More info ')])[7]")WebElement managenewscard;
	@FindBy(xpath ="//*[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath ="//*[@id='news']")WebElement messagebox;	
	@FindBy(xpath ="//*[@name='create']")WebElement savebutton;
	
	public void addnewnewsbyadmin() {
		managenewscard.click();
	}
	public void addnewmessagebyadmin() {
		newbutton.click();
		messagebox.click();
		messagebox.sendKeys("Test Message Entered By Sabeer");
	}
	public void savemanagenews() {
		savebutton.click();
	}

}
