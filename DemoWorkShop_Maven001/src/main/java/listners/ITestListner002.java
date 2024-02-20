package listners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;


import baseClass.BaseClass002;

public class ITestListner002 extends BaseClass002 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Execution of test case is started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Execution of test case is success",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts001= (TakesScreenshot)driver;
		File temp=ts001.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Sri13-Screenshots","Screenshot.png");
		
		try {
			Files.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reporter.log("Screenshot taken", true);
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Execution of test case is started",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Execution of test case is finished",true);
	}

}
