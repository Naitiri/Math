/*Определить, является ли треугольник со сторонами a, b, c равнобедренным*/

package lesson_3;

public class isoscelesTriangle {
    public static void main(String[] args) {

        double a = 7;
        double b = 5;
        double c = 7;

        if ( a == b || b == c || a == c) {

            System.out.println("It is isosceles triangle");
        } else {

            System.out.println("No");
        }
    }
}
