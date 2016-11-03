/**
 * Create array with random fill.
 * Find minimal in array.
 *
 * Created by Denis on 25.10.2016.
 */
public class Array1 {
    public static void main(String[] args) {
        int n = Helper.inputInt("Input array size:");
        int[] arr = Helper.createRandomArray(n);

        System.out.println("Array: ");
        Helper.printArray(arr);
        System.out.println();

        System.out.println("Minimal:");
        System.out.printf("%4d", Helper.findMinInArray(arr));
    }
}
