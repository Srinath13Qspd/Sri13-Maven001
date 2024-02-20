package pomClasses_WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

	public ProductDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Recipient NameTextField
	@FindBy(id="giftcard_2_RecipientName")
	private WebElement recipientNameTextField;

	public WebElement getRecipientNameTextField() {
		return recipientNameTextField;
	}

	// recipientEmailTextField
	@FindBy(id="giftcard_2_RecipientEmail")
	private WebElement recipientEmailTextField;

	public WebElement getRecipientEmailTextField() {
		return recipientEmailTextField;
	}

	// Sender NameTextField
	@FindBy(id="giftcard_2_SenderName")
	private WebElement senderNameTextField;

	public WebElement getsenderNameTextField() {
		return senderNameTextField;
	}

	// Sender EmailTextField
	@FindBy(id="giftcard_2_SenderEmail")
	private WebElement senderEmailTextField;

	public WebElement getsenderEmailTextField() {
		return senderEmailTextField;
	}
	
	
	// Message TextField
	@FindBy(id="giftcard_2_Message")
	private WebElement msgTextfield;
	public WebElement getMsgTextField() {
		return msgTextfield;
	}

	
	// Add to Cart button
	@FindBy(id="add-to-cart-button-2")
	private WebElement addToCartButton2;
	public WebElement getAddToCartButton2() {
		return addToCartButton2;
	}
	
	// Add to wish list
	@FindBy(id="add-to-wishlist-button-2")
	private WebElement addToWishlistButton;
	public WebElement getAddToWishlistButton() {
		return addToWishlistButton;
	}
	
	// Confirmation message
	@FindBy(xpath="//p[@class=\"content\"]")
	private WebElement confirmationMessage;
	public WebElement getConfirmationMessage() {
		return confirmationMessage;
	}
	
	
	// closing Confirmation Message
	@FindBy(xpath="//span[@class=\"close\"]")
	private WebElement closingConfirmationMessageButton;
	public WebElement getClosingConfirmationMessageButton() {
		return closingConfirmationMessageButton;
		
		
	}
	
	
	
	
	
}
