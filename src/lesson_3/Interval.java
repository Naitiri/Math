/*Проверить, принадлежит ли число введенное с клавиатуры, интервалу (-5;3).*/

package lesson_3;

public class Interval {
    public static void main(String[] args) {

        double a = 3;

        if ( a >= -5 && a <= 3) {

            System.out.println("Yes");
        } else {

            System.out.println("No");
        }
    }
}
