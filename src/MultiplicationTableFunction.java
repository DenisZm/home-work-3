/**
 * Print Multiplication Table AxB size.
 *
 * Created by Denis on 25.10.2016.
 */
public class MultiplicationTableFunction {
    public static void main(String[] args) {
        int x = Helper.inputInt("Input A:");
        int y = Helper.inputInt("Input B:");
        System.out.println();
        printMultiplicationTable(x, y);
    }

    private static void printMultiplicationTable(int x, int y) {
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.printf("%-4d", (i * j));
            }
            System.out.print("\n");
        }
    }
}
