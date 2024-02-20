package pomClasses_WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// MaleRadioButton
	@FindBy(id="gender-male")
	private WebElement maleRadioButton; 
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}
	
	// FemaleRadioButton
	@FindBy(id="gender-female")
	private WebElement femaleRadioButton;
	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}
	
	
	// FirstName
	@FindBy(id="FirstName")
	private WebElement firstNameTextField;
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
	
	
	// Last Name
	@FindBy(id="LastName")
	private WebElement lastNameTextField;
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}
	
	
	//  Email-Id text field
	@FindBy(id="Email")
	private WebElement emailIdTextfield;
	public WebElement getEmailIdTextField() {
		return emailIdTextfield;
	}
	
	// Password text field
	@FindBy(id="Password")
	private WebElement passwordTextField;
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	
	
	// Confirm password text field
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTextField;
	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}
	
	
	// Register submit button
	@FindBy(id="register-button")
	private WebElement registerSubmitButton;
	public WebElement getRegistersSubmitButton() {
		return registerSubmitButton;
	}
	
	
	// Continue button
	@FindBy(xpath="//input[@class='button-1 register-continue-button']")
	private WebElement registerContinueButton;
	public WebElement getRegisterContinueButton() {
		return registerContinueButton;
	}
	

	
	
		
}
