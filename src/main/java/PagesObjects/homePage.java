package PagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	private WebDriver driver;

	public homePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// modal

	public By ByGeniusModalButton = By.cssSelector(".ae1678b153 svg");

	@FindBy(css = ".ae1678b153 svg")
	public WebElement geniusModalButton;
	@FindBy(className = "modal-mask-closeBtn")
	private WebElement modalMaskCloseButton;

	public void clickGeniusModalButton() {
		geniusModalButton.click();
	}

	public void clickModalMaskCloseButton() {
		modalMaskCloseButton.click();
	}

	public int searchGeniusModalButton() {
		return driver.findElements(By.cssSelector(".ae1678b153 svg")).size();
	}

	// Header fields

	@FindBy(tagName = "html")
	private WebElement pageLanguage;
	@FindBy(xpath = "//button[@data-testid='header-language-picker-trigger']")
	private WebElement languageButton;
	@FindBy(css = ".a1b3f50dcd:nth-child(2) .d46673fe81:nth-child(1) > .ccff2b4c43:nth-child(2) .cf67405157")
	private WebElement englishButton;
	@FindBy(css = ".cb5ebe3ffb:nth-child(1) .e57ffa4eb5")
	private WebElement selectedCurrency;
	@FindBy(css = ".cb5ebe3ffb:nth-child(1) .e57ffa4eb5")
	private WebElement currencyButton;
	@FindBy(css = ".a1b3f50dcd:nth-child(1) > .a448481077:nth-child(2) .d46673fe81:nth-child(1) > .ccff2b4c43:nth-child(1) .ea1163d21f:nth-child(1)")
	private WebElement dollarCurrencyButton;
	@FindBy(css = ".fc63351294:nth-child(5) > .e57ffa4eb5")
	private WebElement signUpButton;
	@FindBy(css = ".b1e6dd8416:nth-child(2) > .faebca7547:nth-child(1)")
	private WebElement accountMenuButton;
	@FindBy(css = "li:nth-child(1) > .fc63351294 > .a1b3f50dcd > .b1e6dd8416 > span")
	private WebElement manageAccountButton;

	public String getPageLanguage() {
		return pageLanguage.getAttribute("lang");
	}

	public void clickLanguageButton() {
		languageButton.click();
	}

	public void clickEnglishButton() {
		englishButton.click();
	}

	public String getSelectedCurrency() {
		return selectedCurrency.getText();
	}

	public void clickCurrencyButton() {
		currencyButton.click();
	}

	public void clickDollarCurrencyButton() {
		dollarCurrencyButton.click();
	}

	public void clickSignUpButton() {
		signUpButton.click();
	}

	public void clickAccountMenuButton() {
		accountMenuButton.click();
	}

	public void clickManageAccountButton() {
		manageAccountButton.click();
	}
}
