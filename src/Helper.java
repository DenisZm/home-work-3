import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Helper Class for common functions.
 *
 * Created by Denis on 25.10.2016.
 **/

class Helper {

    static double inputDouble(String prompt) {
        while (true) {
            System.out.print(prompt + " ");
            try {
                Scanner in = new Scanner(System.in);
                return in.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.println("Please input digit");
            }
        }
    }

    static void printArray(int[] arr) {
        for (int x: arr) {
            System.out.printf("%4d", x);
        }
    }

    static int[] createRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n);
        }
        return arr;
    }

    static int[] createRandomArray(int size, int start, int end) {
        int range = end - start;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * range) + start;
        }
        return arr;
    }


    static int findMinInArray(int[] arr) {
        int min = arr[0];

        for (int anArr : arr) {
            if (min > anArr) {
                min = anArr;
            }
        }
        return min;
    }

    static int[] sumArrayRows(int[][] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                result[i] += arr[i][j];
            }
        }
        return result;
    }

}