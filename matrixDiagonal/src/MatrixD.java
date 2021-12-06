import java.sql.Array;
import java.util.Arrays;

public class MatrixD {

    public static void main(String[] args) {
        //int[][] mat = {{-2, 31, 6, 7}, {15, -42, 1, 0}, {9, -7, 12, 19}, {55, 34, 1, -10}};
        int[][] mat = {{-2}};

        System.out.println(Arrays.toString(getDiagonal(mat)));
        System.out.println(Arrays.toString(getCounterDiagonal(mat)));
    }


    public static int[] getDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];
        int count = 0;
        for (int i = 0; matrix.length > i; i++){
            for (int j = 0; matrix.length > j; j++){
                if (i == count && j == count) { result[count] = matrix[i][j]; count++;}
            }
        }
            return result;
    }

    public static int[] getCounterDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];
        int count = 0;
        int find = matrix.length - 1;
        for (int i = 0; matrix.length > i; i++){
            for (int j = matrix[i].length - 1 ; j >= 0; --j){
                if (find >= 0 ) {
                    result[count] = matrix[count][find];
                count++;
                find--;}
            }
        }
        return result;
    }
}
