package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signUpPage {
	private WebDriver driver;

	@FindBy(id = "username")
	private WebElement emailField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement getStartedButton;

	public signUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}

	public void clickGetStartedButton() {
		getStartedButton.click();
	}
}
