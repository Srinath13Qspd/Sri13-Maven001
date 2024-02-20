package testScripts001;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseClass.BaseClass002;
import pomClasses_WebElements.HomePage;
import pomClasses_WebElements.ShoppingCartPage;

public class Test_TC005_ShoppingCart_test extends BaseClass002 {
	@Test
	public void clickingShoppingCartButton() {
		HomePage home=new HomePage(driver);
		ShoppingCartPage cart=new ShoppingCartPage(driver);
		SoftAssert softassert=new SoftAssert();
		
		home.getShoppingCartButton().click();
		softassert.assertEquals(cart.getShoppingCartText().isDisplayed(), true, "ShoppingCart page hasn't displayed");
		Reporter.log("ShoppingCart page has been displayed",true);
	}

}
