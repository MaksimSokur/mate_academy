public class FirstLastChar {
    public static String[] markStringEnds(String newString) {
        String[] strings = new String[2];
        if (newString.isEmpty()) {
            return strings;
        }
        String secondString = newString;
        StringBuilder stringBuilder = new StringBuilder(newString);

        for (int i = 0; i < newString.length(); i++){
            if(i == 0){
                stringBuilder.setCharAt( i, Character.toUpperCase(newString.charAt(i)));
            }
        }
        newString = stringBuilder.toString();
        strings[0] = newString;
        StringBuilder stringBuilder1 = new StringBuilder(secondString);
        for (int i = 0; i < secondString.length(); i++){
            if(i == newString.length()-1){
                stringBuilder1.setCharAt( i, Character.toUpperCase(secondString.charAt(i)));
            }
        }
        secondString = stringBuilder1.toString();
        strings[1] = secondString;
        return strings;
    }

        public static void main(String[] args) {
            FirstLastChar newSymbol = new FirstLastChar();
            String symbol = markStringEnds("hello")[0];
                    System.out.println(symbol);
        }
    }

