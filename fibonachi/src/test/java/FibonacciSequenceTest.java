import org.junit.Assert;
import org.junit.Test;

public class FibonacciSequenceTest {
  private static final int[] FIBONACCI_SEQUENCE = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
    233, 377, 610, 987, 1597, 2584, 4181};

  @Test
  public void getFibonacciSequence() {
    FibonacciSequence sequence = new FibonacciSequence();
    for (int i = 0; i < 20; i++) {
      int actualResult = sequence.getFibonacciNumber(i);
      int expectedResult = FIBONACCI_SEQUENCE[i];
      Assert.assertEquals(
        String.format("Test failed for input %d \n", i), expectedResult, actualResult);
    }
  }
}
