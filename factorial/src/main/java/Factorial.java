public class Factorial {
  public int getFactorial(int number) {
    //write your code here
    if (number > 1) {
      return number * getFactorial(number - 1);
    }
    return 1;
  }
}