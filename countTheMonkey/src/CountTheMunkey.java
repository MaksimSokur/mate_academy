import java.util.Arrays;

public class CountTheMunkey {
    public int[] countTheMonkeys(int count) {
        // write your code here
        int[] monkey = new int[count];
        if (monkey.length == 0){
            return monkey;
        }
        for (int i = 0; i < monkey.length; ++i) {
            monkey[i] = 1 + i;
        }
        return monkey;
    }

    public static void main(String[] args) {
        int monkey = 10;
        CountTheMunkey munkey = new CountTheMunkey();

        System.out.println(Arrays.toString(munkey.countTheMonkeys(monkey)));

    }
}
