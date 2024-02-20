package pomClasses_WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
     PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	private WebElement emailIdTextfield;

	public WebElement getEmailIdTextfield() {
		return emailIdTextfield;
	}

	@FindBy(id = "Password")
	private WebElement passwordTextfield;

	public WebElement getPasswordTextfield() {
		return passwordTextfield;

	}

	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement loginSubmitButton;

	public WebElement getLoginSubmitButton() {
		return loginSubmitButton;
	}

}
