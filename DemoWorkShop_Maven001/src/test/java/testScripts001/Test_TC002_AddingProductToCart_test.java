package testScripts001;

import org.testng.annotations.Test;

import baseClass.BaseClass002;
import pomClasses_WebElements.HomePage;
import pomClasses_WebElements.ProductDetailsPage;

public class Test_TC002_AddingProductToCart_test extends BaseClass002 {

	@Test
	public void addingProdToCart() throws InterruptedException {
		HomePage hp001 = new HomePage(driver);
		hp001.getaddToCartButton().click();

		ProductDetailsPage pd001 = new ProductDetailsPage(driver);
		pd001.getRecipientEmailTextField().clear();
		pd001.getRecipientEmailTextField().sendKeys("komalgupta121@gmail.com");
		pd001.getRecipientNameTextField().clear();
		pd001.getRecipientNameTextField().sendKeys("komal");
		pd001.getMsgTextField().clear();
		pd001.getMsgTextField().sendKeys("Hi");
		pd001.getAddToCartButton2().click();

		String conf_msg = pd001.getConfirmationMessage().getText();

		System.out.println("Notification message is:- " + conf_msg);
		if (conf_msg.contains("The product has been added to your ")) {
			System.out.println("The product has been added to your cart sucessfully");
		} else if (conf_msg.contains("The maximum quantity allowed for purchase is 5")) {
			System.out.println("No ...the product was failed to add to your cart ");
			System.out.println("because the maximum quantity allowed for purchase is reached");
		} else {
			System.out.println("No ...the product is failed to add to your cart");
			System.out.println("Enter valid details of recipient");
		}

		pd001.getClosingConfirmationMessageButton().click();
       Thread.sleep(6000);
	}

}
