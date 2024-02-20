package pomClasses_WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
	 PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logoutButton;
	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	@FindBy(xpath="//div[@class=\"header-logo\"]")
	private WebElement homeButton;
	public WebElement getHomeButton() {
		return homeButton;
	}
	
	@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[1]")
	private WebElement addToCartButton;
	public WebElement getaddToCartButton() {
		return addToCartButton;
	}
	
	@FindBy(id="newsletter-email")
	private WebElement newsLetterEmailTextField;
	public WebElement getNewsLetterEmailTextField() {
		return newsLetterEmailTextField;
	}
	
	@FindBy(id="newsletter-subscribe-button")
	private WebElement newsLetterSubscribeButton;
	public WebElement getNewsLetterSubscribeButton() {
		return newsLetterSubscribeButton;
	}
	
	@FindBy(id="newsletter-result-block")
	private WebElement newsLetterConfirmationMessage;
	public WebElement getNewsLetterConfirmationMessage() {
		return newsLetterConfirmationMessage;
	}
	
	@FindBy(id="pollanswers-1")
	private WebElement cummunityPoleRadioButtonExcellent;
	public WebElement getCummunityPoleRadioButtonExcellent() {
		return cummunityPoleRadioButtonExcellent;
	}
	@FindBy(id="pollanswers-2")
	private WebElement cummunityPoleRadioButtonGood;
	public WebElement getCummunityPoleRadioButtonGood() {
		return cummunityPoleRadioButtonGood;
	}
	@FindBy(id="pollanswers-3")
	private WebElement cummunityPoleRadioButtonPoor;
	public WebElement getCummunityPoleRadioButtonPoor() {
		return cummunityPoleRadioButtonPoor;
	}
	@FindBy(id="pollanswers-4")
	private WebElement cummunityPoleRadioButtonVeryBad;
	public WebElement getCummunityPoleRadioButtonVeryBad() {
		return cummunityPoleRadioButtonVeryBad;
	}
	@FindBy(id="vote-poll-1")
	private WebElement cummunityPoleVoteButton;
	public WebElement getCummunityPoleVoteButton() {
		return cummunityPoleVoteButton;
	}
	@FindBy(xpath="//ul[@class=\"poll-results\"]")
	private WebElement cummunityPoleVoteResult;
	public WebElement getCummunityPoleVoteResult() {
		return cummunityPoleVoteResult;
	}
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCartButton;
	public WebElement getShoppingCartButton() {
		return shoppingCartButton;
	}

}
