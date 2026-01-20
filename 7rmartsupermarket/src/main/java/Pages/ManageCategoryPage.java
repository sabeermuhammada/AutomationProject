package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategoryPage {
		public WebDriver driver;
			
			public ManageCategoryPage(WebDriver driver)
			{
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}
			@FindBy(xpath ="(//*[@class='col-lg-3 col-6']//*[contains(text(),'More info ')])[9]")WebElement adminusercard;
			@FindBy(xpath ="//*[@onclick='click_button(1)']")WebElement newbutton;
			@FindBy(xpath ="//*[@id ='category']")WebElement categoryname;
			@FindBy(xpath ="(//*[@id ='ms-grp_id']//*[contains(text(),'discount')])[1]")WebElement discount;
			@FindBy(xpath ="//*[@id ='main_img']")WebElement image;
			@FindBy(xpath ="//*[@name ='create']")WebElement Save;
			
//			StringSelection selection = new StringSelection("E:\\Sabeer\\ExcelData\\Untitled spreadsheet.xlsx");//			
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//			Robot robot = new Robot();
//			robot.delay(2000);
//			
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_V);
//			robot.keyRelease(KeyEvent.VK_V);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			
//			robot.delay(2000);
			
			

}

