import java.sql.Array;
import java.util.Arrays;

public class MatrixD {

    public static void main(String[] args) {
        int[][] mat = {{-2, 31, 6, 7}, {15, -42, 1, 0}, {9, -7, 12, 19}, {}};


        System.out.println(Arrays.toString(getDiagonal(mat)));
        System.out.println(Arrays.toString(getCounterDiagonal(mat)));
    }


    public static int[] getDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];
        int count = 0;
        for (int i = 0; matrix.length > i; i++){
            for (int j = 0; matrix.length  > j; j++){
                if(i == 0 && j == 0) { result[count] = matrix[i][j]; }
                if(i == 1 && j == 1) {count++; result[count] = matrix[i][j];}
                if(i == 2 && j == 2) {count++; result[count] = matrix[i][j];}
            }
        }
            return result;
    }

    public static int[] getCounterDiagonal(int[][] matrix) {
        int[] result = new int[matrix[0].length];
        int count = 0;
        for (int i = 0; matrix.length > i; i++){
            for (int j = 0; matrix.length > j; j++){
                if (i == 0 && j == (matrix[i].length - 1) /2) { result[count] = matrix[i][j];}
            }
        }
        return result;
    }
}
