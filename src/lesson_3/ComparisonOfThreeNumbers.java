/*Даны три различных числа. Определить, какое из них (первое, второе или третье)
самое большое
самое маленькое
является средним
*/

package lesson_3;

public class ComparisonOfThreeNumbers {
    public static void main(String[] args) {

        double a = 12;
        double b = 25;
        double c = 31;

        if ( a > b && a > c) {
            System.out.println("Число а наибольшее");

            if (b < c) {
                System.out.println("Число c среднее");
                System.out.println("Число b наименьшее");

            } else {
                System.out.println("Число b среднее");
                System.out.println("Число c наименьшее");

            }

        } else if (b > a && b > c){
            System.out.println("Число b наибольшее");

            if (a < c) {
                System.out.println("Число c среднее");
                System.out.println("Число a наименьшее");

            } else {
                System.out.println("Число a среднее");
                System.out.println("Число c наименьшее");

            }

        } else {
            System.out.println("Число c наибольшее");

            if (a < b) {
                System.out.println("Число b среднее");
                System.out.println("Число a наименьшее");

            } else {
                System.out.println("Число a среднее");
                System.out.println("Число b наименьшее");

            }
        }
    }
}
