package TestNGProgram;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day7_OptionalTest {
  @Test
  @Parameters("massage")
  public void OP(@Optional("optional massage selected")String massage) {
	  System.out.println("massage");
  }
  @Test
  @Parameters({"val1","val2"})
  public void OP1(@Optional("10")int val1,@Optional("20")int val2) {
	  int FinalSum =val1 + val2;
	  System.out.println("Final Addition is"+FinalSum);
  }
}
