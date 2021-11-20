public class OddChars {
    public String removeOddChars(String newString){
        if (newString.isEmpty()){
            return newString;
        }
        String myString = new String();
        char[] chars = newString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0){
                myString = myString + chars[i];
            }
        }
        return myString;
    }

    public static void main(String[] args) {
        OddChars newSymbol = new OddChars();
        String symbol = "{{{}}}";
        System.out.println(newSymbol.removeOddChars(symbol));
    }
}
