package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class manageAccountsPage {
	private WebDriver driver;

	@FindBy(xpath = "//a[@data-ga-track='click|Account|Manage accounts|Personal details']")
	private WebElement personalDetailsButton;

	public manageAccountsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickPersonalDetailsButton() {
		personalDetailsButton.click();
	}
}
