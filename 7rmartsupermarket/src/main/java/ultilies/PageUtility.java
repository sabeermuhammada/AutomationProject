package ultilies;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {

	public void selectbyindex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public void selectbyVisibleText(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByVisibleText(null);
	}

	public void selectbyVisibleValue(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByValue(null);
	}

}
