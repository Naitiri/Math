/*Написать программу, которая бы решала квадратное уравнение вида a x2+b x+c = 0
        Переменный a, b, c можно задать вручную. Программа должна учитывать варианты:
        1) когда a=0
        2) когда дискриминант < 0 - решений нет
        3) когда дискриминант = 0 - тогда х1 == х2
        4) когда дискриминант > 0 - тогда в уравнении два корня*/

package lesson_3;

public class task_8 {
    public static void main(String[] args) {

        double a = 8;
        double b = 18;
        double c = 9;
        double x1 = 0;
        double x2 = 0;
        double discriminant;

        if (a == 0) {
            x1 = -c /b;

            System.out.println(x1);
            System.out.println(a * Math.pow(x1, 2) + b * x1 + c == 0);

        } else {
            discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant < 0) {
                System.out.println("No root");

            } else if (discriminant == 0) {
                x1 = (- b + Math.sqrt(discriminant)) / (2 * a);

                System.out.println(x1);
                System.out.println(a * Math.pow(x1, 2) + b * x1 + c == 0);

            } else {
                x1 = (- b + Math.sqrt(discriminant)) / (2 * a);
                x2 = (- b - Math.sqrt(discriminant)) / (2 * a);

                System.out.println(x1);
                System.out.println(x2);
                System.out.println(a * Math.pow(x1, 2) + b * x1 + c == 0);
                System.out.println(a * Math.pow(x2, 2) + b * x2 + c == 0);
            }

        }
    }
}
