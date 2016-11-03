/**
 * Create random 2D array.
 * Calculate sums of rows in 2D array.
 *
 * Created by Denis on 26.10.2016.
 */

public class Array2 {
    private static int START_RAND = -10;
    private static int END_RAND = 10;

    public static void main(String[] args) {
        int n = (int) Helper.inputDouble("Array width :");
        int m = (int) Helper.inputDouble("Array height:");
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Helper.createRandomArray(arr[i].length, START_RAND, END_RAND);
        }

        System.out.println("Array:");
        for (int[] anArr : arr) {
            Helper.printArray(anArr);
            System.out.println();
        }

        System.out.println("Row sums:");
        int[] sum = Helper.sumArrayRows(arr);
        Helper.printArray(sum);
    }
}
