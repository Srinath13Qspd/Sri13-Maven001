package introduction;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseClass.BaseClass002;



public class Demo002 extends BaseClass002 {
	@Test
	public void m1() {
		Reporter.log("Maven is fun",true);
		
		
	}

}
