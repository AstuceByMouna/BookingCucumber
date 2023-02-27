package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class passwordPage {
	private WebDriver driver;

	@FindBy(id = "new_password")
	private WebElement newPasswordField;

	@FindBy(id = "confirmed_password")
	private WebElement confirmedPasswordField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement createAccountButton;

	public passwordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterNewPassword(String password) {
		newPasswordField.sendKeys(password);
	}

	public void enterconfirmedPassword(String password) {
		confirmedPasswordField.sendKeys(password);
	}

	public void clickCreateAccountButton() {
		createAccountButton.click();
	}
}
