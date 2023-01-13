package TestNGProgram;

import org.testng.annotations.DataProvider;

public class HCTest2 {
  
  @DataProvider
  public Object[][] SignUp() {
    return new Object[][] {
      new Object[] { "kadampratu30@gmail.com"},
      new Object[] { "Pratiksha" },
      new Object[] { "Kadam" },
      
    };
  }
}
