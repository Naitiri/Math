/*
Написать программу, которая бы решала уравнение вида a x + b = 0
        Переменные a и b можно задать вручную. Далее нужно будет посчитать и вывести
        значение “х”. Программа должна также учитывать варианты, когда или а = 0 или b = 0
*/

package lesson_3;

public class task_6 {
    public static void main(String[] args) {

        double a = 2;
        double b = 0;
        double x;

        if (a == 0) {
            b = 0;
            x = 0;

        } else if (b == 0) {
            x = 0;

        } else {
            double y = 0 - b;
            x = y/a;

        }

        System.out.println(x);
        System.out.println(a * x + b == 0);
    }
}
