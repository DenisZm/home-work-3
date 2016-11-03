/**
 * Calculate Right Triangle Area.
 *
 * Created by Denis on 25.10.2016.
 */

public class RightTriangleArea {
    public static void main(String[] args) {
        double a = Helper.inputDouble("Input A side:");
        double b = Helper.inputDouble("Input B side:");
        System.out.println();
        System.out.printf("Area of triangle is: %.3f%n", area(a, b));
    }

    private static double area(double a, double b) {
        return  a * b / 2;
    }
}
