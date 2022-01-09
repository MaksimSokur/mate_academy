import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

  @Test
  public void getFactorialOk() {
    Factorial factorial = new Factorial();
    for (int i = 0; i <= 20; i++) {
      int expected = getFactorialExpected(i);
      int actual = factorial.getFactorial(i);
      Assert.assertEquals(String.format("Test failed for input %d \n", i), expected, actual);
    }
  }

  private int getFactorialExpected(int number) {
    if (number > 1) {
      return number * getFactorialExpected(number - 1);
    }
    return 1;
  }
}
