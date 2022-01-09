import java.util.List;

public class ListElementsAddition {
  //write your method here
    public int calculateSum(List<Integer> integerList) {
        int sumInteger = 0;
        if (integerList == null) {
            return sumInteger;
        }
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i).equals(null)) {
                return sumInteger;
            }
            sumInteger += integerList.get(i);
        }
        return sumInteger;
    }
}
