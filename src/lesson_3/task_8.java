/*Написать программу, которая бы решала квадратное уравнение вида a x2+b x+c = 0
        Переменный a, b, c можно задать вручную. Программа должна учитывать варианты:
        1) когда a=0
        2) когда дискриминант < 0 - решений нет
        3) когда дискриминант = 0 - тогда х1 == х2
        4) когда дискриминант > 0 - тогда в уравнении два корня*/

package lesson_3;

public class task_8 {
    public static void main(String[] args) {

        double a = 3;
        double b = 4;
        double c = 5;
        double x;
        double d;

        if (a == 0) {


        } else {
            d = b * b + 4 * a * c;

            if (d < 0) {

            } else if (d == 0) {

            } else {
                x = (- b + Math.sqrt(d)) / 2 * a;
            }

        }

        System.out.println(x);
        System.out.println(a * (x * x) + b * x + c == 0);
    }
}
