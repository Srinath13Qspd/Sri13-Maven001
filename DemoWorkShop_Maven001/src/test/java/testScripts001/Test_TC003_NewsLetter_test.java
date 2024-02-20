package testScripts001;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseClass.BaseClass002;
import pomClasses_WebElements.HomePage;
import testDataReadingUtilities001.DataUtility;

public class Test_TC003_NewsLetter_test extends BaseClass002 {
	
	
	@Test
	public void m1() throws EncryptedDocumentException, IOException {
		HomePage hm001=new HomePage(driver);
		SoftAssert softassert = new SoftAssert();
		DataUtility utility001 = new DataUtility();
		String credentials[] = utility001.readingOnePerticularRowDataFromExcel(
				"./src/test/resources/MS Excel Files/TestData/Login Credentials.xlsx", "Sheet1", 1);
		hm001.getNewsLetterEmailTextField().clear();
		hm001.getNewsLetterSubscribeButton().sendKeys(credentials[0]);
		hm001.getNewsLetterSubscribeButton().click();
		
		
		softassert.assertEquals(hm001.getNewsLetterConfirmationMessage().isDisplayed(), true,"Failed to subscribe");
		Reporter.log("Sucessfully subscribion has been done and a verification Email has been Sent",true);
		
	}
	

}
