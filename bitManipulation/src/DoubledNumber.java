public class DoubledNumber {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(getDoubledNumber(number));
        System.out.println(toBinaryString(number));
        System.out.println(isFalse(true,true,false,false));
        System.out.println(isFalse(true,false,true,false));
        System.out.println(isFalse(true,false,false,true));
        System.out.println(isFalse(false,true,false, true));
        System.out.println(isFalse(false,false,true,true));
        System.out.println(isFalse(false,false,false,false));
        System.out.println(isFalse(false,false,false,true));
        System.out.println(isFalse(true,true,true,true));
        System.out.println(isFalse(true,true,true,false));
    }

    public static int getDoubledNumber(int number) {
        // write code here
        return number << 1;
    }

    public static String toBinaryString(int value) {
        //Write code below this line
        //return Integer.toBinaryString(value);
        StringBuilder byteString = new StringBuilder();
        while (value != 0){
            byteString.append(value % 2);
            value = value / 2;
        }
        return byteString.reverse().toString();
        //Write code above this line
    }

    public static boolean isFalse(boolean a, boolean b, boolean c, boolean d) {
        //return a && b || c && (!d || a); // place parentheses here
            //write code below this line
            return (a ^ b && c ^ d) || (a ^ c && d ^ b);
            //write code above this line
        }
    }
