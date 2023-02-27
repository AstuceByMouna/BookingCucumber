package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class personalDetailsPage {
	private WebDriver driver;
	@FindBy(name = "new_email")
	private WebElement emailVerificationvalue;
	@FindBy(className = "yfCvx60qsR50VNBG15jF")
	private WebElement modifyButton;

	public personalDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getemailVerificationvalue() {
		return emailVerificationvalue.getAttribute("value");
	}

	public void clickmodifyButton() {
		modifyButton.click();
		;
	}
}
