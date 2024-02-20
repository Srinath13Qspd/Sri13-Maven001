package testScripts001;

import org.testng.annotations.Test;

import baseClass.BaseClass002;
import pomClasses_WebElements.HomePage;
import pomClasses_WebElements.ProductDetailsPage;

public class Test_TC006_AddingProdToWishList_test extends BaseClass002 {
	@Test
	public void addingToWishList() throws InterruptedException {
		
		HomePage hm001=new HomePage(driver);
		hm001.getaddToCartButton().click();
		
		ProductDetailsPage pdp001=new ProductDetailsPage(driver);
		pdp001.getRecipientNameTextField().sendKeys("Komal");
		pdp001.getRecipientEmailTextField().sendKeys("komalgupta121@gmail.com");
		pdp001.getMsgTextField().sendKeys("Hi");
		pdp001.getAddToWishlistButton().click();
		
		String conf_msg= pdp001.getConfirmationMessage().getText();
		
		System.out.println("Notification message is:- "+conf_msg);
		
		
		
		if(conf_msg.contains("The product has been added to your ")) {
			System.out.println("The product has been added to wishlist sucessfully");
		}
		else if(conf_msg.contains("The maximum quantity allowed for purchase is 5"))
		{
			System.out.println("No ...the product is failed to add to the wishlist ");
			System.out.println("because the maximum quantity allowed for purchase is 5");
		}
		else {
			System.out.println("No ...the product is failed to add to the wishlist ");
			System.out.println("Enter valid details recipient");
		}
		
		pdp001.getClosingConfirmationMessageButton().click();
		
		Thread.sleep(6000);
	}

}
