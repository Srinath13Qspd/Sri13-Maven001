package pomClasses_WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    //Login Button 
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement loginButton;
	public WebElement getLoginbutton001() {
		return loginButton;
	}
	
	//Register Button
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerButton;
	public WebElement getRegisterButton() {
		return registerButton;
	}
	
}
