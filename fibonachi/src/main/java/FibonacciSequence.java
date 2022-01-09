public class FibonacciSequence {
  public int getFibonacciNumber(int n) {
    //write your code here
    if (n <= 1) {
      return n;
    }
    return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
  }
}