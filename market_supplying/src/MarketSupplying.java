import java.util.HashMap;
import java.util.Map;

public class MarketSupplying {
    public static Map<String, Integer> supplyFruits(Map<String, Integer> storage, int supply) {
        //write your code here
        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> entrySet : storage.entrySet()) {
            newMap.put(entrySet.getKey(), entrySet.getValue() + supply);
        }
        return newMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Plum", 23);
        stringIntegerMap.put("Orange", 25);
        stringIntegerMap.put("Apple", 30);
        stringIntegerMap.put("Grape", 10);
        stringIntegerMap.put("Pear", 53);
        stringIntegerMap.put("Bannana", 20);

        System.out.println(supplyFruits(stringIntegerMap, 10));
    }
}


