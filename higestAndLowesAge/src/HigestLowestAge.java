import java.util.Arrays;

public class HigestLowestAge {
    public int[] getHighestAndLowestAge(int[] ages) {
        // write your code here
        if (ages.length == 0){
            return ages;
        }
        int maxValue = ages[0];
        int minValue = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > maxValue){
                maxValue = ages[i];
            }
        }
        for (int i = 0; i < ages.length; i++) {
            if (minValue > ages[i]){
                minValue = ages[i];
            }
        }
        return new int[]{maxValue, minValue};
    }


    public static void main(String[] args) {
        int[] ages = {35, 35};
        HigestLowestAge age = new HigestLowestAge();

        System.out.println(Arrays.toString(age.getHighestAndLowestAge(ages)));

    }
}
