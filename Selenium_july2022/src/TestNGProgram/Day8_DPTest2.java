package TestNGProgram;

import org.testng.annotations.DataProvider;

public class Day8_DPTest2 {
	 @DataProvider
	  public Object[][] FBLogin() {
	    return new Object[][] {
	      new Object[] { "kadampratu30@gmail.com", "123456" },
	      new Object[] { "pratikshakadam1203@gmail.com", "pratu123" },
	      new Object[] { "kadampratu40@gmail.com", "123458" },
	      new Object[] { "pratikshakadam1998@gmail.com", "pratu1234" },
	      new Object[] { "kadampratu35@gmail.com", "1234556" },
	      new Object[] { "pratikshakadam1997@gmail.com", "pratu1235" },
	      new Object[] { "kadampratu40@gmail.com", "1234567" },
	      new Object[] { "pratikshakadam1212@gmail.com", "pratu1234" },
	      
	    };
	  }

}
