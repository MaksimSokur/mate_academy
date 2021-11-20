package robotsSort;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {13, 11, -55, 3, 39, 22, -1, -250, 113, 741, 49};
        int divider = 2;

            int[] result = new int[numbers.length];
            int x = 0;
            for (int i = 0; i < numbers.length; ++i){
                if (numbers[i] % divider == 0 && numbers[i] > 0){
                    result[x] = numbers[i];
                    ++x;
                }
            }
        for (int i: result){
            if (i > 0)
            System.out.println(i);
        }

        }
    }

