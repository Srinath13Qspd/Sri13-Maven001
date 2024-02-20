package introduction;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseClass.BaseClass001;

public class Demo001 extends BaseClass001 {
	@Test
	public void m1() {
		Reporter.log("Maven is fun",true);
	}

}
