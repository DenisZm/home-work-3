/**
 * Calculate Right Triangle Area.
 *
 * Created by Denis on 25.10.2016.
 */
public class RightTriangleArea {
    public static void main(String[] args) {
        int a = Helper.inputInt("Input A side:");
        int b = Helper.inputInt("Input B side:");
        System.out.println();
        System.out.printf("Area of triangle is: %s%n", area(a, b));
    }

    private static float area(int a, int b) {
        return (float) a * b / 2;
    }
}
