package TestNGProgram;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day7_Multiply {
  @Test
  @Parameters({"val1","val2"})
  public void Mul(int v1, int v2) {
	 int finalmul=v1 * v2;
	 System.out.println("final Multiplication is "+finalmul);

}
  @Test
  @Parameters({"val1","val2"})
  public void Div(int v1, int v2) {
	 int finaldiv=v1 / v2;
	 System.out.println("final Division is "+finaldiv);

}
}
