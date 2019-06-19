/*Определить, является ли число а делителем числа b*/

package lesson_3;

public class Divider {
    public static void main(String[] args) {

        double a = 100;
        double b = 1000;

        if (b%a == 0) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }
}
