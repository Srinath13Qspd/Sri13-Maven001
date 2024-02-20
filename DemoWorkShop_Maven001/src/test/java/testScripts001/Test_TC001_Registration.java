package testScripts001;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.BaseClass001;
import pomClasses_WebElements.RegistrationPage;
import pomClasses_WebElements.WelcomePage;
import testDataReadingUtilities001.DataUtility;

public class Test_TC001_Registration extends BaseClass001 {

	@Test
	@DataProvider
	public String[][] readingData() throws EncryptedDocumentException, IOException {
		DataUtility utility001 = new DataUtility();
		String[][] data = utility001.readingRowAndColumnDataFromExcelFile
				("./src/test/resources/MS Excel Files/TestData/Registration.xlsx", "Sheet1");
		return data;
	}

	@Test(dataProvider = "readingData")
	public void registration(String[] data) throws IOException {

		WelcomePage wel001 = new WelcomePage(driver);
		wel001.getRegisterButton().click();

		RegistrationPage reg001 = new RegistrationPage(driver);

		if (data[0].equalsIgnoreCase("male")) {
			reg001.getMaleRadioButton().click();
		} else {
			reg001.getFemaleRadioButton().click();
		}
		reg001.getFirstNameTextField().clear();
		reg001.getFirstNameTextField().sendKeys(data[1]);
		reg001.getFirstNameTextField().clear();
		reg001.getLastNameTextField().sendKeys(data[2]);
		reg001.getEmailIdTextField().clear();
		reg001.getEmailIdTextField().sendKeys(data[3]);
		reg001.getPasswordTextField().clear();
		reg001.getPasswordTextField().sendKeys(data[4]);
		reg001.getConfirmPasswordTextField().clear();
		reg001.getConfirmPasswordTextField().sendKeys(data[4]);

//      reg001.getRegistersSubmitButton().click();
		
//		Assert.assertEquals(reg001.getRegisterContinueButton().isDisplayed(), true, "Registration failed");
//		Reporter.log("Registration is successful",true);
//		reg001.getRegisterContinueButton().click();
		
		
	
	}

}
