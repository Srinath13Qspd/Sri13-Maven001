package baseClass;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import pomClasses_WebElements.HomePage;
import pomClasses_WebElements.LoginPage;
import pomClasses_WebElements.WelcomePage;
import testDataReadingUtilities001.DataUtility;

@Listeners(listners.ITestListner002.class)
public class BaseClass002 {
	public static WebDriver driver;
	

// Launching Browser
	@BeforeSuite
	@Parameters("s1")
	public void launchingBrowser(@Optional("Chrome") String s) {
		driver = null;
		if (s.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			Reporter.log("Chrome browser has been launched", true);
		} else if (s.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			Reporter.log("FireFox Browser has been launched", true);
		} else if (s.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			Reporter.log("Edge browser has been launched", true);
		} else {
			System.out.println("Enter valid browser name");

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().window().maximize();
	}

// Opening Web Application
	@BeforeTest
	public void launchingApplication() throws IOException {
		SoftAssert softassert = new SoftAssert();
		DataUtility utility001 = new DataUtility();

		String url001 = utility001
				.readingDataFromPropertyFile("./src/test/resources/PropertiesFiles/GenericData/URL.properties", "url");
		driver.get(url001);
		softassert.assertEquals(driver.getCurrentUrl().equals(url001), true, "Application has not been launched");
		Reporter.log("Application has been launched", true);
	}

// Login process
	@BeforeClass
	public void loginProcess() throws EncryptedDocumentException, IOException {
		DataUtility utility001 = new DataUtility();
		WelcomePage welcome = new WelcomePage(driver);
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		SoftAssert softassert = new SoftAssert();
		
		welcome.getLoginbutton001().click();
		Reporter.log("Login page has been opened", true);
		String credentials[] = utility001.readingOnePerticularRowDataFromExcel(
				"./src/test/resources/MS Excel Files/TestData/Login Credentials.xlsx", "Sheet1", 1);
		login.getEmailIdTextfield().clear();
		login.getEmailIdTextfield().sendKeys(credentials[0]);
		login.getPasswordTextfield().clear();
		login.getPasswordTextfield().sendKeys(credentials[1]);
		login.getLoginSubmitButton().click();

		softassert.assertEquals(home.getLogoutButton().isDisplayed(), true, "Login process is not sucessfull");
		Reporter.log("Login process is sucessfull and Homepage has been displayed ", true);
	}

// Logout process
	@AfterClass
	public void logoutProcess() {
		WelcomePage welcome = new WelcomePage(driver);
		HomePage home= new HomePage(driver);
		SoftAssert softassert= new SoftAssert();
		
		 
	
		home.getHomeButton().click();
		home.getLogoutButton().click();
		
		welcome = new WelcomePage(driver);
		softassert.assertEquals(welcome.getLoginbutton001().isDisplayed(), true, "Logout process is failed");
		Reporter.log("Sucessfully loggedOut", true);
		
	}

// Quitting the browser
	@AfterSuite
	public void quittingBrowser() {
		SoftAssert softassert = new SoftAssert();
		
		driver.quit();
		Reporter.log("Browser has been quitted", true);
		softassert.assertAll();
	}

}