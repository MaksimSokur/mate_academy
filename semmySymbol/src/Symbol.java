public class Symbol {

    public String getMidleCharacter(String newString){
        if (newString.isEmpty()){
            return newString;
        }
        char[] chars = newString.toCharArray();
        char myChar;
        char secondChar;
        String plusLater = new String();
        if ((chars.length) % 2 != 0){
            myChar = newString.charAt(chars.length/2);
            return String.valueOf(myChar);
        }else
            myChar = newString.charAt((chars.length - 1) /2);
            int index = (chars.length - 1) / 2 + 1;
            secondChar = newString.charAt(index);
            newString = newString.valueOf(myChar) + plusLater.valueOf(secondChar);
        return newString;
    }


    public static void main(String[] args) {
        Symbol newSymbol = new Symbol();
        String symbol = "";
        System.out.println(newSymbol.getMidleCharacter(symbol));

    }
}
