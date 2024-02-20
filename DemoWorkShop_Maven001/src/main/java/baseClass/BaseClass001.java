package baseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import testDataReadingUtilities001.DataUtility;

@Listeners(listners.ITestListner001.class)
public class BaseClass001 {
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
	public void LaunchingApplication() throws IOException {
		DataUtility utility001 = new DataUtility();
		String url001 = utility001
				.readingDataFromPropertyFile("./src/test/resources/PropertiesFiles/GenericData/URL.properties", "url");

		driver.get(url001);
		Assert.assertEquals(driver.getCurrentUrl().equals(url001), true,"Application has not been launched");
		Reporter.log("Application has been launched",true);

	}
	
// Logout process
//	public void logout() {
//		HomePage home=new HomePage(driver);
//		home.getLogoutButton().click();
//	}
	

//  Quitting the browser	
	@AfterClass
	public void quittingBrowser() {
		driver.quit();
		Reporter.log("Browser has been quitted",true);
		
	}

}
