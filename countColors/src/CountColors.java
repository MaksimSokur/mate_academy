public class CountColors {
    public int getOccurrenceCount(String[] colors, String targetColor) {
        int count = 0;
        if (colors.length == 0){
            return 0;
        }
        for (String s: colors){
            if (s.equals(targetColor)){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        CountColors newSymbol = new CountColors();
        String[]  strings = {"blue", "blue", "blue"};
        String targetColor = "blue";
        System.out.println(newSymbol.getOccurrenceCount(strings, targetColor));

    }
}
