import java.util.Arrays;

public class Printer {

    public static String print(String message) {
        return message;
    }

    public static String print(int number) {
        return Integer.toString(number);
    }

    public static String print(double number) {
        return String.valueOf(number);
    }

    public static String print(String message, int number) {
        return message + " and " + Integer.toString(number);
    }

    public static String print(String[] message){
        return Arrays.toString(message);
    }


    public static void main(String[] args) {
        Printer printer = new Printer();
        System.out.println(print(123));
        System.out.println(print("Name"));
        System.out.println(print(12.3));
        System.out.println(print("My age is ", 34));
        System.out.println(print(new String[]{"asd]", "sdf", "123", "ds"}));
    }

}
